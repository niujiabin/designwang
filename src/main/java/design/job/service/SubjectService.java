package design.job.service;

import design.job.entity.Subject;

import java.util.List;
import java.util.Map;

public interface SubjectService {

    /**
     * 添加科目信息
     * @param subject
     */
    public void addSubject(Subject subject);

    /**
     * 删除科目信息
     * @param subject
     */
    public void deleteSubject(Subject subject);

    /**
     * 查询所有科目信息
     * @param subject
     * @return
     */
    List<Map<String,Object>> queryAllSubject(Subject subject);

    /**
     * 修改科目信息
     * @param subject
     */
    void updateSubject(Subject subject);
}
