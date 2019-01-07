package com.itheima._06LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/*
* 总结：HashMap集合按照键无序不重复的，值只是一个附属品
*      如果把HashSet集合的元素加上一个附属值就变成了HashMap集合了。
*
*      LinkedHashMap:"有序" 不重复
*          如果把LinkedHashSet集合的元素加上一个附属值就变成了LinkedHashMap集合了。
* */
public class LinkedHashMapDemo01 {
    public static void main(String[] args){
        Map<String , Integer> maps = new LinkedHashMap<>();
        maps.put("常浩", 80);
        maps.put("常浩", 82);
        maps.put("李涛", 90);
        maps.put("徐锋", 85);
        System.out.println(maps);
    }
}
