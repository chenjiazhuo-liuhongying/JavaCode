package study_itheima.Random;

import java.util.Random;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {

        Random rd = new Random();
        int num1 = rd.nextInt(10);

        while (true) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num > num1) {
                System.out.println(num + "数字大了");
            } else if (num < num1) {
                System.out.println(num + "猜小了");
            } else {
                System.out.println("猜对了数字" + num);
                break;
            }
        }
    }
}