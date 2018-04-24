package com.pigutu.app.utils;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * 封装Redis存取Token对的工具类
 */
@Repository
public class RedisTokenHelper {
    public static String KEY_USER = "user";//帐号token redis key
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String, String> ops;

    @Resource(name = "redisTemplate")
    ValueOperations<Object, Object> objOps;

    /**
     * 键值对存储 字符串 ：有效时间180天
     *
     * @param tokenType Token的key
     * @param Token     Token的值
     */
    public void save(String tokenType, String Token) {
        ops.set(tokenType, Token, 180, TimeUnit.DAYS);
    }

    /**
     * 根据key从redis获取value
     *
     * @param tokenType
     * @return String
     */
    public String getToken(String tokenType) {
        return ops.get(tokenType);
    }

    /**
     * redis 存储一个对象
     *
     * @param key
     * @param obj
     * @param timeout 过期时间  单位：s
     */
    public void saveObject(String key, Object obj, long timeout) {
        objOps.set(key, obj, timeout, TimeUnit.SECONDS);
    }

    /**
     * redis 存储一个对象  ,不过期
     *
     * @param key
     * @param obj
     */
    public void saveObject(String key, Object obj) {
        objOps.set(key, obj);
    }

    /**
     * 从redis取出一个对象
     *
     * @param key
     */
    public Object getObject(String key) {
        return objOps.get(key);
    }

    /**
     * 根据Key删除Object
     *
     * @param key
     */
    public void removeObject(String key) {
        redisTemplate.delete(key);
    }
}