/**
 * 加载表单相关功能
 */
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
});

/**
 * 加载jquery 模块
 */
layui.use(['jquery', 'layer'], function() {
    var $ = layui.$ //重点处
        , layer = layui.layer;

    $("#subm").on("click",function(){
        var url  = path+"/addRecrumentInfo";
        $.post(url,$("#rform").serialize(),function(data) {

            layer.open({
                content: "增加成功" //注意，如果str是object，那么需要字符拼接。
            });
        });
    });

});