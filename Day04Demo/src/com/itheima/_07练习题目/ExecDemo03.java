package com.itheima._07练习题目;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.StreamSupport;

/*
需求
传智播客包含2个班级：Java基础班，Java就业班
Java基础班
    001 李晨
    002 范冰冰
Java就业班
    001 马云
    002 马化腾

使用HashMap集合存储以上班级的学生信息，并完成以下两个需求
    1. 使用keySet遍历元素
    2. 使用entrySet元素

格式：
   datas = {  Java就业班={001=马云 , 002=马化腾} , Java基础班={001=李晨 , 002=范冰冰}  }
*/
public class ExecDemo03 {
    public static void main(String[] args) {
        // 定义一个Map集合来存放这些班级数据
        Map<String , Map<String,String>> datas = new HashMap<>();

        Map<String,String> value1 = new HashMap<>();
        value1.put("001","李晨");
        value1.put("002","范冰冰");
        datas.put("Java基础班", value1);

        Map<String,String> value2 = new HashMap<>();
        value2.put("001","马云");
        value2.put("002","马化腾");
        datas.put("Java就业班", value2);

        System.out.println(datas);

        // ---------------------------------------
        System.out.println("------------------------------------------");
        //  datas = {  Java就业班={001=马云 , 002=马化腾} , Java基础班={001=李晨 , 002=范冰冰}  }
        // (1) keySet
        // 先获取所以的键
        Set<String> keys = datas.keySet();
        for(String key : keys){
            System.out.println(key); // 输出班级
            // 拿到学生信息
            Map<String , String> value = datas.get(key);

            // entrySet遍历学生信息。
            Set<Map.Entry<String,String>> entries = value.entrySet();
            for(Map.Entry<String,String> entry : entries){
                String code = entry.getKey();
                String name = entry.getValue();
                System.out.println("\t"+code+"\t"+name);
            }
        }
    }
}
