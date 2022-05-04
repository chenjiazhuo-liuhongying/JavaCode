package study_itheima.方法;

public class demo01 {
    //    方法的定义和调用
    public static void main(String[] args) {
        max();
        System.out.println("---------------");
        getMax();
    }

    public static void max() {
        int a = 10;
        if (a % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

    public static void getMax() {
//        取最值
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a + "比" + b + "大");
        } else {
            System.out.println(b + "比" + a + "大");

        }

    }
}
