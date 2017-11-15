package design.job.dao;

import design.job.entity.Grade;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface GradeDao {

	/**
	 * 添加科目信息
	 * @param grade
	 */
	public void addGrade(Grade grade);

	/**
	 * 删除科目信息
	 * @param grade
	 */
	public void deleteGrade(Grade grade);

	/**
	 * 查询所有科目信息
	 * @param grade
	 * @return
	 */
	List<Map<String,Object>> queryAllGrade(Grade grade);

	/**
	 * 修改科目细小呢
	 * @param grade
	 */
	void updateGrade(Grade grade);
}
