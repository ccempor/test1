package 陈乐.test1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<>();
        maps.put("陈乐","敲代码");
        maps.put("徐磊","瞎搞");
        maps.put("小白","吃饭");
        System.out.println(maps);
        System.out.println(maps.get("陈乐"));
        maps.remove("小白");
        System.out.println(maps);

        String s = "222";
        Object ob = s;

        try {
            exception("1988/12/03");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }

    public static void exception (String s) throws Exception{
        System.out.println("异常之前");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sf.parse(s);
        System.out.println("异常之后");
    }
}
