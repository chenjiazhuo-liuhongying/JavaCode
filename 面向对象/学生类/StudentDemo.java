package study_itheima.面向对象.学生类;

public class StudentDemo {
    public static void main(String[] args) {


        //对象1
        //创建对象
        Student s1 = new Student();
        s1.name = "小明";
        s1.age = 12;
        s1.result = 96;
        s1.student();
        s1.study();
        s1.doHomework();
        //对象2
        //创建对象
        Student s2 = new Student();
        s2.name = "小红";
        s2.age = 13;
        s2.result = 86;
        s2.student();
        s2.study();
        s2.doHomework();


    }
}
