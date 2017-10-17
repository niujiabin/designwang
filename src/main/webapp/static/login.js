
var  path=getRootPath();
Zepto(function($){
  
	/*$("#login").on("click",function(){
		login();
	});
	
	
	function login(){
		
		var url  =path+"/doLogin";
		var postData = "username=njb";
		$.post(url,postData,function(data){
			
			
		});
	}*/
});

function getRootPath(){
	var strPath = window.location.pathname;
	var postPath = strPath.substring(0,strPath.substr(1).indexOf('/') + 1);
	return postPath;
}
