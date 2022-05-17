package study_itheima.继承.重写;


/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :
 *          @Override 检测重写父类方法
 *
 *          方法重写注意事项:
 *          *私有方法不能被重写
 *          *子类访问方法权限不能比父类低(public > 默认 > private)
 */
public class NewPhone extends Phone{
    @Override
    public void call(String name){
        System.out.println("开启视频功能");
        //System.out.println("给" + name + "打电话");
        super.call(name);
    }
}
