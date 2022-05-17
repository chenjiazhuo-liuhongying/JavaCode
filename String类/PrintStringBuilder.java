package study_itheima.String类;

/**
 * @author :JiaGe
 * @date : 2022/5/10
 * @ApiNote :
 */
public class PrintStringBuilder {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
        String s = printStringBuilder(chs);
        System.out.println(s);

    }

    public static String printStringBuilder(char[] chs) {
        StringBuilder strb = new StringBuilder();
        System.out.println("遍历数组后:");
        //往StringBuilder添加内容要用append()方法
        strb.append("[");
        for (int i = 0; i < chs.length; i++) {
            if (i == chs.length - 1) {
                strb.append(chs[i]);

            } else {
                strb.append(chs[i]).append(",");
            }
        }
        strb.append("]");
        //将Stringbuilder转为String
        String s = strb.toString();
        //输出string字符串
        return s;

    }
}

