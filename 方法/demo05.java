package study_itheima.方法;

public class demo05 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println("调用change方法前:" + a);
        change(a);
        System.out.println("调用change方法后:" + a);//值不变


        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前:" + arr[1]);
        change(arr);
        System.out.println("调用change方法后:" + arr[1]);//值改变

    }

    public static void change(int[] arr) {      //引用型参数
        arr[1] = 200;

    }

    public static void change(int a) {          //基本类型参数
        a = 100;
    }
}
