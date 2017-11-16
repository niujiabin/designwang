package design.job.controller;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import design.job.service.StudentServiceImpl;
@Controller  
public class PageController {  
	
	@Resource
	public StudentServiceImpl studentServiceImpl;
	
    @RequestMapping("/login")  
    public String login(Model model) {  
        model.addAttribute("msg", "controller --> login");  
        return "/loginall.jsp";
    }  
    @RequestMapping("/doLogin")
    public String  validate(
    		@RequestParam("username") String username,
    		@RequestParam("password") String password,
    		@RequestParam("usertype") String usertype,
    		Model model,HttpSession httpSession){

        //studentServiceImpl.queryLoginInfo(username,password,usertype);
        httpSession.setAttribute("username",username);


    	//登录成功 进入主界面
    	return "main";
    }
    //进入到最终后台主界面
    @RequestMapping("/goBackStage")
    public String goBackStage(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              @RequestParam("usertype") String usertype,
                              Model model,HttpSession httpSession){
        httpSession.setAttribute("username",username);

        return "backStageOper";
    }
    @RequestMapping("/pushRecrument")
    public String pushRecrument(){
        return "pushRecrument";
    }

    @RequestMapping("/checkRecrument")
    public String checkPushRecrument(){
        return "checkPushRecrument";
    }
    @RequestMapping("/gradequery")
    public String gradequery(){
        return "gradequery";
    }


/*    @ResponseBody
    @RequestMapping("/queryAllStudent")
    public List<Map<String, Object>> loadAllStudent(){
    	return studentServiceImpl.getAllStudent();
    }*/
}
