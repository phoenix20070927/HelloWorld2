package oo.day01;

/**
 * Created by ClownK on 17/8/24.<br>
 */
public class StudentTest {
    public static void main(String[] args) {


        Student zs = new Student();
        zs.name = "张三";
        zs.age = 25;
        zs.address = "河北廊坊";
        zs.study();
        zs.sayHi();

        Student ls = new Student();
        ls.name = "李四";
        ls.age = 26;
        ls.address = "河南郑州";
        ls.study();
        ls.sayHi();

        //一切对象的成员变量都有默认值，java中引用类型的成员变量的默认值是null，基本类型默认值都是0
        Student ww = new Student();
        ww.study();
        ww.sayHi();
    }
}
