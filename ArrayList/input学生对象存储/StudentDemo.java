package study_itheima.ArrayList集合.input学生对象存储;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author :JiaGe
 * @date : 2022/5/14
 * @ApiNote :
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> array = new ArrayList<>();


        input(array);
        input(array);
        input(array);

        //遍历集合
        System.out.println("您刚刚录入了:");
        for (int i = 0; i < array.size(); i++) {
            Student stu = array.get(i);
            //使用print方法输出
            stu.print_array();
        }
    }

    public static void input(ArrayList<Student> array) {

        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        //输入姓名
        System.out.println("输入姓名");
        String name = sc.next();
        //输入年龄
        System.out.println("输入年龄");
        int age = sc.nextInt();

        //创建对象
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        array.add(student);
    }
}
