package 陈乐.test1;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<>();
        maps.put("陈乐","敲代码");
        maps.put("磊哥","瞎搞");
        maps.put("小白","吃饭");
        Collection<String> values = maps.values();

        for (String s : values){
            System.out.println(s);
        }

        Iterator<String> it = values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
