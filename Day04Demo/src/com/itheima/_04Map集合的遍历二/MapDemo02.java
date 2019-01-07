package com.itheima._04Map集合的遍历二;

import java.util.HashMap;
import java.util.Map;

/*
* （3）JDK 1.8 以后的新技术(了解，Lambda表达式)
* */
public class MapDemo02 {
    public static void main(String[] args){
        Map<String , Integer> maps = new HashMap<>();
        maps.put("李涛", 90);
        maps.put("常浩", 80);
        maps.put("徐锋", 85);
        // {李涛=90, 徐锋=85, 常浩=80}
        System.out.println(maps);

     /* maps.forEach((k,v) -> {
            System.out.println(k+"===>"+v);
        });*/

        maps.forEach((k,v) ->  System.out.println(k+"===>"+ v) );


    }
}
