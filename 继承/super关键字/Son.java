package study_itheima.继承.super关键字;

/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :
 */
public class Son extends Father {
    public int age = 30;

    public void show() {
        int age = 20;
        System.out.println("本类局部变量:" + age);
        System.out.println("本类成员变量:" + this.age);
        System.out.println("父类成员变量:" + super.age);
    }
    public void son_method(){
        System.out.println("子类成员方法1");
    }
    public void father_method(){
        System.out.println("子类成员方法2");
        super.father_method();
    }

}
