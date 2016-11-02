package com.bobo.data;

import com.bobo.IntegratedSystemApplication;

/**
 * Created by Administrator on 2016/9/29.
 */
public class FlywayDataMig {

    public static void main(String[] args) {
        FlywayProperties flywayProperties = new FlywayProperties(IntegratedSystemApplication.class);
        flywayProperties.flwayRun(args[0],args[1]);
    }

}
