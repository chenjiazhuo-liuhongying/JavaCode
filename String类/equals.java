package study_itheima.String类;
/**
 * 利用equals()方法来比较两个字符串的内容是否相同
 */
public class equals {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        String s1 = new String(chars);
        String s2 = new String(chars);

        String s3 = "abc";
        String s4 = "abc";

        //比较地址值,String是引用型数据
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println("==========");

        //equals方法比较两个字符串是否相等
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }

}
