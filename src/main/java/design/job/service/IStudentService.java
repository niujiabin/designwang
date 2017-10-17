package design.job.service;

import java.util.List;
import java.util.Map;

import design.job.entity.Student;

public interface IStudentService {

	public Student getStudent(int id);
	
	/**
	 * 获取所有的学生
	 * @return
	 */
	public List<Map<String,Object>> getAllStudent();
}
