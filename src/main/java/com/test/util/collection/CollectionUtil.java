package com.test.util.collection;

import java.util.Collection;
import java.util.List;

/**
 * Created by ljg on 2017/3/4.
 */
public class CollectionUtil {


    /**
     * 过滤集合 将集合中不满足条件的过滤掉
     * @param list 目标集合
     * @param filter 过滤条件
     * */
    public static <T> List<T> filterList(List<T> list,CollectionFilter<T> filter) {
        if(isEmpty(list)){
            return list;
        }
        for (int i=0;i<list.size();i++){
            T t=list.get(i);
            if (!filter.isMet(t)){
                list.remove(t);
                i--;
            }
        }
        return list;
    }

    public static boolean isEmpty(Collection collection){
        if(collection==null||collection.size()==0){
            return true;
        }
        return false;
    }
}
