package study_itheima.循环;

public class FOR {
    public static void main(String[] args) {
        Out_1_5();
        System.out.println("-------------");
        Out_5_1();
        System.out.println("-------------");
        Out_hello_world();
        System.out.println("-------------");
        Out_sum();
        System.out.println("-------------");
        Out_even_number();
        System.out.println("-------------");
        Out_number();
        System.out.println("-------------");
        Out_number_quantity();

    }

    public static void Out_1_5() {
        //输出1-5的数
        for (int i = 1; i <= 5; i++) {
            System.out.println("i依次输出" + i);
        }
    }

    public static void Out_5_1() {
        //输出1-5的数
        for (int i = 5; i >= 1; i--) {
            System.out.println("i依次输出" + i);
        }
    }

    public static void Out_hello_world() {
        //输入5次hello world
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello world");
        }
    }

    public static void Out_sum() {
        //输出1-5的和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1-5的和：" + sum);
    }

    public static void Out_even_number() {
        //输出1-100的偶数和
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100之间的偶数和：" + sum);
    }

    public static void Out_number() {
        //输出100-999的水仙花数

        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println("依次输出水仙花数：" + i);
            }

        }
    }

    public static void Out_number_quantity() {
        //输出100-999的水仙花数的个数
        int quantity = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                quantity++;
            }


        }
        System.out.println("水仙花数的总数" + quantity);
    }
}
