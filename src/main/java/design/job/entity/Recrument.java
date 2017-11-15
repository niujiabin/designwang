package design.job.entity;

/**
 * 招聘信息表
 */
public class Recrument {

    public int id;

    public String jobName;

    public String companyName;

    public String companyType;

    public String companyBig;

    public String jobType;

    public String jobInfo;

    public String person;

    public String workplace;

    public String companyMainDo;


    public String isHandle;

    public String getIsHandle() {
        return isHandle;
    }

    public void setIsHandle(String isHandle) {
        this.isHandle = isHandle;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBig() {
        return companyBig;
    }

    public void setCompanyBig(String companyBig) {
        this.companyBig = companyBig;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getCompanyMainDo() {
        return companyMainDo;
    }

    public void setCompanyMainDo(String companyMainDo) {
        this.companyMainDo = companyMainDo;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
