<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/11/9
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <META HTTP-EQUIV="pragma" CONTENT="no-cache">
    <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate">
    <META HTTP-EQUIV="expires" CONTENT="0">
    <script src="./static/pushRecrument.js" type="text/javascript"></script>

</head>
<body>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>招聘信息</legend>
</fieldset>
<!-- 增加招聘信息-->
<form class="layui-form" action="" id="rform" method="post">
    <div class="layui-form-item">

        <div class="layui-inline">
            <label class="layui-form-label">职位名称</label>
            <div class="layui-input-inline">
                <input type="text" name="jobName" lay-verify="title" autocomplete="off" placeholder="请输入职位名称" class="layui-input">
            </div>
        </div>


        <div class="layui-inline">
            <label class="layui-form-label">招聘人数</label>
            <div class="layui-input-inline">
                <input type="text" name="" lay-verify="" placeholder="请输入招聘人数" autocomplete="off" class="layui-input">
            </div>
        </div>

    </div>


    <div class="layui-form-item">

        <div class="layui-inline">
            <label class="layui-form-label">公司名称</label>
            <div class="layui-input-inline">
                <input type="tel" name="" lay-verify="" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">工作地点</label>
            <div class="layui-input-inline">
                <input type="tel" name="" lay-verify="" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">公司行业</label>
            <div class="layui-input-inline">
                <input type="text" name="" lay-verify="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">公司规模</label>
            <div class="layui-input-inline">
                <input type="text" name="" id="" lay-verify="" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">公司类型</label>
            <div class="layui-input-inline">
                <input type="tel" name="" lay-verify="" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">职位类别</label>
        <div class="layui-input-inline">
        </div>

    </div>

    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">职位描述</label>
        <div class="layui-input-block">
            <textarea class="layui-textarea layui-hide" name="" lay-verify="content" id="LAY_demo_editor"></textarea>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <inpyt type="button" class="layui-btn" id="subm" >立即提交</inpyt>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

</form>
</body>
<script >
    layui.use(['form', 'layedit', 'laydate'], function() {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //监听提交
 /*       form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });
*/
    });
 //   var  path=getRootPath();
/*    $(function(){
        $("#subm").on("click",function(){
            var url  = path+"/addRecrumentInfo";
            $.post(url,$("#rform").serialize(),function(data) {

                layer.open({
                    content: "增加成功" //注意，如果str是object，那么需要字符拼接。
                });
            });
        });
    });*/
</script>
</html>
