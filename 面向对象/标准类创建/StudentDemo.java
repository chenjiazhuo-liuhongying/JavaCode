package study_itheima.面向对象.标准类创建;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();             //无参构造方法
        s1.setName("小明");
        s1.setAge(12);
        s1.show();

        Student s2 = new Student("李华", 13);     //带参构造方法
        s2.show();
    }
}
