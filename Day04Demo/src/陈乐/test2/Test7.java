package 陈乐.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入语句:");
        String  line = sc.nextLine();
        String[] arr = line.split(" ");
        for (int i = 0; i < arr.length; i++) {
            Integer count = maps.get(arr[i]);
            if (maps.containsKey(arr[i])){
                maps.replace(arr[i],count+1);
            }else {
                maps.put(arr[i],1);
            }
        }
        Set<Map.Entry<String,Integer>> set = maps.entrySet();
        for (Map.Entry<String, Integer> s : set
        ){
            System.out.println(s);
        }
    }
}
