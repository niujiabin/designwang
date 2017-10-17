package design.job.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@CacheNamespace(size = 512)  
public interface dMapper {/*  
  
    *//** 
     * get test bean by UID. 
     *  
     * @param id 
     * @return 
     *//*  
    @SelectProvider(type = TestSqlProvider.class, method = "getSql")  
    @Options(useCache = true, flushCache = false, timeout = 10000)  
    @Results(value = {  
            @Result(id = true, property = "id", column = "test_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),  
            @Result(property = "testText", column = "test_text", javaType = String.class, jdbcType = JdbcType.VARCHAR) })  
    public TestBean get(@Param("id") String id);  
  
    *//** 
     * get all tests. 
     *  
     * @return 
     *//*  
    @SelectProvider(type = TestSqlProvider.class, method = "getAllSql")  
    @Options(useCache = true, flushCache = false, timeout = 10000)  
    @Results(value = {  
            @Result(id = true, property = "id", column = "test_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),  
            @Result(property = "testText", column = "test_text", javaType = String.class, jdbcType = JdbcType.VARCHAR) })  
    public List<TestBean> getAll();  
  
    *//** 
     * 
     * get tests by test text. 
     *  
     * @param testText 
     * @return 
     *//*  
    @SelectProvider(type = TestSqlProvider.class, method = "getByTestTextSql")  
    @Options(useCache = true, flushCache = false, timeout = 10000)  
    @ResultMap(value = "getByTestText")  
    public List<TestBean> getByTestText(@Param("testText") String testText);  
  
    *//** 
     * insert a test bean into database. 
     *  
     * @param testBean 
     *//*  
    @InsertProvider(type = TestSqlProvider.class, method = "insertSql")  
    @Options(flushCache = true, timeout = 20000)  
    public void insert(@Param("testBean") TestBean testBean);  
  
    *//** 
     * update a test bean with database. 
     *  
     * @param testBean 
     *//*  
    @UpdateProvider(type = TestSqlProvider.class, method = "updateSql")  
    @Options(flushCache = true, timeout = 20000)  
    public void update(@Param("testBean") TestBean testBean);  
  
    *//** 
     * delete a test by UID. 
     *  
     * @param id 
     *//*  
    @DeleteProvider(type = TestSqlProvider.class, method = "deleteSql")  
    @Options(flushCache = true, timeout = 20000)  
    public void delete(@Param("id") String id);  
*/}  
