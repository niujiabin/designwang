package design.job.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import design.job.dao.StudentDao;
import design.job.entity.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Resource
	private StudentDao studentDao;


	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	public void deleteStudent(Student student) {
	studentDao.deleteSStudent(student);
	}

	public List<Map<String, Object>> queryAllStudent(Student student) {
		return studentDao.queryAllStudent(student);
	}

	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}
}
