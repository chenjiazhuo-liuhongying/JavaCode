package study_itheima.方法;

public class demo02 {
    //    带参方法的调用
    public static void main(String[] args) {
//        常量值
        evennumber(10);//实参
//        变量值
        int a = 15;
        evennumber(a);//形参

    }

    public static void evennumber(int number) {
        if (number % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

    }
}
