<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./static/layui/layui.js" type="text/javascript"></script>
<link href="./static/layui/css/layui.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>学校、企业、学生登陆</title>
<script>
//注意：导航 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function(){
  var element = layui.element;
  
  //…
});
layui.use(['layer', 'form'], function(){
	  var layer = layui.layer
	  ,form = layui.form;
	  
	  /*验证用户名和密码 是否非空**/
	  form.verify({
		  'username':function(value){
			  if(value==""){
				  return "用户名不能为空";
			  }
		  },
		  "password":function(value){
			  if(value==""){
				  return "密码不能为空";
			  }
		  }
	  });
	  //layer.msg('Hello World');
	});
</script>
</head>
<body>
<div class="layui-collapse layui-col-xs12 layui-col-md3 layui-col-md-offset4 "  style="margin-top:200px;border:1px solid #ccc">
  <div class="layui-colla-item">
    <h2 class="layui-colla-title">登陆</h2>
     <div class="layui-colla-content layui-show">
			<form class="layui-form" action="goBackStage" method="post">
			     <!-- 用户名 -->
				  <div class="layui-form-item">
				   	 <label class="layui-form-label">用户名</label>
						    <div class="layui-input-block">
						        <input type="text" name="username" lay-verify="username" autocomplete="off" placeholder="请输入用户名" class="layui-input" style="width:150px;">
						      </div>
					 </div>
					 
					 <!-- 密码 -->
				    <div class="layui-form-item">
				       <label class="layui-form-label">密码</label>
				       <div class="layui-input-block">
				       <input type="password" name="password" lay-verify="password" placeholder="请输入密码" autocomplete="off" class="layui-input" style="width:150px;">
				    </div>
				    
				    <!-- 登录类型 -->
					  <div class="layui-form-item">
					    <label class="layui-form-label">用户类型</label>
					    <div class="layui-input-block">
					      <input type="radio" name="usertype" value="学校" title="学校" checked="">
					      <input type="radio" name="usertype" value="企业" title="企业">
					      <input type="radio" name="usertype" value="学生" title="学生" >
					    </div>
					  </div>
				  </div>
				  <!-- 提交按钮 -->
				    <div class="layui-form-item">
					    <div class="layui-input-block">
					      <button class="layui-btn" lay-submit="" lay-filter="demo1"  id="login">进入</button>
					      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
					    </div>
				  </div>
			  </form>
     </div>
  </div>
</div>
</body>
</html>