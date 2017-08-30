package oo.day04vs;
import oo.day04.VisitControl;

/**
 * Created by ClownK on 17/8/29.<br>
 */
public class VistControlOutPackage {
        VisitControl v;
        VistControlOutPackage(){
            v = new VisitControl();
            System.out.println(v.a);


        }
}

class Doo extends VisitControl{
    void show(){
        a = 10;
        b = 11;
//        c = 12; //c是无修饰词成员变量，因此无法在类外或者包外访问，包外子类也不行
//        d = 13; //d是private，不可访问
    }
}

//class Eoo extends Aoo(){//报错，只有xx.java中命名为xx的那个类可以是public，其他类在类外不可见，因此无法被继承，编译错误
//
//}