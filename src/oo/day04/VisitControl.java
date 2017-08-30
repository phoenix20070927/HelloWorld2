package oo.day04;

/**
 * Created by ClownK on 17/8/29.<br>
 */
public class VisitControl {

    public int a;           //任何类
    protected int b;        //同包类、本类、子类
    int c;                  //同包类、本类
    private int d;          //本类

    public VisitControl(){
        a = 0;
        b = 1;
        c = 2;
        d = 3;
    }
    void show(){
        System.out.println(a + "-" + b + "-" + c + "-" + d);
    }
}

class Aoo{
    VisitControl v;
}

class Boo extends VisitControl{
    void myShow(){
        System.out.println(c);
    }
}


class Ao{
    int a;
    static int b;
    void show(){
        a++;
        b++;
    }
    static void test(){ //静态方法，没有隐式传递this，实例变量a必须通过对象来访问
//        a++;    //编译错误
        b++;
    }
}