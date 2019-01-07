package 陈乐.test2;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Map<Character,Integer> maps = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        for (int i = 0 ; i < str.length() ; i++){
            Character key = str.charAt(i);
            Integer count = maps.get(key);
            if (maps.containsKey(key)){
                count ++;
                maps.replace(key,count);
            }else {
                maps.put(key,1);
            }
        }
        Set<Map.Entry<Character,Integer>> sets = maps.entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> s : sets){
            sb.append(s.getKey()+"("+s.getValue()+")");

        }
        System.out.println(sb);
    }
}
