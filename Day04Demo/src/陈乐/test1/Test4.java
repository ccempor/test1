package 陈乐.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main (String[] args){
        Map<String,String> maps = new HashMap<>();
        maps.put("邓超","孙俪");
        maps.put("李晨","范冰冰");
        maps.put("刘德华","柳岩");
        maps.put("黄晓明","Angelababy");
        maps.put("谢霆锋","王菲");

        Set<String> keys = maps.keySet();
        for (String s : keys){
            System.out.println(s+"->"+maps.get(s));
        }
    }
}
