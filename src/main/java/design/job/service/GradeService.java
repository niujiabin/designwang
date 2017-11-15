package design.job.service;

import design.job.entity.Grade;

import java.util.List;
import java.util.Map;

public interface GradeService {

    List<Map<String,Object>> queryAllGrade(Grade grade);

    void updateGrade(Grade grade);

    void addGrade(Grade grade);

    void deleteGrade(Grade grade);
}
