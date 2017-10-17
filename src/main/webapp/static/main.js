
var  path=getRootPath();
Zepto(function($){
	//加载所有学生信息
	queryStudentsInfo();

	function queryStudentsInfo(){
		
		var url  = path+"/queryAllStudent";
		$.post(url,function(data){
			var list = eval(data);
			var length = list.length;
			var sTable = $("#stable tbody");
			sTable.empty();
			var $tr = "";
			for(var i=0;i<length;i++){
				$tr+="<tr>" +
						"<td>"+list[i].专业+"</td>" +
						"<td>"+list[i].期望的月薪水+"</td>" +
						"<td>"+list[i].性别+"</td>" +
						"<td>"+list[i].学习成绩前百分比+"</td>" +
						"<td>"+list[i].期望的城市+"</td>" +
						"<td>"+list[i].已入职公司+"</td>" +
						"<td>"+list[i].国籍+"</td>" +
						"<td>"+list[i].期望岗位+"</td>" +	
						"<td>"+list[i].主要会的技能1+"</td>" +
						"<td>"+list[i].主要会的技能2+"</td>"
						+"</tr>";
			}
			sTable.append($tr);
		});
	}
});

function getRootPath(){
	var strPath = window.location.pathname;
	var postPath = strPath.substring(0,strPath.substr(1).indexOf('/') + 1);
	return postPath;
}
