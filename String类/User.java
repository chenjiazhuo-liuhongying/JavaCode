package study_itheima.String类;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        String user = "admin";
        String password = "123456";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String user1 = sc.next();

            if (user1.equals(user)) {
                System.out.println("请输入密码:");
                String passw = sc.next();
                if (passw.equals(password)) {
                    System.out.println("登录成功!!!");
                    break;
                }
                System.out.println("你输入的密码有误!!!");

            } else {
                if (2 - i == 0) {
                    System.out.println("登陆失败!!!");
                    System.out.println("错误次数已达上限,请明日再来");
                }
                System.out.println("你输入的用户名不存在!!");
                System.out.println("密码错误,你还有" + (2 - i) + "次机会");
            }
        }
    }
}
