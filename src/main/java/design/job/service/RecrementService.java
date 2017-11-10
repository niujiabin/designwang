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


    List<Map<String,Object>> queryRecrementInfoList(Recrument recrument);

    void updateRecrument(Recrument recrument);
}
