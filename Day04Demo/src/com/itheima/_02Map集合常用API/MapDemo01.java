package com.itheima._02Map集合常用API;

import java.util.*;

/*
* Map集合的常用API.
*
* */
public class MapDemo01 {
    public static void main(String[] args){
        Map<Integer , String> maps = new HashMap<>();
        // 给Map集合添加元素
        maps.put(1,"李涛涛");
        maps.put(4,"常浩");
        maps.put(8,"徐锋");
        maps.put(8,"徐锋2");
        System.out.println(maps);

        // 清空集合中的元素
        //maps.clear();
        // 判断集合是否为空。
        //System.out.println(maps.isEmpty());

        System.out.println(maps.size());

        // 判断集合中是否包含了某个键，包含返回true,反之
        System.out.println(maps.containsKey(8));
        // 判断集合中是否包含了某个值，包含返回true,反之
        System.out.println(maps.containsValue("徐锋2"));

        // 根据Map集合的键获取对应的值
        System.out.println(maps.get(8));

        // public Set<K> keySet()
        // 获取集合中所有的键返回到一个Set集合中去。|
        Set<Integer> keys = maps.keySet();
        for(Integer k : keys){
            System.out.println(k);

        }

        // public Collection<V> values
        // 获取集合中所有的值到一个Collection集合中去。
        Collection<String> values = maps.values();
        for(String value : values){
            System.out.println(value);
        }

        // 根据键删除这个元素
        maps.remove(8);
        System.out.println(maps);
    }
}
