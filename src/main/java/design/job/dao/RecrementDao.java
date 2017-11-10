package design.job.dao;

import design.job.entity.Recrument;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface RecrementDao {

    public void addRecrumentInfo(Recrument recrument);

    List<Map<String,Object>> getAllRecrument();

    void updateRecrument(Recrument recrument);
}
