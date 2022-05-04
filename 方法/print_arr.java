package study_itheima.方法;

public class print_arr {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        PrintArr(arr);

    }public static void PrintArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("]");
    }
}
