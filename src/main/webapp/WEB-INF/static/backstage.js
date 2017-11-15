
var  path=getRootPath();
$(function(){

    $("#pushRecrus").on("click",function(){
        $.post(path+"/pushRecrument","random="+Math.random(),function(data){
            $("#mainLoadDiv").html(data);
        },"html");


    });
    $("#editRecrument").on("click",function(){
        $.post(path+"/editRecrument","random="+Math.random(),function(data){
            $("#mainLoadDiv").html(data);
        },"html");
    });


});

function getRootPath(){
    var strPath = window.location.pathname;
    var postPath = strPath.substring(0,strPath.substr(1).indexOf('/') + 1);
    return postPath;
}
