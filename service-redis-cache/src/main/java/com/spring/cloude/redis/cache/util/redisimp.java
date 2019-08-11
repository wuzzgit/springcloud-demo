package com.spring.cloude.redis.cache.util;

import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class redisimp implements rdeis {
    /**
     * 用户排序通过注册时间的 权重值
     *
     * @param date
     * @return
     */
    @Override
    public double getCreateTimeScore(long date) {
        return 0;
    }

    /**
     * 获取Redis中所有的键的key
     *
     * @return
     */
    @Override
    public Set getAllKeys() {
        return null;
    }

    /**
     * 获取所有的普通key-value
     *
     * @return
     */
    @Override
    public Map getAllString() {
        return null;
    }

    /**
     * 获取所有的Set -key-value
     *
     * @return
     */
    @Override
    public Map getAllSet() {
        return null;
    }

    /**
     * 获取所有的ZSet正序  -key-value 不获取权重值
     *
     * @return
     */
    @Override
    public Map getAllZSetReverseRange() {
        return null;
    }

    /**
     * 获取所有的ZSet倒序  -key-value 不获取权重值
     *
     * @return
     */
    @Override
    public Map getAllZSetRange() {
        return null;
    }

    /**
     * 获取所有的List -key-value
     *
     * @return
     */
    @Override
    public Map getAllList() {
        return null;
    }

    /**
     * 获取所有的Map -key-value
     *
     * @return
     */
    @Override
    public Map getAllMap() {
        return null;
    }

    /**
     * 添加一个list
     *
     * @param key
     * @param objectList
     */
    @Override
    public void addList(Object key, List objectList) {

    }

    /**
     * 向list中增加值
     *
     * @param key
     * @param obj
     * @return 返回在list中的下标
     */
    @Override
    public long addList(Object key, Object obj) {
        return 0;
    }

    /**
     * 向list中增加值
     *
     * @param key
     * @param obj
     * @return 返回在list中的下标
     */
    @Override
    public long addList(Object key, Object[] obj) {
        return 0;
    }

    /**
     * 输出list
     *
     * @param key List的key
     * @param s   开始下标
     * @param e   结束的下标
     * @return
     */
    @Override
    public List getList(Object key, long s, long e) {
        return null;
    }

    /**
     * 输出完整的list
     *
     * @param key
     */
    @Override
    public List getList(Object key) {
        return null;
    }

    /**
     * 获取list集合中元素的个数
     *
     * @param key
     * @return
     */
    @Override
    public long getListSize(Object key) {
        return 0;
    }

    /**
     * 移除list中某值
     * 移除list中 count个value为object的值,并且返回移除的数量,
     * 如果count为0,或者大于list中为value为object数量的总和,
     * 那么移除所有value为object的值,并且返回移除数量
     *
     * @param key
     * @param object
     * @return 返回移除数量
     */
    @Override
    public long removeListValue(Object key, Object object) {
        return 0;
    }

    /**
     * 移除list中某值
     *
     * @param key
     * @param object
     * @return 返回移除数量
     */
    @Override
    public long removeListValue(Object key, Object[] object) {
        return 0;
    }

    /**
     * 批量删除key对应的value
     *
     * @param keys
     */
    @Override
    public void remove(Object[] keys) {

    }

    /**
     * 删除缓存
     * 根据key精确匹配删除
     *
     * @param key
     */
    @Override
    public void remove(Object key) {

    }

    /**
     * 通过分数删除ZSet中的值
     *
     * @param key
     * @param s
     * @param e
     */
    @Override
    public void removeZSetRangeByScore(String key, double s, double e) {

    }

    /**
     * 设置Set的过期时间
     *
     * @param key
     * @param time
     * @return
     */
    @Override
    public Boolean setSetExpireTime(String key, Long time) {
        return null;
    }

    /**
     * 设置ZSet的过期时间
     *
     * @param key
     * @param time
     * @return
     */
    @Override
    public Boolean setZSetExpireTime(String key, Long time) {
        return null;
    }

    /**
     * 判断缓存中是否有key对应的value
     *
     * @param key
     * @return
     */
    @Override
    public boolean exists(Object key) {
        return false;
    }

    /**
     * 读取String缓存 可以是对象
     *
     * @param key
     * @return
     */
    @Override
    public Object get(Object key) {
        return null;
    }

    /**
     * 读取String缓存 可以是对象
     *
     * @param key
     * @return
     */
    @Override
    public List get(Object[] key) {
        return null;
    }

    /**
     * 读取缓存 可以是对象 根据正则表达式匹配
     *
     * @param regKey
     * @return
     */
    @Override
    public List<Object> getByRegular(Object regKey) {
        return null;
    }

    /**
     * 写入缓存 可以是对象
     *
     * @param key
     * @param value
     */
    @Override
    public void set(Object key, Object value) {

    }

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     * @param expireTime 过期时间 -单位s
     * @return
     */
    @Override
    public void set(Object key, Object value, Long expireTime) {

    }

    /**
     * 设置一个key的过期时间（单位：秒）
     *
     * @param key
     * @param expireTime
     * @return
     */
    @Override
    public boolean setExpireTime(Object key, Long expireTime) {
        return false;
    }

    /**
     * 获取key的类型
     *
     * @param key
     * @return
     */
    @Override
    public DataType getType(Object key) {
        return null;
    }

    /**
     * 删除map中的某个对象
     *
     * @param key   map对应的key
     * @param field map中该对象的key
     */
    @Override
    public void removeMapField(Object key, Object[] field) {

    }

    @Override
    public Map getMap(Object key) {
        return null;
    }

    @Override
    public Long getMapSize(Object key) {
        return null;
    }

    /**
     * 获取map缓存中的某个对象
     *
     * @param key   map对应的key
     * @param field map中该对象的key
     * @return
     */
    @Override
    public Object getMapField(Object key, Object field) {
        return null;
    }

    /**
     * 判断map中对应key的key是否存在
     *
     * @param key   map对应的key
     * @param field
     * @return
     */
    @Override
    public Boolean hasMapKey(Object key, Object field) {
        return null;
    }

    /**
     * 获取map对应key的value
     *
     * @param key map对应的key
     * @return
     */
    @Override
    public List getMapFieldValue(Object key) {
        return null;
    }

    /**
     * 获取map的key
     *
     * @param key map对应的key
     * @return
     */
    @Override
    public Set getMapFieldKey(Object key) {
        return null;
    }

    /**
     * 添加map
     *
     * @param key
     * @param map
     */
    @Override
    public void addMap(Object key, Map map) {

    }

    /**
     * 向key对应的map中添加缓存对象
     *
     * @param key   cache对象key
     * @param field map对应的key
     * @param value 值
     */
    @Override
    public void addMap(Object key, Object field, Object value) {

    }

    /**
     * 向key对应的map中添加缓存对象
     *
     * @param key   cache对象key
     * @param field map对应的key
     * @param value 值
     * @param time  过期时间-整个MAP的过期时间
     */
    @Override
    public void addMap(Object key, Object field, Object value, long time) {

    }

    /**
     * 向set中加入对象
     *
     * @param key 对象key
     * @param obj 值
     */
    @Override
    public void addSet(Object key, Object[] obj) {

    }

    /**
     * 处理事务时锁定key
     *
     * @param key
     */
    @Override
    public void watch(String key) {

    }

    /**
     * 移除set中的某些值
     *
     * @param key 对象key
     * @param obj 值
     */
    @Override
    public long removeSetValue(Object key, Object obj) {
        return 0;
    }

    /**
     * 移除set中的某些值
     *
     * @param key 对象key
     * @param obj 值
     */
    @Override
    public long removeSetValue(Object key, Object[] obj) {
        return 0;
    }

    /**
     * 获取set的对象数
     *
     * @param key 对象key
     */
    @Override
    public long getSetSize(Object key) {
        return 0;
    }

    /**
     * 判断set中是否存在这个值
     *
     * @param key 对象key
     * @param obj
     */
    @Override
    public Boolean hasSetValue(Object key, Object obj) {
        return null;
    }

    /**
     * 获得整个set
     *
     * @param key 对象key
     */
    @Override
    public Set getSet(Object key) {
        return null;
    }

    /**
     * 获得set 并集
     *
     * @param key
     * @param otherKey
     * @return
     */
    @Override
    public Set getSetUnion(Object key, Object otherKey) {
        return null;
    }

    /**
     * 获得set 并集
     *
     * @param key
     * @param set
     * @return
     */
    @Override
    public Set getSetUnion(Object key, Set set) {
        return null;
    }

    /**
     * 获得set 交集
     *
     * @param key
     * @param otherKey
     * @return
     */
    @Override
    public Set getSetIntersect(Object key, Object otherKey) {
        return null;
    }

    /**
     * 获得set 交集
     *
     * @param key
     * @param set
     * @return
     */
    @Override
    public Set getSetIntersect(Object key, Set set) {
        return null;
    }

    /**
     * 模糊移除 支持*号等匹配移除
     *
     * @param blears
     */
    @Override
    public void removeBlear(Object[] blears) {

    }

    /**
     * 修改key名 如果不存在该key或者没有修改成功返回false
     *
     * @param oldKey
     * @param newKey
     * @return
     */
    @Override
    public Boolean renameIfAbsent(String oldKey, String newKey) {
        return null;
    }

    /**
     * 模糊移除 支持*号等匹配移除
     *
     * @param blear
     */
    @Override
    public void removeBlear(Object blear) {

    }

    /**
     * 根据正则表达式来移除key-value
     *
     * @param blears
     */
    @Override
    public void removeByRegular(String... blears) {

    }

    /**
     * 根据正则表达式来移除key-value
     *
     * @param blears
     */
    @Override
    public void removeByRegular(String blears) {

    }

    /**
     * 根据正则表达式来移除 Map中的key-value
     *
     * @param key
     * @param blears
     */
    @Override
    public void removeMapFieldByRegular(Object key, Object[] blears) {

    }

    /**
     * 根据正则表达式来移除 Map中的key-value
     *
     * @param key
     * @param blear
     */
    @Override
    public void removeMapFieldByRegular(Object key, Object blear) {

    }

    /**
     * 移除key 对应的value
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public Long removeZSetValue(Object key, Object[] value) {
        return null;
    }

    /**
     * 移除key ZSet
     *
     * @param key
     * @return
     */
    @Override
    public void removeZSet(Object key) {

    }

    /**
     * 删除，键为K的集合，索引start<=index<=end的元素子集
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public void removeZSetRange(Object key, Long start, Long end) {

    }

    /**
     * 并集 将key对应的集合和key1对应的集合合并到key2中
     * 如果分数相同的值，都会保留
     * 原来key2的值会被覆盖
     *
     * @param key
     * @param key1
     * @param key2
     */
    @Override
    public void setZSetUnionAndStore(String key, String key1, String key2) {

    }

    /**
     * 获取整个有序集合ZSET，正序
     *
     * @param key
     */
    @Override
    public Object getZSetRange(Object key) {
        return null;
    }

    /**
     * 获取有序集合ZSET
     * 键为K的集合，索引start<=index<=end的元素子集，正序
     *
     * @param key
     * @param start 开始位置
     * @param end   结束位置
     */
    @Override
    public Object getZSetRange(Object key, long start, long end) {
        return null;
    }

    /**
     * 获取整个有序集合ZSET，倒序
     *
     * @param key
     */
    @Override
    public Set<Object> getZSetReverseRange(Object key) {
        return null;
    }

    /**
     * 获取有序集合ZSET
     * 键为K的集合，索引start<=index<=end的元素子集，倒序
     *
     * @param key
     * @param start 开始位置
     * @param end   结束位置
     */
    @Override
    public Set getZSetReverseRange(Object key, long start, long end) {
        return null;
    }

    /**
     * 通过分数(权值)获取ZSET集合 正序 -从小到大
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Set getZSetRangeByScore(String key, double start, double end) {
        return null;
    }

    /**
     * 通过分数(权值)获取ZSET集合 倒序 -从大到小
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Set getZSetReverseRangeByScore(String key, double start, double end) {
        return null;
    }

    /**
     * 键为K的集合，索引start<=index<=end的元素子集
     * 返回泛型接口（包括score和value），正序
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Set<ZSetOperations.TypedTuple> getZSetRangeWithScores(Object key, long start, long end) {
        return null;
    }

    /**
     * 键为K的集合，索引start<=index<=end的元素子集
     * 返回泛型接口（包括score和value），倒序
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Set<ZSetOperations.TypedTuple> getZSetReverseRangeWithScores(Object key, long start, long end) {
        return null;
    }

    /**
     * 键为K的集合
     * 返回泛型接口（包括score和value），正序
     *
     * @param key
     * @return
     */
    @Override
    public Set<ZSetOperations.TypedTuple> getZSetRangeWithScores(Object key) {
        return null;
    }

    /**
     * 键为K的集合
     * 返回泛型接口（包括score和value），倒序
     *
     * @param key
     * @return
     */
    @Override
    public Set<ZSetOperations.TypedTuple> getZSetReverseRangeWithScores(Object key) {
        return null;
    }

    /**
     * 键为K的集合，sMin<=score<=sMax的元素个数
     *
     * @param key
     * @param sMin
     * @param sMax
     * @return
     */
    @Override
    public long getZSetCountSize(Object key, double sMin, double sMax) {
        return 0;
    }

    /**
     * 获取Zset 键为K的集合元素个数
     *
     * @param key
     * @return
     */
    @Override
    public long getZSetSize(Object key) {
        return 0;
    }

    /**
     * 获取键为K的集合，value为obj的元素分数
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public double getZSetScore(Object key, Object value) {
        return 0;
    }

    /**
     * 元素分数增加，delta是增量
     *
     * @param key
     * @param value
     * @param delta
     * @return
     */
    @Override
    public double incrementZSetScore(Object key, Object value, double delta) {
        return 0;
    }

    /**
     * 添加有序集合ZSET
     * 默认按照score升序排列，存储格式K(1)==V(n)，V(1)=S(1)
     *
     * @param key
     * @param score
     * @param value
     * @return
     */
    @Override
    public Boolean addZSet(String key, double score, Object value) {
        return null;
    }

    /**
     * 添加有序集合ZSET
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public Long addZSet(Object key, TreeSet value) {
        return null;
    }

    /**
     * 添加有序集合ZSET
     *
     * @param key
     * @param score
     * @param value
     * @return
     */
    @Override
    public Boolean addZSet(Object key, double[] score, Object[] value) {
        return null;
    }
}
