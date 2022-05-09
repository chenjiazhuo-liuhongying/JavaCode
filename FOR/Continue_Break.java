package study_itheima.循环;

public class Continue_Break {
    public static void main(String[] args) {
        Continue();
        System.out.println("-----------------");
        Break();
    }

    //跳出当前循环
    public static void Continue() {
        for (int i = 0; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                continue;

            }
        }
    }

    //终止当前循环
    public static void Break() {
        for (int i = 0; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                break;

            }
        }
    }
}
