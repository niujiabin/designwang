package design.job.dao;

import java.util.List;
import java.util.Map;

import design.job.entity.Student;
import org.mybatis.spring.annotation.MapperScan;

import design.job.entity.Student;

@MapperScan
public interface StudentDao {

	/**
	 * 添加科目信息
	 * @param student
	 */
	public void addStudent(Student student);

	/**
	 * 删除科目信息
	 * @param student
	 */
	public void deleteSStudent(Student student);

	/**
	 * 查询所有科目信息
	 * @param student
	 * @return
	 */
	List<Map<String,Object>> queryAllStudent(Student student);

	/**
	 * 修改科目细小呢
	 * @param student
	 */
	void updateStudent(Student student);
}
