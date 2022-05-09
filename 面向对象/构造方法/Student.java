package study_itheima.面向对象.构造方法;

/**
 * 构造方法是一种特殊的方法
 * 作用:创建对象
 * 功能:主要是完成完成对象数据的初始化
 * 注意事项:
 * 构造方法的创建
 * 没有定义构造方法,系统给出默认的无参构造方法
 * 定义了构造方法系统将不再提供默认方法
 * 方法的重载
 * 如果定义了带参构造方法,还要使用无参构造方法,
 * 就必须写一个无参构造方法
 * 推荐使用方式
 * 无论是否使用,都手动写无参构造方法
 */
public class Student {
    private String name;
    private int age;

    public Student() {      //无参构造方法
        System.out.println("无参构造方法");
    }

    public Student(String name){            //带string参数的构造方法
        this.name = name;

    }

    public Student(int age){                //带int参数的构造方法
        this.age = age;
    }
    public Student(String name,int age){    //带string和int参数的构造方法
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
