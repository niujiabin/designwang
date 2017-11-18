package design.job.service;

import design.job.entity.Company;

import java.util.List;
import java.util.Map;

public interface CompanyService {

    /**
     * 添加公司信息
     * @param company
     */
    public void addCompany(Company company);

    /**
     * 删除公司信息
     * @param company
     */
    public void deleteCompany(Company company);

    /**
     * 查询所有公司信息
     * @param company
     * @return
     */
    List<Map<String,Object>> queryAllCompany(Company company);

    /**
     * 修改公司信息
     * @param company
     */
    void updateCompany(Company company);
    
}
