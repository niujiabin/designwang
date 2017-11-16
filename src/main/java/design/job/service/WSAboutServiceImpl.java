package design.job.service;

import design.job.dao.WSAboutDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("wsAboutService")
public class WSAboutServiceImpl implements WSAboutService {

    @Resource
    WSAboutDao wsAboutDao;

    public List<Map<String, Object>> getAllCompanyInfo() {
        return wsAboutDao.getAllCompanyInfo();
    }
}
