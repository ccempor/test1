package 陈乐.test2;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer,String> maps = new HashMap<>();
        maps.put(1,"张三丰");
        maps.put(2,"周芷若");
        maps.put(3,"王峰");
        maps.put(4,"灭绝师太");
        System.out.println(maps);
        maps.put(5,"李晓红");
        maps.remove(1);
        maps.replace(2,"周林");
        System.out.println(maps);
    }
}
