package design.job.entity;

public class MySQLSetting {

    private Integer max_connections;

    private Long query_cache_size;



    public Integer getMax_connections() {
        return max_connections;
    }

    public void setMax_connections(Integer max_connections) {
        this.max_connections = max_connections;
    }


    public Long getQuery_cache_size() {
        return query_cache_size;
    }

    public void setQuery_cache_size(Long query_cache_size) {
        this.query_cache_size = query_cache_size;
    }
}
