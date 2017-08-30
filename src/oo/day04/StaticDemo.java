package oo.day04;

import oo.master.game.L;

/**
 * Created by ClownK on 17/8/29.<br>
 */
public class StaticDemo {
    public static void main(String[] args) {
        Loo l = new Loo();
        l.show();
        Loo l2 = new Loo();
        l2.show();
    }
}

class  Moo{
    int a;
    static int b;
    Moo(){
        a = 1;
        b = 2;
    }
    void show(){
        a = 1;
        b = 2;
    }
    static void test(){
//        a = 1;
        b = 2;
    }
}

class Loo{
    int a;
    static int b;
    Loo(){
        a++;
        b++;
    }

    void show(){
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}