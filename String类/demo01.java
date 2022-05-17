package study_itheima.String类;

import java.util.Scanner;

/**
 * 遍历并输出字符串的种类组成
 */

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int A = 0;
        int a = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char chs = str.charAt(i);
            if (chs >= 'A' && chs <= 'Z') {
                A++;
            } else if (chs >= 'a' && chs <= 'z') {
                a++;
            } else if (chs >= '0' && chs <= '9'){
                num++;
            }
        }
        System.out.println("大写字母有:" + A + "个");
        System.out.println("小写字母有:" + a + "个");
        System.out.println("数字有:" + num + "个");

    }
}
