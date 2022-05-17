package study_itheima.ArrayList集合;

import sun.java2d.loops.DrawRect;

import java.util.ArrayList;

/**
 * @author :JiaGe
 * @date : 2022/5/11
 * @ApiNote :
 * 集合的增删改查
 *      增：add（“”），add（index，“”）
 *      删：remove（index）   删除指定索引的元素
 *      改：set（index，“”）  修改指定索引的元素
 *      查：get（index）     返回指定索引的元素
 * 集合的长度
 *      size()      返回集合的长度
 * 注意
 *      在add(index, ) remove(index) set(index, ),get(index)中
 *      若索引值超过集合的索引的最大值,将会报错
 *      IndexOutOfBoundsException
 */
public class arraylist02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //增
        array.add("小明");
        array.add("小红");
        array.add("小蓝");

        //删
        //array.remove(1);          //array:[小明, 小蓝]

        //改
        //array.set(1,"小李");      //array:[小明, 小李, 小蓝]

        //查
        //System.out.println(array.get(2));   //小蓝

        //返回集合长度
        System.out.println("array的长度:" + array.size());
        //array的长度:3

        System.out.println("array:" + array);


    }
}
