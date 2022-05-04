package study_itheima.方法;

public class demo04 {
    public static void main(String[] args) {
//    方法的重载:方法名一样,但方法类型和参数数量各有不同
        int i = sum(10,20);
        System.out.println(i);
        System.out.println("------------");
        double j = sum(10.0,20.0);
        System.out.println(j);
        System.out.println("------------");
        int k = sum(10,20,30);
        System.out.println(k);
    }
    public static int sum(int a,int b){
        return a + b;

    }
    public static double sum(double a,double b){
        return a + b;

    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }

}
