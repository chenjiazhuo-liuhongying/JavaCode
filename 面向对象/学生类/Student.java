package study_itheima.面向对象.学生类;

public class Student {
    String name;
    int age;
    int result;

    public void study() {
        if (result >= 60 && result < 80) System.out.println("及格");
        else if (result >= 80 && result < 90) {
            System.out.println("成绩良好");
        } else if (result >= 90) {
            System.out.println("成绩优秀");
        } else {
            System.out.println("成绩不及格!!!");
        }
    }

    public void doHomework() {
        System.out.println("作业完成!");
    }

    public void student() {
        System.out.println("姓名:" + name + "," + age + "," + result);


    }
}
