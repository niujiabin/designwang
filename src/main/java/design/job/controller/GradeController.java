package design.job.controller;

import design.job.entity.Grade;
import design.job.entity.MySQLSetting;
import design.job.entity.Student;
import design.job.service.GradeService;
import design.job.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class GradeController {

    @Resource
    public GradeService gradeService;

    @Resource
    public StudentService studentService;

    @RequestMapping(value = "/editGrade")
    public String editGrade(){
        return "grade";
    }

    @ResponseBody
    @RequestMapping(value="/gradeList")
    public JsonResult gradeList(@RequestParam(value="usertype",required = false) String usertype, HttpSession session, Grade grade){

        if (usertype!=null && usertype.equals("student")){
            String username = (String)session.getAttribute("username");
            Student student = new Student();
            student.setUsername(username);
            List<Map<String,Object>> ls1 = studentService.queryAllStudent(student);
            grade.setStudent(Integer.valueOf(String.valueOf(ls1.get(0).get("id"))));
        }
        List<Map<String,Object>> ls =  gradeService.queryAllGrade(grade);
        JsonResult tb = new JsonResult();
        tb.setCode("0");
        tb.setMsg("");
        tb.setCount(ls.size());
        tb.setData(ls);
        //登录成功 进入主界面
        return  tb;
    }


    @ResponseBody
    @RequestMapping(value="/gradeListNoReturn")
    public String gradeListNoReturn(@RequestParam(value="usertype",required = false) String usertype, HttpSession session, MySQLSetting ms){
        gradeService.queryAllGradeAndResetMySQL(ms);
        return  "success";
    }

    @ResponseBody
    @RequestMapping(value="/gradeUpdateSetting")
    public String gradeUpdateSetting(@RequestParam(value="usertype",required = false) String usertype, HttpSession session, MySQLSetting ms){
        gradeService.gradeAndResetMySQL(ms);
        return  "success";
    }

    /**
     * update grade
     * @param grade
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/updateGrade",method = RequestMethod.POST)
    public String updateGrade(Grade grade){

        this.gradeService.updateGrade(grade);
        return "success";
    }

    /**
     * addgrade
     */
    @ResponseBody
    @RequestMapping(value="/addGrade",method = RequestMethod.POST)
    public String addGrade(Grade grade){
        this.gradeService.addGrade(grade);
        return "success";
    }

    @ResponseBody
    @RequestMapping(value="/addGradeTest")
    public String addGradeTest(Grade grade){
        this.gradeService.addGradeTest(grade);
        return "success";
    }

    @ResponseBody
    @RequestMapping(value="/deleteGrade",method = RequestMethod.POST)
    public String deleteGrade(Grade grade){
        this.gradeService.deleteGrade(grade);
        return "success";
    }
}
