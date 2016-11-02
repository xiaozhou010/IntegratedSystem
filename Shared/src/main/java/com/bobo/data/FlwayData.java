package com.bobo.data;

import javax.sql.DataSource;
import java.io.Serializable;

/**
 * Created by zhouyongbo on 2016/9/29.
 */
public class FlwayData implements Serializable{

    private static final long serialVersionUID = 6183788043897496750L;

    private DataSource dataSource;
    private String url;
    private String user;
    private String password;
    private String locations = "db/migrate";//文件夹名称
    private String prefix = "V" ;//前缀
    private String suffix = "sql" ;//后缀


    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
