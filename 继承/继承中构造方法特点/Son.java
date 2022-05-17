package study_itheima.继承.继承中构造方法特点;

/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :
 */
public class Son extends Father{
    public Son(){
        super();
        System.out.println("子类无参构造方法");
    }
    public Son(int age){
        //super(10);
        System.out.println("子类有参构造方法");
    }
}
