package study_itheima.面向对象.private_this关键字;

public class Studentdemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("小明");
        s1.setAge(12);
        s1.show();


        Student s2 = new Student();
        s2.setName("李华");
        s2.setAge(13);
        s2.show();
    }
}
