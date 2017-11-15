    var layerindexgrade;
    var table = layui.table;
    /**
     * 确定增加按钮   因为这个按钮是后添加进去的 所以需要绑定
     */

    $("#addConfirm").on("click",function () {
        var postData = $("#gradeInfoForm").serialize();
        var url = path +"/addGrade";
        $.post(url,postData,function(data){
            layer.msg('增加成绩成功');
            layer.close(layerindexgrade);
            //刷新列表   重新渲染列表数据
            table.reload('grade1', {
                url:path+'/gradeList'
                ,where: {} //设定异步数据接口的额外参数
                //,height: 300
            });
        })
    });

    /**
     * 根据id找学生
     */
    $("#studentno").on("keyup",function(){

        var postData = "id="+$(this).val();
        var url = path +"/studentList";
        $.post(url,postData,function(data){
            if(data.data.length>0){
                $("#studentname").val(data.data[0].name);
            }else{
                $("#studentname").val("");
            }
        });

    });

    $("#subjectid").on("keyup",function(){

        var postData = "id="+$(this).val();
        var url = path +"/subjectList";
        $.post(url,postData,function(data){
            if(data.data.length>0){
                $("#subjectname").val(data.data[0].name);
            }else{
                $("#subjectname").val("");
            }
        });

    });

    /**
     * 添加按钮事件
     */
    $("#addgrade").on("click",function(data){
         //默认prompt
        //$("#sudentinfo").show();
        layerindexgrade = layer.open({
            type: 1,
            shade: 0,
            area: '500px;',
            title:false,
            content: $("#gradeinfo"), //数组第二项即吸附元素选择器或者DOM
        });
        //重新刷新raido
        form.render();
     });

    //执行渲染
    table.render({
        elem: '#grade', //指定原始表格元素选择器（推荐id选择器）
        url:path+'/gradeList',
        page:true,
        id:'grade1',
        height: 500, //容器高度
        // ,cols: [[{field:'id',field:'jobName'}]] //设置表头
        cols:  [[ //标题栏
            //{edit:'test3'},
            {field: 'id', title: 'ID', width: 80}
            ,{field: 'subjectid', title: '成绩编号', width: 200,edit:true}
            ,{field: 'subjectname', title: '科目名称', width: 200,edit:true}
            ,{field: 'score', title: '分数', width: 200,edit:true}
            ,{field: 'studentid', title: '学生编号', width: 200,edit:true}
            ,{field: 'studentname', title: '学生姓名', width: 200,edit:true}
            ,{fixed: 'right', width:150, align:'center', toolbar: '#gradebar'} //这里的toolbar值是模板元素的选择器
        ]]
    });

    //监听单元格编辑
    table.on('edit(grade1)', function(obj){
        var value = obj.value //得到修改后的值
            ,dataTd = obj.data //得到所在行所有键值
            ,field = obj.field; //得到字段

        //直接更改字段
        var postData="id="+dataTd.id+"&"+field+"="+value;
        $.post(path+"/updateGrade",postData,function(data){
            layer.msg('[ID: '+ dataTd.id +'] ' + field + ' 字段更改为：'+ value);
        });

    });

    /**
     * 监听工具条
     */
    //监听工具条
    table.on('tool(grade1)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值
        var tr = obj.tr; //获得当前行 tr 的DOM对象


        if(layEvent === 'detail'){ //查看
            alert(layEvent);
            //do somehing
        } else if(layEvent === 'del'){ //删除
            layer.confirm('真的删除成绩信息吗', function(index){
                obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
                //向服务端发送删除指令
                var postData="id="+data.id;
                $.post(path+"/deleteGrade",postData,function(d){
                    layer.msg('[ID: '+ data.name +'] ' + '已删除');
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

