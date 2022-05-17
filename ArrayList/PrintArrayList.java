package study_itheima.ArrayList集合;

import study_itheima.ArrayList集合.学生对象存储.Student;

import java.util.ArrayList;

/**
 * @author :JiaGe
 * @date : 2022/5/14
 * @ApiNote :
 */
public class PrintArrayList {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("小明");
        array.add("小红");
        array.add("晓东");
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        /**
        for (String s : array) {
            System.out.println(s);
        }
         */
    }

}
