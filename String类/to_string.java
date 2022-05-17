package study_itheima.String类;

/**
 * @author :JiaGe
 * @date : 2022/5/10
 * @ApiNote :
 */
public class to_string {
    public static void main(String[] args) {
        //直接创建StringBuilder类型
        StringBuilder strb = new StringBuilder();
        strb.append("hello");
        strb.append(12);
        System.out.println("StringBuilder类型:"+strb);

        //to String()方法将StringBuilder转换成String
        String s = strb.toString();
        System.out.println("转换成String:"+s);

        //通过构造方法将String转换成StringBuilder类型
        String str = "java";
        StringBuilder b = new StringBuilder(str);
        System.out.println("转换成StringBuilder:"+b);
    }
}
