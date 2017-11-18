package design.job.controller;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import design.job.entity.Company;
import design.job.entity.Student;
import design.job.service.CompanyService;
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

	@Resource
    public CompanyService companyService;


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
    @RequestMapping("/question")
    public String question(){
        return "question";
    }

    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          @RequestParam(value = "address",required = false) String address,
                          @RequestParam(value = "sex",required = false) String sex,
                          @RequestParam(value = "name",required = true) String name,
                          @RequestParam("usertype") String usertype){

        if(usertype!=null && "company".equals(usertype)){
            Company c = new Company();
            c.setAddress("");
            c.setUsername(username);
            c.setPassword(password);
            c.setAddress(address);
            c.setName(name);
            companyService.addCompany(c);
        }
        else if(usertype!=null && "student".equals(usertype)){
            Student s = new Student();
            s.setUsername(username);
            s.setPassword(password);
            s.setName(name);
            s.setSex(sex);
            studentServiceImpl.addStudent(s);
        }

        return "success";
    }

/*    @ResponseBody
    @RequestMapping("/queryAllStudent")
    public List<Map<String, Object>> loadAllStudent(){
    	return studentServiceImpl.getAllStudent();
    }*/
}
