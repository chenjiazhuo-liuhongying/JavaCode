package study_itheima.ArrayList集合.学生对象存储;

import java.util.ArrayList;

/**
 * @author :JiaGe
 * @date : 2022/5/14
 * @ApiNote :
 */
public class PrintStudent {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> array = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student();
        s1.setName("小红");
        s1.setAge(13);

        Student s2 = new Student();
        s2.setName("小明");
        s2.setAge(12);

        Student s3 = new Student();
        s3.setName("小李");
        s3.setAge(13);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            s.print();
            //System.out.println("姓名:" + s.getName() + ",年龄:" + s.getAge());

        }

    }
}
