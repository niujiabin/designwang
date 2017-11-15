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
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-block">
                        <input type="text" name="name" lay-verify="name" autocomplete="off" placeholder="请输入姓名" class="layui-input" style="width:150px;">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">性别</label>
                    <div class="layui-input-block">
                        <input type="radio" name="sex" value="男" title="男" checked>
                        <input type="radio" name="sex" value="女" title="女">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">电话</label>
                    <div class="layui-input-block">
                        <input type="text" name="name" lay-verify="" placeholder="请输入电话" autocomplete="off" class="layui-input" style="width:150px;">
                    </div>
                </div>
                <!-- 密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">邮箱</label>
                    <div class="layui-input-block">
                        <input type="text" name="name" lay-verify="" placeholder="请输入邮箱" autocomplete="off" class="layui-input" style="width:150px;">
                    </div>
                </div>

                <!-- 密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">教育背景</label>
                    <div class="layui-input-block">
                        <textarea  name="eduBackGround" lay-verify="" placeholder="请输入教育背景" autocomplete="off" class="layui-input" style="width:300px;">

                        </textarea>
                    </div>
                </div>
                <!-- 密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">专业技能</label>
                    <div class="layui-input-block">
                        <textarea  name="skills" lay-verify="" placeholder="请输入专业技能" autocomplete="off" class="layui-input" style="width:300px;">

                        </textarea>
                    </div>
                </div>
                <!-- 密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">在校实践</label>
                    <div class="layui-input-block">
                        <textarea  name="schoolActivity" lay-verify="" placeholder="请输入在校时实践内容" autocomplete="off" class="layui-input" style="width:300px;">

                        </textarea>
                    </div>
                </div>

                <!-- 密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">爱好</label>
                    <div class="layui-input-block">
                        <textarea  name="hobby" lay-verify="" placeholder="请输入爱好" autocomplete="off" class="layui-input" style="width:300px;">

                        </textarea>
                    </div>
                </div>

                <!-- 密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">目标岗位</label>
                    <div class="layui-input-block">
                        <textarea  name="targetStation" lay-verify="" placeholder="请输入目标岗位" autocomplete="off" class="layui-input" style="width:300px;">

                        </textarea>
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