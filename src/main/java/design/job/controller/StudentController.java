package design.job.controller;

import design.job.entity.Student;
import design.job.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Resource
    public StudentService studentService;

    @RequestMapping(value = "/editStudent")
    public String editStudent(){
        return "student";
    }

    @ResponseBody
    @RequestMapping(value="/studentList")
    public JsonResult studentList(Student student){

        List<Map<String,Object>> ls =  studentService.queryAllStudent(student);
        JsonResult tb = new JsonResult();
        tb.setCode("0");
        tb.setMsg("");
        tb.setCount(ls.size());
        tb.setData(ls);
        //登录成功 进入主界面
        return  tb;
    }

    /**
     * update student
     * @param student
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/updateStudent",method = RequestMethod.POST)
    public String updateStudent(Student student){

        this.studentService.updateStudent(student);
        return "success";
    }

    /**
     * addstudent
     */
    @ResponseBody
    @RequestMapping(value="/addStudent",method = RequestMethod.POST)
    public String addStudent(Student student){
        this.studentService.addStudent(student);
        return "success";
    }

}
