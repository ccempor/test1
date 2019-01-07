package 陈乐.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> maps = new HashMap<>();
        while(maps.size() < 5){  //使用while防止发生key值重复覆盖元素,以致集合元素不满5个
            System.out.println("请输入学生信息(格式: 姓名,年龄):");
            String message = sc.next();
            String[] kv = message.split(",");
            maps.put(kv[0],kv[1]);
        }

        System.out.println(maps);
    }
}
