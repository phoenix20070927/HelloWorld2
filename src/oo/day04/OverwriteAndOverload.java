package oo.day04;

/**
 * Created by ClownK on 17/8/28.<br>
 */
public class OverwriteAndOverload {
    public static void main(String[] args) {

        Goo go = new Goo();
        Eoo o = new Foo();
        go.test(o);
    }
}

class Goo{
    void  test(Eoo o){
        System.out.println("父类参数");
        o.show();
    }
    void test(Foo o){
        System.out.println("子类参数");
        o.show();
    }
}
class Eoo{
    void show(){
        System.out.println("父类Show");
    }
}
class Foo extends Eoo{
    void show(){
        System.out.println("子类Show");
    }
}