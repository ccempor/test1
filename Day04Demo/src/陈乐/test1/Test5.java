package 陈乐.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<>();
        maps.put("邓超","孙俪");
        maps.put("李晨","范冰冰");
        maps.put("刘德华","柳岩");
        maps.put("黄晓明","Angelababy");
        maps.put("谢霆锋","王菲");

        Set<Map.Entry<String,String>> sets = maps.entrySet();

        for (Map.Entry<String,String> s : sets){
            System.out.println(s.getKey()+"->"+s.getValue());
        }
    }
}
