<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./static/zepto.min.js" type="text/javascript"></script>
<script src="./static/main.js" type="text/javascript"></script>
<script src="./static/layui/layui.js" type="text/javascript"></script>
<link href="./static/layui/css/layui.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>学生、企业信息</title>
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
<table class="layui-table" id="stable">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
    <!-- 性别 期望的城市 期望岗位 期望月薪水 专业 国籍 主要会的技能1 主要会的技能2 学习成绩前百分比 已入职公司 -->
      <th>性别</th>
      <th>期望的城市</th>
      <th>期望岗位</th>
      <th>期望月薪水</th>
      <th>专业</th>
      <th>国籍</th>
      <th>主要会的技能1</th>
      <th>主要会的技能2</th>
      <th>学习成绩前百分比</th>
      <th>已入职公司</th>
    </tr> 
  </thead>
  <tbody>

	
  </tbody>
</table>
</body>
</html>