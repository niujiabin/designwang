package design.job.service;

import design.job.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    /**
     * 添加科目信息
     * @param student
     */
    public void addStudent(Student student);

    /**
     * 删除科目信息
     * @param student
     */
    public void deleteStudent(Student student);

    /**
     * 查询所有科目信息
     * @param student
     * @return
     */
    List<Map<String,Object>> queryAllStudent(Student student);

    /**
     * 修改科目信息
     * @param student
     */
    void updateStudent(Student student);
}
