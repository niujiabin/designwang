package design.job.controller;

import design.job.entity.Student;
import design.job.entity.Subject;
import design.job.service.StudentService;
import design.job.service.WSAboutService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ws 相关数据
 */
@Controller
public class WSAboutController {

    @Resource
    WSAboutService wsAboutService;

    @Resource
    StudentService studentService;

    @ResponseBody
    @RequestMapping(value="/companyAllList")
    public ChatResult companyAllList(HttpSession session){

        System.out.println(String.valueOf(session.getAttribute("username")));
        int sid=0;
        String name = "";
        if (session.getAttribute("username")!=null){
            Student student = new Student();
            student.setUsername(String.valueOf(session.getAttribute("username")));
            //默认是学生登录
            List<Map<String,Object>> ls1 = studentService.queryAllStudent(student);

             sid = Integer.valueOf(String.valueOf(ls1.get(0).get("id")));
             name = String.valueOf(ls1.get(0).get("name"));

        }
        List<Map<String,Object>> ls =  wsAboutService.getAllCompanyInfo();
        ChatResult tb = new ChatResult();
        //拼接我的信息
        WSMine mine = new WSMine();
        mine.setId(sid);
        mine.setUsername(name);
        mine.setAvatar("");
        mine.setSign("gogogo");
        mine.setStatus("online");
       // tb.setMine(mine);
        //拼接好友信息
        List<WSFriend> friendlist  = new ArrayList<WSFriend>();

        List<Map<String,Object>> lsnew = new ArrayList<Map<String, Object>>();


        //这里就一个组
        WSFriend friend  = new WSFriend();
        friend.setId(1);
        friend.setGroupname("公司咨询人员");
        for (int i=0;i<ls.size();i++){

            Map<String,Object> tm = ls.get(i);

            tm.put("username",tm.get("name"));
            tm.put("id",tm.get("id"));
            tm.put("status","online");
            tm.put("sign","i am "+String.valueOf(tm.get("name")));
            tm.put("avatar","");
            tm.put("groupname","");

            lsnew.add(tm);

        }
        friend.setList(lsnew);
        friendlist.add(friend);

        //tb.setFriend(friend);

        tb.setCode("0");
        tb.setMsg("");

        ChatData data = new ChatData();
        data.setFriend(friendlist);
        data.setMine(mine);
        //tb.setCount(ls.size());
        tb.setData(data);
        //登录成功 进入主界面
        return tb;
    }


}
