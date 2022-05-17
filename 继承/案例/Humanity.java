package study_itheima.继承.案例;

/**
 * @author :JiaGe
 * @date : 2022/5/15
 * @ApiNote :
 */
public class Humanity {
    private String name;
    private int age;

    public Humanity() {
    }

    public Humanity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void print(){
        System.out.println(getName() + "," + getAge());
    }
}
