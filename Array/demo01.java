package study_itheima.Array;

public class demo01 {
    public static void main(String[] args) {

        array01();

        System.out.println("---------------------------------------");

        array02();

        System.out.println("---------------------------------------");

        arr03();

        System.out.println("---------------------------------------");
        arr04();

    }
    public static void array01(){
        //        数组动态初始化
        int[] arr = new int[10];

        arr[0] = 100;
// int类型数组 数组名    定义数组长度

//      数组元素访问

        System.out.println(arr);//输出数组地址
        System.out.println(arr[0]);//输出数组的值--索引

    }

    public static void array02() {
//        数组静态初始化
//        int[] arr2 = new int[]{1,2,3};       写法1
        int[] arr2 = {1,2,3};                //写法2
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);



    }
    public static void arr03(){
//        遍历数组
        int[] arr3 = {1,2,3,4,5};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);

        }

    }
    public static void arr04(){
//        获取最大值
        int[] arr4 = {1,2,3,4,5};
        int max = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max){
                max = arr4[i];
            }

        }
        System.out.println(max);

    }
}
