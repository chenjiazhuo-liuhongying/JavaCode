package study_itheima.方法;

public class demo03 {
    public static void main(String[] args) {
//        形参和实参
//        传入的参数了的类型要对
        getMax(10,20);
        System.out.println("----------------------");
        int a = 15;
        int b = 30;
        getMax(a,b);
    }

    public static void getMax(int a,int b) {
//        最大值
        System.out.println("最大值是:");
        if (a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }

}
