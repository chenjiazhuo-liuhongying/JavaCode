package study_itheima.面向对象.private_this关键字;

/**
 * private关键字
 * 把成员变量用private修饰
 * 提供set+变量名()/get+变量名()方法
 * <p>
 * this关键字
 * 方法的形参和成员变量同名,用this关键字区分
 * 不带this修饰的是形参,带this的是成员变量
 * <p>
 * 解决局部变量隐藏成员变量时用this
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("姓名:" + name + ",年龄:" + age);
    }
}
