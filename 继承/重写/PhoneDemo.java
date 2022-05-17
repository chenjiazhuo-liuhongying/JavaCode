package study_itheima.继承.重写;

/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("小明");
        System.out.println("----------------");
        NewPhone np = new NewPhone();
        np.call("小东");
    }
}
