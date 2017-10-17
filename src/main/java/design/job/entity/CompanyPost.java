package design.job.entity;

/**
 * 企业岗位表
 * @author yaphetsBin
 *
 */
public class CompanyPost {

	public int pid;
	
	public int cid;
	
	public String info;

	public int getPid() {
		return pid;
	}

	public int getCid() {
		return cid;
	}

	public String getInfo() {
		return info;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
