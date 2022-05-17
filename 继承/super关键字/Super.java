package study_itheima.继承.super关键字;

/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :
 *          super关键字和this关键字的用法相似
 *          *this:代表本类对象的引用
 *          *super:代表父类对象的引用
 *
 *          继承的访问特点:
 *          依次访问
 *             子类成员范围
 *             父类成员范围
 */
public class Super {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
        System.out.println("----------------");
        s.son_method();
        s.father_method();
    }
}
