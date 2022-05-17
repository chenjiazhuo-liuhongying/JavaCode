package study_itheima.String类;

import java.util.Scanner;

/**
 * 遍历使用charAt()方法,括号中填索引值
 * 字符串长度使用length()方法
 */
public class PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
        System.out.print("遍历后:[");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("]");


    }
}
