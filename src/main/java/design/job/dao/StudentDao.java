package design.job.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import design.job.entity.Student;

@MapperScan
public interface StudentDao {

	public Student getStudent(int id);

	public List<Map<String, Object>> getAllStudent();
	
}
