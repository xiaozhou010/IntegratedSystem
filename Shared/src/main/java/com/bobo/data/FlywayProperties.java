package com.bobo.data;

import org.flywaydb.core.Flyway;

import javax.sql.DataSource;
import java.io.*;
import java.util.List;
import java.util.Properties;

/**
 * Created by zhouyongbo on 2016/9/29.
 */
public class FlywayProperties implements Serializable{
    private String flyway = "flyway";
    private String url = "url";
    private String user = "user";
    private String password = "password";
    private String locations = "locations";
    private String prefix = "prefix";
    private String suffix = "suffix";

    private Class aClass = null;

    public FlywayProperties(Class aClass) {
        this.aClass = aClass;
        loadProperties();
    }

    private static final long serialVersionUID = -4835877326426641476L;

    private static Properties properties = new Properties();

    /**
     * 加载配置文件
     */
    private void loadProperties(){
        try {
            properties.load(new FileInputStream(new File(propertiesPath())));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("配置文件找不到");
        }
    }

    /**
     * 获取配置文件路径
     * @return
     */
    private String propertiesPath(){
        return aClass.getClassLoader().getResource("jdbcflyway.properties").getPath();
    }

    /**
     * 得到flway对象 操作
     * @param sourceName
     * @param dataSource
     * @return
     */
    private FlwayData getFlwayDatas(String sourceName, DataSource dataSource){
        FlwayData flwayData = new FlwayData();
        flwayData.setDataSource(dataSource);
        flwayData.setUrl( properties.getProperty(flyway+"."+sourceName+"."+url));
        flwayData.setUser(properties.getProperty(flyway+"."+sourceName+"."+user));
        flwayData.setPassword(properties.getProperty(flyway+"."+sourceName+"."+password));
        flwayData.setLocations(properties.getProperty(flyway+"."+sourceName+"."+locations));
        String prefixs = properties.getProperty(flyway + "." + sourceName + "." + prefix);
        if ( prefixs != null ){
            flwayData.setPrefix(prefix);
        }
        String suffixs = properties.getProperty(flyway + "." + sourceName + "." + suffix);
        if (suffixs !=null){
            flwayData.setSuffix(suffix);
        }
        return flwayData;
    }

    private Flyway getFlyway(String sourceName){
        FlwayData flwayData = getFlwayDatas(sourceName, null);
        Flyway flyway = new Flyway();
        if (flwayData.getDataSource() !=null){
            flyway.setDataSource(flwayData.getDataSource());
        }else {
            flyway.setDataSource(flwayData.getUrl(),flwayData.getUser(),flwayData.getPassword());
        }
        flyway.setLocations(flwayData.getLocations());
        flyway.setPlaceholderPrefix(flwayData.getPrefix());
        flyway.setPlaceholderSuffix(flwayData.getSuffix());
        return flyway;
    }

    public void flwayRun(String sourceName,String flywayType){
        Flyway flyway = getFlyway(sourceName);
        if ("clean".equals(flywayType)){
            flyway.clean();
        }else if ("migrate".equals(flywayType)){
            flyway.migrate();
        }
    }
}
