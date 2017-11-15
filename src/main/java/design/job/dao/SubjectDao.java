package design.job.dao;

import design.job.entity.Subject;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface SubjectDao {

    /**
     * 添加科目信息
     * @param subject
     */
    public void addSubject(Subject subject);

    /**
     * 删除科目信息
     * @param subject
     */
    public void deleteSSubject(Subject subject);

    /**
     * 查询所有科目信息
     * @param subject
     * @return
     */

    List<Map<String,Object>> queryAllSubject(Subject subject);

    /**
     * 修改科目细小呢
     * @param subject
     */
    void updateSubject(Subject subject);
}
