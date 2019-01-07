package 陈乐.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (map.size() < 5){
            System.out.println("请录入书本(书名,价格):");
            String book = sc.next();
            String[] arr = book.split(",");
            double value = Double.valueOf(arr[1]);  //将字符串 arr[1] 解析为double数字;
            map.put(arr[0],value);
        }

        map.remove("C++");
        map.replace("Java",38.5);
        Set<String> set1 = map.keySet();
        for (String key : set1){
            System.out.println(key+ "=" +map.get(key));
        }

        System.out.println("---------------------------------");

        Set<Map.Entry<String,Double>> set2 = map.entrySet();
        for (Map.Entry<String,Double> s : set2){
            System.out.println(s.getKey()+ "=" +s.getValue());
        }
    }
}
