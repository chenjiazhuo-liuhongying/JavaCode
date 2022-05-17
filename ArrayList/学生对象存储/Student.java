package study_itheima.ArrayList集合.学生对象存储;

import javax.naming.Name;

/**
 * @author :JiaGe
 * @date : 2022/5/14
 * @ApiNote :
 */
public class Student {

    private String name;
    private int age;

    public Student() {
    }

    //有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void print(){
        System.out.println("姓名:" + name + ",年龄:"+age);

    }


}