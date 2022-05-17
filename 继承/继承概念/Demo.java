package study_itheima.继承.继承概念;

/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :
 *          格式:public class 子类名 extends 父类名
 *
 *          父类:被称为基类、超类
 *          子类:称为派生类
 *
 *          继承中子类的特点:
 *              子类可以有父类的内容还可以有自己的内容
 *
 *          继承的优点:
 *              提高代码的复用性;
 *              提高了代码的维护性;
 *
 *          继承的弊端:
 *              继承让类和类之间产生了关,削弱了子类的独立性
 *
 *          什么时候用继承:
 *              当存在包含关系时,如A是B的一种,或B是A的一种
 *              苹果和水果,猫和动物……
 *          继承的访问特点:
 *          依次访问
 *              子类局部范围
 *              子类成员范围
 *              父类成员范围
 *          继承的重要事项:
 *              只支持单继承,不支持多继承
 *              支持多层继承
 */
public class Demo {
    public static void main(String[] args) {
        Father f = new Father();
        f.show();
        Son s = new Son();
        s.lookOver();
        s.show();
    }
}
