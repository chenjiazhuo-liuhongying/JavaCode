package study_itheima.循环;

public class While_1 {

    public static void main(String[] args) {
        while_1();
        System.out.println("------------------");
        while_2();

    }

    //while输出5次hello world
    public static void while_1() {
        int i = 0;
        while (i <= 5) {
            i++;
            System.out.println("hello world");

        }
    }

    //0.1mm的纸叠多少次能达到88444.43m
    public static void while_2() {
        double deep = 0.1;
        int i = 0;
        while (deep <= 88444.30) {
            deep *= 2;
            i++;
        }
        System.out.println("一共叠了" + i + "次");
    }


}
