package study_itheima.ArrayList集合.学生管理系统;


import javafx.beans.binding.BooleanBinding;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author :JiaGe
 * @date : 2022/5/14
 * @ApiNote :
 */
public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.查看学生");
            System.out.println("3.修改学生");
            System.out.println("4.删除学生");
            System.out.println("5.退出系统");
            System.out.println("请输入你的选择:");
            //键盘录入
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    //System.out.println("1.添加学生");
                    AddSudent(array);
                    break;
                case 2:
                    //System.out.println("2.查看学生");
                    FindAllStudent(array);
                    break;
                case 3:
                    //System.out.println("3.修改学生");
                    SetStudent(array);
                    break;
                case 4:
                    //System.out.println("4.删除学生");
                    DeleteStudent(array);
                    break;
                case 5:
                    System.out.println("感谢你的使用!");
                    System.exit(0);
            }
        }
    }

    public static void AddSudent(ArrayList<Student> array) {
        //键盘录入数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学号");
        String id = sc.next();

        if (id.length() == 6 ) {
            boolean b = is_id(array,id);
            if (b) {

                System.out.println("请输入姓名");
                String name = sc.next();

                System.out.println("请输入年龄");
                int age = sc.nextInt();
                if (age > 0 && age < 100) {

                    System.out.println("请输入地址");
                    String address = sc.next();

                    //创建对象
                    Student stu = new Student();
                    stu.setId(id);
                    stu.setName(name);
                    stu.setAge(age);
                    stu.setAddress(address);

                    array.add(stu);
                    System.out.println("添加成功!");
                } else {
                    System.out.println("你输入的年龄有误!");
                    AddSudent(array);
                }
            }else{
                System.out.println("你输入的学号已重复!请重新输入.");
            }
        }else {
            System.out.println("您输入的学号长度有误,学号长度为6位");
            AddSudent(array);
        }


    }

    public static void FindAllStudent(ArrayList<Student> array) {
        //判断集合中是否为空
        if (array.size() == 0){
            System.out.println("无信息,请先添加数据");
        }else{
            System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t地址");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println("学号:" + s.getId() + "\t姓名:" + s.getName() + "\t" +"\t年龄:" + s.getAge() + "岁\t地址:" + s.getAddress());

            }
        }
    }

    public static void DeleteStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要删除学生的学号");
        String id = sc.next();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                array.remove(s);
                System.out.println("删除成功!");
                break;
            }else{
                System.out.println("您输入的学号不存在,删除失败!");
            }
        }
    }

    public static void SetStudent(ArrayList<Student> array){
        if (array.size() != 0) {
            //键盘录入数据
            Scanner sc = new Scanner(System.in);

            System.out.println("输入你要修改学生的学号:");
            String id = sc.next();

            System.out.println("请输入学生新的姓名:");
            String newname = sc.next();

            System.out.println("请输入学生新的年龄:");
            int newage = sc.nextInt();

            System.out.println("请输入学生新的地址:");
            String newaddress = sc.next();

            //创建学生对象并赋值
            Student newstu = new Student();
            newstu.setId(id);
            newstu.setName(newname);
            newstu.setAge(newage);
            newstu.setAddress(newaddress);

            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                //当集合内的id和输入的id相同时
                if (s.getId().equals(id)) {
                    //根据索引修改集合内容
                    array.set(i, newstu);
                    System.out.println("修改成功!");
                    break;
                }else{
                    System.out.println("您输入的学号有误");
                    System.out.println("修改失败!");
                }
            }
        }else{
            System.out.println("无信息,无法修改!");
        }
    }
    public static boolean is_id(ArrayList<Student> array, String id){
        boolean b = true;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)){
                 b = false;
                 break;
            }
        }
        return b;
    }
}
