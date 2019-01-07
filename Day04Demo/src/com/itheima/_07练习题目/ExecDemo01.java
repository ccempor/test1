package com.itheima._07练习题目;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 练习题目一：
*    从键盘中录入一个字符串：计算一个字符串中每个字符出现次数。
*    aabbccc ->  a:2 b:2 c:3
*
*    思路：
*     （1） 提示用户输入一个字符串
*     （2） 定义一个Map集合来存放最终统计的结果。
*     （3） 遍历字符串中的每个字符，依次统计出现的次数。
*
*
* */
public class ExecDemo01 {
    public static void main(String[] args){
        // （1） 提示用户输入一个字符串 。
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入您的字符串：");
        String str = scan.next();

        //  （2） 定义一个Map集合来存放最终统计的结果。
        // {a=2 , b = 2 , c=3 }
        Map<Character , Integer> datas = new HashMap<>();

        // （3） 遍历字符串中的每个字符，依次统计出现的次数。
        // aabbccc
        for(int i = 0 ; i < str.length() ; i++ ) {
            // 得到每一个字符
            char ch = str.charAt(i);
            // 判断集合中之前是否已经统计过了这个字符
            // 如果统计过了，数量加1
            // 如果之前没有统计，直接加入。
            if(datas.containsKey(ch)){
                // 先拿它之前出现的次数
                Integer num = datas.get(ch);
                num++ ;
                datas.put(ch , num);
            }else{
                datas.put(ch,1);
            }
        }

        System.out.println(datas);
    }
}
