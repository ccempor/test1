package 陈乐.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<>();
        maps.put("陈乐","敲代码");
        maps.put("磊哥","瞎搞");
        maps.put("小白","吃饭");

        Set<String> keys = maps.keySet();
        for (String s : keys){
            System.out.println(s);
        }

        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
