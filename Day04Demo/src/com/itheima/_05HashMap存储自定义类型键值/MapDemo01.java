package com.itheima._05HashMap存储自定义类型键值;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args){
        Map<String,Student> maps = new HashMap<>();
        maps.put("黑马97",new Student("李涛涛",19,'男'));
        maps.put("黑马98",new Student("李二",21,'男'));
        maps.put("黑马94",new Student("王微",22,'女'));
        System.out.println(maps);

        Map<Student,String> maps1 = new HashMap<>();
        maps1.put(new Student("李涛涛",19,'男'),"黑马97");
        maps1.put(new Student("李涛涛",19,'男'),"黑马97");
        maps1.put(new Student("李二",21,'男'),"黑马98");
        maps1.put(new Student("王微",22,'女'),"黑马94");
        System.out.println(maps1);

    }
}
