package design.job.service;

import design.job.dao.GradeDao;
import design.job.entity.Grade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("gradeService")
public class GradeServiceImpl implements GradeService {

    @Resource
    public GradeDao gradeDao;

    public void addGrade(Grade grade) {
        gradeDao.addGrade(grade);
    }

    public void deleteGrade(Grade grade) {
        gradeDao.deleteGrade(grade);
    }

    public List<Map<String, Object>> queryAllGrade(Grade grade) {
        return gradeDao.queryAllGrade(grade);
    }

    public void updateGrade(Grade grade) {
        this.gradeDao.updateGrade(grade);
    }
}
