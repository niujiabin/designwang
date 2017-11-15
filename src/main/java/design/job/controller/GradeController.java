package design.job.controller;

import design.job.entity.Grade;
import design.job.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class GradeController {

    @Resource
    public GradeService gradeService;

    @RequestMapping(value = "/editGrade")
    public String editGrade(){
        return "grade";
    }

    @ResponseBody
    @RequestMapping(value="/gradeList")
    public JsonResult gradeList(Grade grade){

        List<Map<String,Object>> ls =  gradeService.queryAllGrade(grade);
        JsonResult tb = new JsonResult();
        tb.setCode("0");
        tb.setMsg("");
        tb.setCount(ls.size());
        tb.setData(ls);
        //登录成功 进入主界面
        return  tb;
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
    @RequestMapping(value="/deleteGrade",method = RequestMethod.POST)
    public String deleteGrade(Grade grade){
        this.gradeService.deleteGrade(grade);
        return "success";
    }
}
