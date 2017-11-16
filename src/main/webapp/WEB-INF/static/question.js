var $;
layui.use(['jquery', 'layer','table','form'], function() {
     $ = layui.$ //重点处
        , layer = layui.layer;


});
layui.use('layim', function(layim){

    //建立WebSocket通讯
    //注意：如果你要兼容ie8+，建议你采用 socket.io 的版本。下面是以原生WS为例

    layim.config({
        brief: false //是否简约模式（如果true则不显示主面板）
        ,uploadImage: {
        url: '' //接口地址
            ,type: 'post' //默认post
        },
        //获取主列表信息
        init: {
            url:getRootPath() + '/companyAllList' //接口地址（返回的数据格式见下文）
            ,type: 'get' //默认get，一般可不填
            ,data: {} //额外参数
        }

    }).chat({
        name: '客服姐姐'
        ,type: 'friend'
        ,avatar: 'http://tp1.sinaimg.cn/5619439268/180/40030060651/1'
        ,id: -2
    });

    var socket = new WebSocket('ws://localhost:8080/'+getRootPath()+'/echo.ws');

    //发送一个消息
    //socket.send('Hi Server, I am LayIM!');
   // codelayui.code
//更多情况下，一般是传递一个JSON
   /* socket.send(JSON.stringify({
        type: '' //随便定义，用于在服务端区分消息类型
        ,data: {}
    }));*/
    //连接成功时触发
    socket.onopen = function(){
        socket.send('XXX连接成功');
    };

    //监听收到的消息
    socket.onmessage = function(res){
        //res为接受到的值，如 {"emit": "messageName", "data": {}}
        //emit即为发出的事件名，用于区分不同的消息
    };

    //另外还有onclose、onerror，分别是在链接关闭和出错时触发。

    //基本上常用的就上面几个了，是不是非一般的简单？


});