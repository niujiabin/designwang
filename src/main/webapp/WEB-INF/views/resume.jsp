<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/11/9
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <META HTTP-EQUIV="pragma" CONTENT="no-cache">
    <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate">
    <META HTTP-EQUIV="expires" CONTENT="0">
   <%-- <link href="./static/layui/css/layui.css" rel="stylesheet">--%>
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<table class="layui-table" id="resume" <%--lay-data="{height:313, url:'/Design/recrumentList', page:true, id:'test3'}"--%> lay-filter="resume1">

</table>
<button class="layui-btn layui-btn-normal" id="addresume">增加简历</button>
<script type="text/html" id="resumebar">
    <a class="layui-btn layui-btn-mini" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
</script>
<div id="sudentinfo" style="display: none;">
<div class=""   style="border:1px solid #ccc;">
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">增加简历信息</h2>
        <div class="layui-colla-content layui-show">
            <form class="layui-form" id="resumeInfoForm">
                <!-- 用户名 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">用户名</label>
                    <div class="layui-input-block">
                        <input type="text" name="username" lay-verify="phone" autocomplete="off" placeholder="请输入用户名" class="layui-input" style="width:150px;">
                    </div>
                </div>
                <!-- 密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">密码</label>
                    <div class="layui-input-block">
                        <input type="password" name="password" lay-verify="password" placeholder="请输入密码" autocomplete="off" class="layui-input" style="width:150px;">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-block">
                        <input type="text" name="name" lay-verify="" placeholder="请输入简历姓名" autocomplete="off" class="layui-input" style="width:150px;">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">性别</label>
                    <div class="layui-input-block">
                        <input type="radio" name="sex" value="男" title="男" checked>
                        <input type="radio" name="sex" value="女" title="女">
                    </div>
                </div>

                <!-- 提交按钮 -->
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <input type="button" class="layui-btn"  lay-filter="demo1"  value="确定" id="addConfirm">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</div>
<script src="./static/resume.js" type="text/javascript"></script>
<%--<script src="./static/layui/layui.js" type="text/javascript" charset="utf-8"></script>--%>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
</body>
</html>