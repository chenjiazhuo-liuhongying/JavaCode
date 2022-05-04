package study_itheima.方法;

public class get_max {
    public static void main(String[] args) {
        int[] arr = {20,40,30,80,60,10};
        GetMax(arr);

    }
    public static void GetMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值:" + max);
    }
}
