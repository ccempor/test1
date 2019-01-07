package 陈乐.test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Map<String,String> javaBase = new HashMap<>();
        Map<String,String> javaEE = new HashMap<>();

        javaBase.put("001","李晨");
        javaBase.put("002","范冰冰");
        javaEE.put("001","马云");
        javaEE.put("002","马化腾");

        Map<String,Map<String,String>> itcase = new HashMap<>();
        itcase.put("java就业班",javaEE);
        itcase.put("java基础班",javaBase);

        Set<String> set1 = itcase.keySet();
        for (String grade : set1){
            Set<String> set2 = itcase.get(grade).keySet();
                for (String id : set2){
                System.out.println(id + "=" + itcase.get(grade).get(id));
            }
        }

        System.out.println("-----------------------------------------------");

        Set<Map.Entry<String,Map<String,String>>> set3 = itcase.entrySet();

        Iterator<Map.Entry<String,Map<String,String>>> it = set3.iterator();
        while (it.hasNext()){
            Set<Map.Entry<String,String>> set4 = it.next().getValue().entrySet();
            Iterator<Map.Entry<String,String>> it2 = set4.iterator();
            while (it2.hasNext()){
                Map.Entry<String,String> date = it2.next();
                System.out.println(date.getKey()+"="+date.getValue());   //迭代器的next方法每出现一次,迭代器遍历就前进一个元素
            }
        }
    }
}
