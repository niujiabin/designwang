var $;
layui.use(['jquery', 'layer'], function() {
     $ = layui.$ //重点处
        , layer = layui.layer;



});
layui.use('table', function(){
    var table = layui.table;
    //执行渲染
    table.render({
        elem: '#a', //指定原始表格元素选择器（推荐id选择器）
        url:'/Design/recrumentList',
        page:true,
        id:'test3',
        height: 500, //容器高度
        // ,cols: [[{field:'id',field:'jobName'}]] //设置表头
        cols:  [[ //标题栏
            //{edit:'test3'},
            {field: 'id', title: 'ID', width: 80}
            ,{field: 'jobName', title: '职位名称', width: 120,edit:true}
            ,{field: 'companyName', title: '公司名称', width: 120,edit:true}
            ,{field: 'jobInfo', title: '职位描述', width: 120,edit:true}
            ,{field: 'jobType', title: '职位类别', width: 120,edit:true}
            ,{field: 'person', title: '招聘人数', width: 120,edit:true}
            ,{field: 'workplace', title: '工作地点', width: 120,edit:true}
            ,{field: 'companyBig', title: '公司规模', width: 120,edit:true}
            ,{field: 'companyType', title: '公司类型', width: 120,edit:true}
            ,{field: 'companyMainDo', title: '公司行业', width: 200,edit:true}
            ,{fixed: 'right', width:150, align:'center', toolbar: '#barDemo'} //这里的toolbar值是模板元素的选择器
        ]]
    });

    //监听单元格编辑
   table.on('edit(test3)', function(obj){
        var value = obj.value //得到修改后的值
            ,dataTd = obj.data //得到所在行所有键值
            ,field = obj.field; //得到字段

       //直接更改字段
      var postData="id="+dataTd.id+"&"+field+"="+value;
       $.post("/Design/updateRecrument",postData,function(data){
           layer.msg('[ID: '+ dataTd.id +'] ' + field + ' 字段更改为：'+ value);
       });

    });

    /**
     * 监听工具条
     */
    //监听工具条
    table.on('tool(test3)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值
        var tr = obj.tr; //获得当前行 tr 的DOM对象

        if(layEvent === 'detail'){ //查看
            //do somehing
        } else if(layEvent === 'del'){ //删除
            layer.confirm('真的删除行么', function(index){
                obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
                //向服务端发送删除指令
                var postData="id="+data.id;
                $.post("/Design/deleteRecrument",postData,function(d){
                    layer.msg('[ID: '+ data.id +'] ' + '已删除');
                });

            });
        } else if(layEvent === 'edit'){ //编辑
            //do something

            //同步更新缓存对应的值
            obj.update({
                username: '123'
                ,title: 'xxx'
            });
        }
    });
});