package study_itheima.方法;

public class HomeWork {
//    方法重写:判断两个数是否相等
    public static void main(String[] args) {
        boolean x = equal(10,10);
        System.out.println(x);
        System.out.println("----------------------------");
        boolean y = equal(10.2,10.3);
        System.out.println(y);


    }
    public static boolean equal(int a,int b){
        return a == b;

    }
    public static boolean equal(double a,double b){
        return a == b;
    }

}
