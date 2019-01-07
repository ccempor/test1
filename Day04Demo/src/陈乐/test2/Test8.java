package 陈乐.test2;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> maps = new HashMap<>();
        Random r = new Random();
        while (maps.size() < 5){
            System.out.println("请输入学生姓名:");
            String name = sc.next();
            int score = r.nextInt(101);
            maps.put(name,score);
        }
        Set<String> names = maps.keySet();
        Iterator<String> it = names.iterator();
        int aScore = maps.get(it.next());  // 这里使用了一次迭代器对象的next()方法,迭代器的指针已经走过一个元素了,使用迭代器遍历时会从第二个元素开始遍历

        int maxScore = aScore;
        int minScore = aScore;
        int totalScore = 0;


        for (String s : names){        //使用foreach遍历仍会遍历所有元素
            int score = maps.get(s);
            System.out.println(score);
            if (score < minScore){
                minScore = score;
            }else if (score > maxScore){
                maxScore = score;
            }
            totalScore += score;
        }

//        while (it.hasNext()){
//            int score = maps.get(it.next());    使用迭代器遍历不会遍历第一个元素
//            System.out.println(score);
//            if (score < minScore){
//                minScore = score;
//            }else if (score > maxScore){
//                maxScore = score;
//            }
//            totalScore += score;
//        }

        int avgScore = totalScore/ maps.size();
        System.out.println("总分="+totalScore+",最高分="+maxScore+",最低分="+minScore+",平均分="+avgScore);

    }
}
