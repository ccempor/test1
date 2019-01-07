package 陈乐.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            // 若重复代码较多,需考虑定义一个方法来解决问题

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                String key = "字母";
                countNum(maps,key);
            }else if (ch == ' '){
                String key = "空格";
                countNum(maps,key);
            }else if (ch >= '0' && ch <= '9'){
                String key = "数字";
                countNum(maps,key);
            }else {
                String key = "其他";
                countNum(maps,key);
            }
        }
        System.out.println(maps);
    }

    public static void countNum(Map<String,Integer> map,String key){
        Integer count = map.get(key);
        if (!map.containsKey(key)){
            map.put(key,1);
        }else {
            map.replace(key, ++count);
            /*
            此处不能使用count++,因为此处等价于 value = count++,count的值会在自增之前赋值给key对应的value,
            value并没有增加,然后Integer count = map.get(key)获取到的仍是没有增加过的值,所以value的值将一直是1;
             */

        }
    }
}
