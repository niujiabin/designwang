package design.job.service;

import design.job.dao.ResumeDao;
import design.job.dao.StudentDao;
import design.job.entity.Resume;
import design.job.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ResumeServiceImpl implements ResumeService{
	@Autowired
	private ResumeDao resumeDao;
	public void addresume(Resume resume) {
		resumeDao.addResume(resume);
	}

	public void deleteresume(Resume resume) {
		resumeDao.deleteResume(resume);
	}

	public List<Map<String, Object>> queryAllresume(Resume resume) {
		return resumeDao.getAllResume();
	}

	public void updateresume(Resume resume) {
		resumeDao.updateResume(resume);
	}
}
