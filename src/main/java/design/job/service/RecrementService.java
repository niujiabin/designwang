package design.job.service;

import design.job.entity.Recrument;

import java.util.List;
import java.util.Map;

public interface RecrementService {

    /**
     * 添加招聘信息
     * @throws Exception
     * @param recrument
     */
    public  void addRecrementInfo(Recrument recrument) throws Exception;


    /**
     * 获取招聘信息列表
     * @param recrument
     * @return
     */
    List<Map<String,Object>> queryRecrementInfoList(Recrument recrument);

    /**
     * 修改招聘信息
     * @param recrument
     */
    void updateRecrument(Recrument recrument);

    /**
     * 删除招聘信息
     * @param recrument
     */
    void deleteRecrument(Recrument recrument);
}
