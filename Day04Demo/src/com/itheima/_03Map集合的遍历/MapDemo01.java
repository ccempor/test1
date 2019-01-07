package com.itheima._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map集合的遍历：
*    （1）先获取Map集合所有的键。再通过遍历键去获取对应的值：键找值
*
*    （2）Map集合的Entry遍历方式：键值对方式
*
*    （3）JDK 1.8 以后的新技术(了解，Lambda表达式)
*
*  a.先获取Map集合所有的键。再通过遍历键去获取对应的值：键找值
*
* */
public class MapDemo01 {
    public static void main(String[] args){
        Map<String,Integer> maps = new HashMap<>();
        maps.put("李涛涛",100);
        maps.put("常浩",100);
        maps.put("徐锋",99);
        maps.put("王金龙",98);
        maps.put("王金龙",99);

        // {徐锋=99, 王金龙=99, 常浩=100, 李涛涛=100}
        System.out.println(maps);

        //(1)先获取Map集合所有的键
        Set<String> keys = maps.keySet();
        for(String key : keys){
            // (2)再通过遍历键去获取对应的值 键找值
            Integer value = maps.get(key);
            System.out.println(key + "==>" + value);
        }


    }
}
