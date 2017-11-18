package design.job.service;

import design.job.dao.CompanyDao;
import design.job.entity.Company;
import design.job.entity.Company;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class CompanyServiceImpl implements CompanyService {


    @Resource
    private CompanyDao companyDao;


    public void addCompany(Company company) {
        companyDao.addCompany(company);
    }

    public void deleteCompany(Company company) {
        companyDao.deleteCompany(company);
    }

    public List<Map<String, Object>> queryAllCompany(Company company) {
        return companyDao.queryAllCompany(company);
    }

    public void updateCompany(Company company) {
        companyDao.updateCompany(company);
    }
}
