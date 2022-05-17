package study_itheima.继承.案例;

/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :
 */
public class Demo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("李老师");
        t.setAge(30);
        t.print();
        t.teach();

        Student s = new Student();
        s.setName("小明");
        s.setAge(12);
        s.print();
        s.study();
    }
}
