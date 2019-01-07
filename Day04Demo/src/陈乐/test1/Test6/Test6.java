package 陈乐.test1.Test6;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        Student s1 = new Student("阿乐",23,"天河区");
        Student s2= new Student("阿美",25,"天河区");   //键相同的元素后面的会覆盖前面的
        Student s3 = new Student("小明",17,"海珠区");
        Student s4 = new Student("彦祖",33,"越秀区");

        Map<String,Student> maps = new HashMap<>();
        maps.put(s1.getAddress(),s1);
        maps.put(s2.getAddress(),s2);
        maps.put(s3.getAddress(),s3);
        maps.put(s4.getAddress(),s4);

        Set<String> keys = maps.keySet();
        for (String s : keys){
            System.out.println(maps.get(s).getName()+"住在"+s);
        }

        Set<Map.Entry<String,Student>> keys2 = maps.entrySet();
        for (Map.Entry<String,Student> s : keys2){
            System.out.println(s.getValue().getName()+"住在"+s.getKey());
        }

    }
}
