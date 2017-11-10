package design.job.controller;

import design.job.entity.Recrument;
import design.job.service.RecrementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class RecrumentController {

    @Resource
    public RecrementService recrementService;


    @ResponseBody
    @RequestMapping(value="/addRecrumentInfo",method = RequestMethod.POST)
    public String  addRecrementInfo(Recrument recrument){
        //登录成功 进入主界面
        try {
            System.out.println(recrument.getJobName());
            recrementService.addRecrementInfo(recrument);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping(value="/recrumentList")
    public RecrumentTable recrumentList(Recrument recrument){

       List<Map<String,Object>> ls =  recrementService.queryRecrementInfoList(recrument);
        RecrumentTable tb = new RecrumentTable();
        tb.setCode("0");
        tb.setMsg("");
        tb.setCount(ls.size());
        tb.setData(ls);
        //登录成功 进入主界面
        return  tb;
    }

    @ResponseBody
    @RequestMapping(value="/updateRecrument")
    public String updateRecrument(Recrument recrument){

        recrementService.updateRecrument(recrument);
        return "success";
    }

    @RequestMapping("/editRecrument")
    public String editRecrument(){
        return "editPushRecrument";
    }

    public void setRecrementService(RecrementService recrementService) {
        this.recrementService = recrementService;
    }

    public RecrementService getRecrementService() {
        return recrementService;
    }


}
