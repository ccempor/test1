package com.itheima._01Map集合的概述和体系;

import java.util.HashMap;
import java.util.Map;

/*
*  Map集合的概述：
*      Map集合也是一个容器，Map集合与Collection集合是属于不同体系的。
*      Map集合有人称为双列集合。
*      Collection有人称为单列集合。
*
*      Map集合中的元素是成对出现，Map集合中的每个元素是包含两个值的。
*      Map集合称为键值对集合。
*      Map集合的键称为key , 值称为value。
*
*      Map集合格式：
*         map = { key1=value1 , key2=value2 , key3=value3 , ..}
*
*      为什么要用Map集合?
*          Map集合的数据信息更加的详细和贴心。
*          场景：淘宝的购物车就可以用Map集合存储。
*               {iphonex=2 , SpringBoot=1}
*
*          List : ["李涛涛",21,"97期",'男',"广州天河"]
*          Map :  {name="李涛涛",age=21,class="97期",sex='男',addr="广州天河"}
*
*
*      Map集合的体系：
*            Map<K,V>(接口)
*             /
*          HashMap<K,V>(实现类)
*            /
*        LinkedHashMap<K,V>(实现类)
*
*      Map集合的使用特点：
*           Map集合的元素是无序的，按照键无序的。
*           Map集合的键是不重复的，后面加入的键会直接覆盖前面的键值对。
*           Map集合是不关心值的，值不做要求。
*           Map集合的键值对都可以为null.
*
*/
public class MapDemo01 {
    public static void main(String[] args){
        // 创建一个Map集合对象
        Map<String, Integer> maps = new HashMap<>();
        // 添加一个元素
        maps.put("iphoneXS" , 2);
        maps.put("iphoneXS" , 10);

        maps.put("Spring",1);
        maps.put("SpringBoot",10);
        maps.put("JavaWEB",1);
        maps.put("SSH框架",2);
        maps.put(null,2);
        maps.put(null,null);
        System.out.println(maps);
        // {SpringBoot=10, Spring=1, iphoneXS=3, JavaWEB=1, SSH框架=2}

    }
}
