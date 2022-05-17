package study_itheima.String类;

import java.util.Scanner;

/**
 * @author :JiaGe
 * @date : 2022/5/11
 * @ApiNote :
 */
public class reversStringBuilder {
    public static void main(String[] args) {
        //方法1
        //System.out.println("反转之前:");
        //StringBuilder strb = new StringBuilder();
        //Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        //strb.append(str);
        //strb.reverse();
        //System.out.println("反转之后:" + strb);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = reverse(s);
        System.out.println("反转之后:" + str);
    }
    public static String reverse(String s){
        //方法2
        //StringBuilder strb = new StringBuilder(s);
        //strb.reverse();
        //String str = strb.toString();
        //return str;
        //方法3   更简洁
        return new StringBuilder(s).reverse().toString();

    }
}
