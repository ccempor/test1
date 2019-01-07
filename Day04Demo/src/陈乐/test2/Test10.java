package 陈乐.test2;

import java.util.HashMap;
import java.util.Map;

public class Test10 {
    public static void main(String[] args) {
        String[] arr1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] arr2 = {"哈尔滨","杭州","南昌","广州","福州"};
        Map<String,String> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i],arr2[i]);
        }

        System.out.println(map);
    }
}
