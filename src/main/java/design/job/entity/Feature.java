package design.job.entity;

/**
 *就业 特征表
 * @author yaphetsBin
 *
 */
public class Feature {

	//性别
	public String sex;
	
	//期望的城市
	public String expectCity;
	
	//期望岗位
	public int epid;
	
	//期望月薪水
	public Integer expectSalary;
	
	//专业
	public String professional;
	
	//国籍
	public String nationality;
	
	//主要会的技能1
	public String mainSkillOne;
	
	//主要会的技能2
	public String mainSkillSecond;
	
	//学习成绩前百分比
	public Integer scoreratio;
	
	
	//确认就业的企业
	public int cid;
	
	//确认的岗位
	public int pid;

	public String getSex() {
		return sex;
	}

	public String getExpectCity() {
		return expectCity;
	}

	public int getEpid() {
		return epid;
	}

	public Integer getExpectSalary() {
		return expectSalary;
	}

	public String getProfessional() {
		return professional;
	}

	public String getNationality() {
		return nationality;
	}

	public String getMainSkillOne() {
		return mainSkillOne;
	}

	public String getMainSkillSecond() {
		return mainSkillSecond;
	}

	public Integer getScoreratio() {
		return scoreratio;
	}

	public int getCid() {
		return cid;
	}

	public int getPid() {
		return pid;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setExpectCity(String expectCity) {
		this.expectCity = expectCity;
	}

	public void setEpid(int epid) {
		this.epid = epid;
	}

	public void setExpectSalary(Integer expectSalary) {
		this.expectSalary = expectSalary;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setMainSkillOne(String mainSkillOne) {
		this.mainSkillOne = mainSkillOne;
	}

	public void setMainSkillSecond(String mainSkillSecond) {
		this.mainSkillSecond = mainSkillSecond;
	}

	public void setScoreratio(Integer scoreratio) {
		this.scoreratio = scoreratio;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
}
