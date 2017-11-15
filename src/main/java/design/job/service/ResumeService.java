package design.job.service;


import design.job.entity.Resume;

import java.util.List;
import java.util.Map;

public interface ResumeService {

    /**
     * 添加科目信息
     * @param resume
     */
    public void addresume(Resume resume);

    /**
     * 删除科目信息
     * @param resume
     */
    public void deleteresume(Resume resume);

    /**
     * 查询所有科目信息
     * @param resume
     * @return
     */
    List<Map<String,Object>> queryAllresume(Resume resume);

    /**
     * 修改科目信息
     * @param resume
     */
    void updateresume(Resume resume);
}
