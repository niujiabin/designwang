package design.job.service;

import design.job.dao.RecrementDao;
import design.job.entity.Recrument;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("recrementService")
public class RecrumentServiceImpl implements  RecrementService {

    @Resource
    RecrementDao recrementDao;

    public void addRecrementInfo(Recrument recrument) throws Exception {

        this.recrementDao.addRecrumentInfo(recrument);
    }

    public List<Map<String, Object>> queryRecrementInfoList(Recrument recrument) {
        return recrementDao.getAllRecrument();
    }

    /**
     * 修改招聘信息
     * @param recrument
     */
    public void updateRecrument(Recrument recrument) {
        recrementDao.updateRecrument(recrument);
    }

    /**
     * 删除招聘信息
     * @param recrument
     */
    public void deleteRecrument(Recrument recrument) {
        recrementDao.deleteRecrument(recrument);
    }

    public RecrementDao getRecrementDao() {
        return recrementDao;
    }

    public void setRecrementDao(RecrementDao recrementDao) {
        this.recrementDao = recrementDao;
    }
}
