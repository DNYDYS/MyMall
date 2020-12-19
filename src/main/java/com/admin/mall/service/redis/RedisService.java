package com.admin.mall.service.redis;

/**
 * @author Lyy
 * redis操作Service
 * 对象和数组都用json的形式存储
 * @date 2020/12/19 21:09
 **/
public interface RedisService {
    /**
     * 存储数据
     */
    void set(String key,String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    Boolean expire(String key,long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param key
     * @param delta 自增步长
     * @return
     */
    Long increment(String key,long delta);
}
