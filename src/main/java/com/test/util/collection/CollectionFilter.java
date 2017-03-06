package com.test.util.collection;

/**
 * Created by ljg on 2017/3/4.
 */
/**
 * 集合过滤条件接口
 * */
public interface CollectionFilter<T> {
     boolean isMet(T t);
}
