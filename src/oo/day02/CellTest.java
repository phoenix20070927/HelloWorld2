package oo.day02;

/**
 * Created by ClownK on 17/8/24.<br>
 */
public class CellTest {
    public static void main(String[] args) {
        /*
        Cell c = new Cell();
        c.row = 2;
        c.col = 5;
        c.drop();
        c.moveLeft(3);
        String ci = c.getCellInfo();
        System.out.println(ci);
        */


        Cell c = new Cell(2,5);
//        printWall(c);
        c.drop();
        c.moveLeft();
        c.moveRight();



    }

//    public static void printWall(Cell cc ){
//        for(int i = 0; i < 20; i++){
//            for (int j = 0; j < 10; j++) {
//                if (i == cc.row && j == cc.col)
//                    System.out.print("*");
//                else
//                    System.out.print("-");
//            }
//            System.out.println();
//        }
//    }
}

