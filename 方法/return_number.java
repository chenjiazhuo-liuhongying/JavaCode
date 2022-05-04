package study_itheima.方法;

public class return_number {
    public static void main(String[] args) {
//        取偶数
        boolean a = isevennumber(10);//a用于接收返回值
        System.out.println(a);//输出返回值
        System.out.println("-------------------");


//        取最大值
        int max = getMax(10,20);
        System.out.println(max);

    }
    public static boolean isevennumber(int number){
        if (number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int getMax(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
