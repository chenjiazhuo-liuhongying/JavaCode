package study_itheima.数据类型;
/*
* 数据类型转换
* 自动转换
* 强制转换
*/

public class Data_Conversion {
    public static void main(String[] args){
        //自动转换
        byte b1 = 8;
        int i1 = b1;
        int i2 = 123456;
        long l1 = i2;
        float f1 = l1;
        double d1 = f1;
        System.out.println("byte->int:"+i1);
        System.out.println("int->long:"+l1);
        System.out.println("long->float:"+f1);
        System.out.println("float->double:"+d1);
        System.out.println("-------------------");
        //强制转换
        int int1 = 88888;
        byte byte1 = (byte)int1;
        char char1 = (char)int1;
        System.out.println("int->byte:"+byte1);
        System.out.println("int->char:"+char1);
    }
}