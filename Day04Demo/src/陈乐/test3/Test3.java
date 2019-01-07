package 陈乐.test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Map<String,String> fruits = new HashMap<>();

        String[] arr = {"苹果","香蕉","橘子","西瓜"};

        for (int i = 0; i < arr.length; i++) {
            while (true){
                String id = getId();

                if (!fruits.containsKey(id)){
                    fruits.put(id,arr[i]);
                    break;
                }
            }
        }

        System.out.println(fruits);

        Scanner sc = new Scanner(System.in);
        while (true){

            System.out.println("请输入您要购买的水果编号:");
            String id = sc.next();
            if (fruits.containsKey(id)){
                System.out.println("您购买的水果是:"+fruits.get(id));
                break;
            }else {
                System.out.println("您输入的编号有误");
            }
        }
    }

    public static String getId (){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        while (sb.length() < 8){
            int s = r.nextInt(10);
            sb.append(s);
        }
        return sb.toString();
    }
}
