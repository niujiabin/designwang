package design.job.service;

import design.job.dao.GradeDao;
import design.job.entity.Grade;
import design.job.entity.MySQLSetting;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    public void gradeAndResetMySQL(MySQLSetting ms) {
        gradeDao.updateMySQLSettingMax_connections(ms.getMax_connections());
        gradeDao.updateMySQLSettingQuery_cache_size(ms.getQuery_cache_size());
        //为了放入到缓存中 需要先查一遍
        gradeDao.queryAllGradeAndResetMySQL(ms);
    }

    public void addGradeTest(Grade grade) {
        List<Grade> list = new ArrayList<Grade>();

        Grade g = null;
        for (int i=0;i<100000;i++){
            g = new Grade();
            g.setScore(20);
            g.setStudent(1);
            g.setSubject(1);
            list.add(g);
        }
        gradeDao.addGradeTest(list);
    }

    public List<Map<String, Object>> queryAllGrade(Grade grade) {
        return gradeDao.queryAllGrade(grade);
    }

    public List<Map<String, Object>> queryAllGradeAndResetMySQL(MySQLSetting ms) {
        //System.out.println(ms.getMax_connections());

        return gradeDao.queryAllGradeAndResetMySQL(ms);
    }

    public void updateGrade(Grade grade) {
        this.gradeDao.updateGrade(grade);
    }
}
