package design.job.dao;

import design.job.entity.Resume;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface ResumeDao {
    String TABLE_NAME = " resume ";
    String INSERT_FIELDS = " name, sex, phoneNum, email, eduBackGround, skills, schoolActivity, hobby, targetStation ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{name},#{sex},#{phoneNum},#{email},#{eduBackGround},#{skills},#{schoolActivity},#{hobby},#{targetStation})"})
    public void addResume(Resume resume);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " "})
    List<Map<String,Object>> getAllResume();

    @Update({"update ", TABLE_NAME, " set name=#{name},sex=#{sex},phoneNum=#{phoneNum},email=#{email},eduBackGround=#{eduBackGround}," +
            "skills=#{skills},schoolActivity=#{schoolActivity},hobby=#{hobby},targetStation=#{targetStation} where id=#{id}"})
    void updateResume(Resume resume);

    @Delete({"delete from ", TABLE_NAME, " where id=#{id}"})
    void deleteResume(Resume resume);
}
