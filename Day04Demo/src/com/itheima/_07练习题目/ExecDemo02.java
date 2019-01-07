package com.itheima._07练习题目;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
*  练习题2：
   需求

有四种水果(苹果，香蕉，西瓜，橘子)
1. 给每种水果设定一个商品号，商品号是8位0-9的随机数，商品号码不能重复。

2. 根据商品号查询对应的商品。
   如果查不到输出：“查无此商品”
   如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”

思路：
   （1）首先需要提供四种水果，使用数组定义。
   （2）定义一个Map集合，然后为每种水果设置一个随机的8位编号，编号不能重复
        键 ： 编号
        值 ： 水果
   （3）根据用户收入的编号去集合中找是否存在这个编号对应的键

*
*/
public class ExecDemo02 {
    public static void main(String[] args){
        Random ran = new Random();
        // （1）首先需要提供四种水果，使用数组定义。
        String[] fruits = new String[]{"🍎","🍌","🍉","🍊"};
        //  (2)定义一个Map集合，然后为每种水果设置一个随机的8位编号，
        //   编号不能重复
        //        键 ： 编号
        //        值 ： 水果
        Map<String,String> datas = new HashMap<>();

        // 为每种水果生成8为随机不重复编号存入到datas集合中
        for(String fruit : fruits){
            // 反复的去找一个不重复的编号为止
           while(true){
               // 为这个水果随机生成一个不重复的8位编号
               // 拼接编号
               StringBuilder sb = new StringBuilder();
               for(int i = 0 ; i < 8 ; i++ ) {
                   int num = ran.nextInt(10);
                   sb.append(num);
               }
               // 拿到随机生成的8位编号
               String code = sb.toString();
               // 去集合中判断是否已经有这个编号
               if(!datas.containsKey(code)){
                   // 编号不存在，可以使用
                   datas.put(code,fruit);
                   break;
               }
           }
        }
        System.out.println(datas);

        // 提示用户输入水果编号
        Scanner scn = new Scanner(System.in);
        System.out.print("请您输入您要买的水果编号：");
        String code = scn.next();
        // 判断是否存在这个水果编号
        if(datas.containsKey(code)){
            System.out.println("您要买的水果是："+datas.get(code));
        }else{
            System.err.println("对不起，您的编号输入有误！");
        }
    }
}
