package com.bobo;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 2016/11/2.
 */
//@Component
public class PoxyDefaultConfig {
  /*  @PersistenceContext
    private EntityManager entityManager;*/

//    @Autowired
//    public OperationLogConfiguration(ILogSettingService logSettingService) {
//        logSettings = logSettingService.findAll();
//    }

//    public OperationLogContext getOperationLogContext(JoinPoint joinPoint) {
//        return new DefaultOperationLogContext(logSettings, entityManager, joinPoint);
//    }
}
