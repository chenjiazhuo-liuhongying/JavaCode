package study_itheima.循环;

public class For_in_For {
    public static void main(String[] args) {
        for_in_for1();
    }

    //循环的嵌套
    public static void for_in_for1() {
        for (int h = 0; h < 4; h++) {
            for (int m = 0; m < 5; m++) {
                System.out.println(h + "时" + m + "分");

            }
            System.out.println("-----------------");

        }
    }
}
