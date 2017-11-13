


    /**
     * 添加按钮事件
     */
    $("#addstudent").on("click",function(data){
         //默认prompt
        //$("#sudentinfo").show();
        layer.open({
            type: 1,
            shade: 0.5,
            area: '500px;',
            content: $("#sudentinfo").html(), //数组第二项即吸附元素选择器或者DOM
           /* cancel: function(){
                layer.msg('捕获就是从页面已经存在的元素上，包裹layer的结构', {time: 5000, icon:6});
            }
*/
        });
        //重新刷新raido
        form.render();
 /*       var postData="name="+val;
             $.post("/Design/addStudent",postData,function(data){
                 layer.msg('增加的科目'+val);
                 layer.close(index);
                 //刷新列表   重新渲染列表数据
                 table.reload('student1', {
                     url:'/Design/studentList'
                     ,where: {} //设定异步数据接口的额外参数
                     //,height: 300
                 });
             });*/
     });

    /**
     * 确定增加按钮
     */
    $("#addConfirm").on("click",function () {

        var postData = $("#studentInfoForm").serialize();
        var url = path +"/addStudent";
    });

    var table = layui.table;
    //执行渲染
    table.render({
        elem: '#student', //指定原始表格元素选择器（推荐id选择器）
        url:path+'/studentList',
        page:true,
        id:'student1',
        height: 500, //容器高度
        // ,cols: [[{field:'id',field:'jobName'}]] //设置表头
        cols:  [[ //标题栏
            //{edit:'test3'},
            {field: 'id', title: 'ID', width: 80}
            ,{field: 'username', title: '学生账号', width: 200,edit:true}
            ,{field: 'password', title: '密码', width: 200,edit:true}
            ,{field: 'name', title: '学生姓名', width: 200,edit:true}
            ,{fixed: 'right', width:150, align:'center', toolbar: '#studentbar'} //这里的toolbar值是模板元素的选择器
        ]]
    });

    //监听单元格编辑
    table.on('edit(student1)', function(obj){
        var value = obj.value //得到修改后的值
            ,dataTd = obj.data //得到所在行所有键值
            ,field = obj.field; //得到字段


        //直接更改字段
        var postData="id="+dataTd.id+"&"+field+"="+value;
        $.post(path+"/updateStudent",postData,function(data){
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
                $.post("/Design/deleteStudent",postData,function(d){
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

