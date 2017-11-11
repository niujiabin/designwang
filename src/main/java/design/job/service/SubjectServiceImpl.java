package design.job.service;

import design.job.dao.SubjectDao;
import design.job.entity.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {

    @Resource
    public SubjectDao subjectDao;

    public void addSubject(Subject subject) {
        subjectDao.addSubject(subject);
    }

    public void deleteSubject(Subject subject) {
        subjectDao.deleteSSubject(subject);
    }

    public List<Map<String, Object>> queryAllSubject(Subject subject) {
        return subjectDao.queryAllSubject(subject);
    }

    public void updateSubject(Subject subject) {
        this.subjectDao.updateSubject(subject);
    }
}
