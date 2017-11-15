package design.job.controller;

import design.job.entity.Resume;
import design.job.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class ResumeController {

    @Resource
    public ResumeService resumeService;

    @RequestMapping(value = "/editresume")
    public String editresume(){
        return "resume";
    }

    @ResponseBody
    @RequestMapping(value="/resumeList")
    public JsonResult resumeList(Resume resume){

        List<Map<String,Object>> ls =  resumeService.queryAllresume(resume);
        JsonResult tb = new JsonResult();
        tb.setCode("0");
        tb.setMsg("");
        tb.setCount(ls.size());
        tb.setData(ls);
        //登录成功 进入主界面
        return  tb;
    }

    /**
     * update resume
     * @param resume
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/updateresume",method = RequestMethod.POST)
    public String updateresume(Resume resume){

        this.resumeService.updateresume(resume);
        return "success";
    }

    /**
     * addresume
     */
    @ResponseBody
    @RequestMapping(value="/addresume",method = RequestMethod.POST)
    public String addresume(Resume resume){
        this.resumeService.addresume(resume);
        return "success";
    }
    @ResponseBody
    @RequestMapping(value="/deleteresume",method = RequestMethod.POST)
    public String deleteresume(Resume resume){
        this.resumeService.deleteresume(resume);
        return "success";
    }
}
