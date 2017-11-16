package design.job.controller;

import java.util.List;
import java.util.Map;

public class WSFriend {

    public  String groupname = "公司咨询人";
    public  int id = 1;

    public List<Map<String,Object>> list ;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }
}
