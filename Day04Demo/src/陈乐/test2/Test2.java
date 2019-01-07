package 陈乐.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String,Double> maps = new HashMap<>();
        maps.put("柳岩",2100.0);
        maps.put("张亮",1700.0);
        maps.put("诸葛亮",1800.0);
        maps.put("灭绝师太",2600.0);
        maps.put("东方不败",3800.0);


        maps.replace("柳岩",maps.get("柳岩")+300);
        Set<Map.Entry<String,Double>> set = maps.entrySet();
        for (Map.Entry<String,Double> s : set){
            System.out.println(s);
        }
    }
}
