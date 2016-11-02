package com.bobo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/10/1.
 */
@Component
public class RedisService {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;
}