package study_itheima.String类;

/**
 * @author :JiaGe
 * @date : 2022/5/10
 * @ApiNote :
 *          StringBuilder()创建一个空白的可变字符对象,不含有任何内容
 */
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder();
        //strb.append("hello");      //添加任意类型的数据
        //strb.append("world");
        //strb.append("java");
        //链式编程
        strb.append("hello").append("word").append("java");

        System.out.println("str:"+strb);
        //reverse()方法可以将字符串逆序输出
        strb.reverse();

        System.out.println("strb反转:"+strb);

    }
}
