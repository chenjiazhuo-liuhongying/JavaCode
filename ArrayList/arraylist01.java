package study_itheima.ArrayList集合;

import java.util.ArrayList;

/**
 * @author :JiaGe
 * @date : 2022/5/11
 * @ApiNote :
 */
public class arraylist01 {
    public static void main(String[] args) {
        //创建一个空的集合对象
        ArrayList<String> array = new ArrayList<>();
        //将元素添加到集合的末尾
        array.add("小明");
        //将元素插入到指定位置
        array.add(1,"小东");
        //array.add(2,"小东");        //错误，索引大于集合长度会报错
        System.out.println("集合的内容:" + array);

    }
}
