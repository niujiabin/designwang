package design.job.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import design.job.dao.StudentDao;
import design.job.entity.Student;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{

	@Resource
	private StudentDao studentDao;
	

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(id);
	}


	public List<Map<String,Object>> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

	
	
}
