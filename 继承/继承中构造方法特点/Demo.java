package study_itheima.继承.继承中构造方法特点;

/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :默认会先访问父类的参构造方法,有参数就访问有参方法,无参就访问无参方法
 */
public class Demo {
    public static void main(String[] args) {
        Son s = new Son(10);
    }
}
