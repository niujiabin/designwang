package design.job.controller;

import design.job.entity.Recrument;
import design.job.entity.Subject;
import design.job.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class SubjectController {

    @Resource
    public SubjectService subjectService;

    @RequestMapping(value = "/editSubject")
    public String editSubject(){
        return "subject";
    }

    @ResponseBody
    @RequestMapping(value="/subjectList")
    public JsonResult subjectList(Subject subject){

        List<Map<String,Object>> ls =  subjectService.queryAllSubject(subject);
        JsonResult tb = new JsonResult();
        tb.setCode("0");
        tb.setMsg("");
        tb.setCount(ls.size());
        tb.setData(ls);
        //登录成功 进入主界面
        return  tb;
    }

    @ResponseBody
    @RequestMapping(value="/updateSubject",method = RequestMethod.POST)
    public String updateSubject(Subject subject){

        this.subjectService.updateSubject(subject);
        return "success";
    }

}
