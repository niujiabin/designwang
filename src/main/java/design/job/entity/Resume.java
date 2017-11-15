package design.job.entity;

public class Resume {
    private int id;
    private String name;
    private String sex;
    private String phoneNum;
    private String email;
    private String eduBackGround;
    private String skills;
    private String schoolActivity;
    private String hobby;
    private String targetStation;
    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEduBackGround() {
        return eduBackGround;
    }

    public void setEduBackGround(String eduBackGround) {
        this.eduBackGround = eduBackGround;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSchoolActivity() {
        return schoolActivity;
    }

    public void setSchoolActivity(String schoolActivity) {
        this.schoolActivity = schoolActivity;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getTargetStation() {
        return targetStation;
    }

    public void setTargetStation(String targetStation) {
        this.targetStation = targetStation;
    }
}
