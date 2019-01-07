package 陈乐.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zqqabc");
        list.add("bcde");
        Map<Character ,Integer> maps = new HashMap<>();

        for (String s : list){
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                Integer count = maps.get(key);    // null不能作为基本数据类型的值,所以需要使用Integer包装类
                if (maps.containsKey(key)){
                    maps.replace(key,count+1);
                }else {
                    maps.put(key,1);
                }
            }
        }
        System.out.println(maps);
    }
}
