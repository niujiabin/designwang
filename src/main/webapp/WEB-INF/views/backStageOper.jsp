<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/11/9
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>就业信息管理系统</title>

    <%--<script src="./static/backstage.js" type="text/javascript"></script>--%>
    <script src="./static/layui/layui.js" type="text/javascript"></script>
    <link href="./static/layui/css/layui.css" rel="stylesheet">


    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">就业信息管理系统后台</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">企业招聘</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" id="pushRecrus">发布招聘</a></dd>
                        <dd><a href="javascript:;" id="editRecrument">招聘信息反馈</a></dd>
                        <dd><a href="javascript:;">简历管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">学校信息管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">审核招聘信息</a></dd>
                        <dd><a href="javascript:;" id="editSubject">科目管理</a></dd>
                        <dd><a href="javascript:;" id="editStudent">学生管理</a></dd>
                        <dd><a href="javascript:;" id="editGrade">成绩管理</a></dd>
                        <dd><a href="javascript:;">就业分析</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">学生信息管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" id="edit">成绩查询</a></dd>
                        <dd><a href="javascript:;" id="editResume">简历管理</a></dd>
                        <dd><a href="javascript:;">就业分析</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body"  id="mainLoadDiv">
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>

<script>
    var  path=getRootPath();
    //JavaScript代码区域

    //主动加载jquery模块
    var $;
    var table;
    var form;

    layui.use(['element','jquery', 'layer','table','form'], function() {
        $ = layui.$ //重点处
            , layer = layui.layer,
            table = layui.table,
            form = layui.form;

        //var form = layui.form;

        $("#pushRecrus").on("click",function(){
            $.post(path+"/pushRecrument","random="+Math.random(),function(data){
                $("#mainLoadDiv").empty();
                $("#mainLoadDiv").html(data);

            },"html");
        });
        $("#editRecrument").on("click",function(){
            $.post(path+"/editRecrument","random="+Math.random(),function(data){
                $("#mainLoadDiv").empty();
                $("#mainLoadDiv").html(data);
            },"html");
        });
        /**
         * 科目管理
         */
        $("#editSubject").on("click",function(){
            $.post(path+"/editSubject","random="+Math.random(),function(data){
                $("#mainLoadDiv").empty();
                $("#mainLoadDiv").html(data);
            },"html");
        });
        /**
         * 学生管理
         */
        $("#editStudent").on("click",function(){
            $.post(path+"/editStudent","random="+Math.random(),function(data){
                $("#mainLoadDiv").empty();
                $("#mainLoadDiv").html(data);
            },"html");
        });

        /**
         * 成绩管理
         */
        $("#editGrade").on("click",function(){
            $.post(path+"/editGrade","random="+Math.random(),function(data){
                $("#mainLoadDiv").empty();
                $("#mainLoadDiv").html(data);
            },"html");
        });

        /**
         * 简历管理
         */
        $("#editResume").on("click",function(){
            $.post(path+"/editResume","random="+Math.random(),function(data){
                $("#mainLoadDiv").empty();
                $("#mainLoadDiv").html(data);
            },"html");
        });
    });
    function getRootPath(){
        var strPath = window.location.pathname;
        var postPath = strPath.substring(0,strPath.substr(1).indexOf('/') + 1);
        return postPath;
    }

</script>
</body>
</html>