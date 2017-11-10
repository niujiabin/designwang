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
                        <dd><a href="javascript:;">科目管理</a></dd>
                        <dd><a href="javascript:;">成绩管理</a></dd>
                        <dd><a href="javascript:;">就业分析</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">学生信息管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">成绩查询</a></dd>
                        <dd><a href="javascript:;">简历管理类</a></dd>
                        <dd><a href="javascript:;">就业分析</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body"  id="mainLoadDiv">
        <!-- 内容主体区域 -->
        <%--<div style="padding: 15px;">内容主体区域</div>--%>
        <table class="layui-table" id="a" <%--lay-data="{height:313, url:'/Design/recrumentList', page:true, id:'test3'}"--%> lay-filter="test3">
        </table>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>

<script>
    var  path=getRootPath();
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;


    });
    //主动加载jquery模块
    layui.use(['jquery', 'layer'], function(){
        var $ = layui.$ //重点处
            ,layer = layui.layer;

        $.ajaxSetup ({
            cache: false //关闭AJAX相应的缓存
        });

        $("#pushRecrus").on("click",function(){
           // alert("aaa");
          //  $.ajaxSetup ({ cache: false });
            $.post(path+"/pushRecrument","random="+Math.random(),function(data){
                //alert("aaa");
                $("#mainLoadDiv").empty();
                $("#mainLoadDiv").html(data);
           //     $.ajaxSetup ({ cache: true });
            },"html");
        });
        $("#editRecrument").on("click",function(){
          //  $.ajaxSetup ({ cache: false });
            $.post(path+"/editRecrument","random="+Math.random(),function(data){
                //alert("aaaff");
                $("#mainLoadDiv").empty();
                $("#mainLoadDiv").html(data);
             //   $.ajaxSetup ({ cache: true });
            },"html");
        });


        //后面就跟你平时使用jQuery一样
        //$('body').append('hello jquery');
    });
    function getRootPath(){
        var strPath = window.location.pathname;
        var postPath = strPath.substring(0,strPath.substr(1).indexOf('/') + 1);
        return postPath;
    }

</script>
</body>
</html>