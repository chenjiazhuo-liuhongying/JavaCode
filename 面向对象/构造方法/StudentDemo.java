package study_itheima.面向对象.构造方法;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("小明");
        s2.show();

        Student s3 = new Student(30);
        s3.show();

        Student s4 = new Student("李华",12);
        s4.show();


    }
}
