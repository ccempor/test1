package com.itheima._04Map集合的遍历二;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;
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
 *  b.Map集合的Entry遍历方式：键值对方式
 *    是一种变化的foreach遍历形式
*/
public class MapDemo01 {
    public static void main(String[] args){
        Map<String , Integer> maps = new HashMap<>();
        maps.put("李涛", 90);
        maps.put("常浩", 80);
        maps.put("徐锋", 85);
        // {李涛=90, 徐锋=85, 常浩=80}
        System.out.println(maps);

       /*
        *  foreach格式：
        *    for(被遍历集合或者数组中元素的类型 变量：被遍历集合或者数组){
        *
        *    }
        *    Map集合默认是不能用foreach遍历
        *    因为Map集合中的元素的（键值对）类型不知道！！
        */

        // maps = {李涛=90, 徐锋=85, 常浩=80}
        // (1)先把Map集合转换成一个Set集合
        // maps -> entrys
        // entrys = [ (李涛=90) , (徐锋=85) , (常浩=80)]
        //             entry
        // 此时：(李涛=90) ,(徐锋=85) 这样的元素就有类型了，
        // 类型是 Map.Entry<String,Integer>
        Set<Map.Entry<String,Integer>> entrys = maps.entrySet();
        for(Map.Entry<String,Integer> entry : entrys){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "===>"+value);
        }




    }
}
