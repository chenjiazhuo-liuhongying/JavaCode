package study_itheima.面向对象.手机类;

public class Logview {
    //    使用对象
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
//        使用成员变量
        System.out.println(p.brand);
        System.out.println(p.money);

        p.brand = "iPhone13";
        p.money = 5999;

        System.out.println(p.brand);
        System.out.println(p.money);
//        使用成员方法
        p.call();
        p.Message();
    }
}
