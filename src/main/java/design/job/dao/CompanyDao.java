package design.job.dao;

import design.job.entity.Company;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface CompanyDao {

	/**
	 * 添加科目信息
	 * @param company
	 */
	public void addCompany(Company company);

	/**
	 * 删除科目信息
	 * @param company
	 */
	public void deleteCompany(Company company);

	/**
	 * 查询所有科目信息
	 * @param company
	 * @return
	 */
	List<Map<String,Object>> queryAllCompany(Company company);

	/**
	 * 修改科目细小呢
	 * @param company
	 */
	void updateCompany(Company company);
}
