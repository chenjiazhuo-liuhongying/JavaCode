package study_itheima.Random;

import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        //创建对象
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int num = random.nextInt(10);
            System.out.println("第" + i + "次获取随机数:" + num);

        }
        System.out.println("---------------------------------------------");
        random1();

    }

    //获取0-100的随机数
    public static void random1() {
        Random rd = new Random();
        int num = rd.nextInt(101);
        System.out.println("获取0-100的随机数:" + num);

    }


}
