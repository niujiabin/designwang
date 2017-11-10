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

<table class="layui-table" id="a" <%--lay-data="{height:313, url:'/Design/recrumentList', page:true, id:'test3'}"--%> lay-filter="test3">
   <%--<thead>
    <tr>
        <th lay-data="{field:'id', width:80, sort: true}">ID</th>
        <th lay-data="{field:'jobName', width:120, sort: true, edit: 'text'}">招聘岗位</th>

    </tr>
    </thead>--%>
</table>
<script src="./static/editPushRecrument.js" type="text/javascript"></script>
<%--<script src="./static/layui/layui.js" type="text/javascript" charset="utf-8"></script>--%>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
</body>
</html>
