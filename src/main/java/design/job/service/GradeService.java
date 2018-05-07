package design.job.service;

import design.job.entity.Grade;
import design.job.entity.MySQLSetting;

import java.util.List;
import java.util.Map;

public interface GradeService {

    List<Map<String,Object>> queryAllGrade(Grade grade);

    List<Map<String,Object>> queryAllGradeAndResetMySQL(MySQLSetting ms);

    void updateGrade(Grade grade);

    void addGrade(Grade grade);

    void deleteGrade(Grade grade);

    void gradeAndResetMySQL(MySQLSetting ms);

    void addGradeTest(Grade grade);
}
