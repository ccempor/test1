package 陈乐.test1;

import 陈乐.test1.Test6.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tes7 {
    public static void main(String[] args) {
        Student s1 = new Student("阿乐",23,"天河区");
        Student s5 = new Student("阿乐",23,"花都区");
        Student s2= new Student("阿美",25,"天河区");
        Student s3 = new Student("小明",17,"海珠区");
        Student s4 = new Student("彦祖",33,"越秀区");

        Map<Student,String> maps = new HashMap<>();
        maps.put(s1,s1.getAddress());     //学生对象若需判断重复,需重写hashCode方法和equals方法
        maps.put(s2,s2.getAddress());
        maps.put(s3,s3.getAddress());
        maps.put(s4,s4.getAddress());
        maps.put(s5,s5.getAddress());

        Set<Student> sets = maps.keySet();
        for (Student s : sets){
            System.out.println(s.getName()+"住在"+maps.get(s));
        }
        System.out.println("------------------------------------------");

        Set<Map.Entry<Student,String>> set2 = maps.entrySet();

        for (Map.Entry<Student,String> s :set2){
            System.out.println(s.getKey().getName()+"住在"+s.getValue());
        }


    }
}
