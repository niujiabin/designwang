package design.job.controller;

import java.util.List;
import java.util.Map;

//KKKKKKKKKKKKK666777
public class JsonResult {

    public String code;

    public String msg;

    public List<Map<String,Object>> data;

    public int count;

    public WSMine mine;

    public WSFriend friend;

    public WSFriend getFriend() {
        return friend;
    }

    public void setFriend(WSFriend friend) {
        this.friend = friend;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    public WSMine getMine() {
        return mine;
    }

    public void setMine(WSMine mine) {
        this.mine = mine;
    }
}
