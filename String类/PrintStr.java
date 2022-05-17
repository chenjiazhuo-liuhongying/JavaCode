package study_itheima.String类;

/**
 * @author 耿耿
 */
public class PrintStr {
    public static void main(String[] args) {
        String str = "abcde";
        printStr(str);

    }

    public static void printStr(String str) {
        System.out.print("[");
        for (int i = 0; i < str.length(); i++) {
            //判断该字符是否是最后一个字符串,是就不加" , ",不是就加" , "
            if (i == str.length() - 1) {
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i) + " , ");
            }
        }
        System.out.println("]");
    }
}
