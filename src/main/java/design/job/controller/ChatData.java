package design.job.controller;

import java.util.List;
import java.util.Map;

//KKKKKKKKKKKKK666777
public class ChatData {


    public WSMine mine;

    public List<WSFriend> friend;

    public List<WSFriend> getFriend() {
        return friend;
    }

    public void setFriend(List<WSFriend> friend) {
        this.friend = friend;
    }

    public WSMine getMine() {
        return mine;
    }

    public void setMine(WSMine mine) {
        this.mine = mine;
    }
}
