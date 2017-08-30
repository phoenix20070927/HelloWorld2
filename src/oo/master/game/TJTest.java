package oo.master.game;

/**
 * Created by ClownK on 17/8/26.<br>
 *     T和J的测试类
 */
public class TJTest {
    public static void main(String[] args) {
        T t = new T();
        printWall(t);

        J j = new J();
        printWall(j);

    }
//    高扩展性方式实现
    private static void printWall(Tetromino cc){
        for(int i = 0; i < 20; i++){
            for (int j = 0; j < 10; j++) {

                boolean flag = false;
                for(int k = 0; k < cc.cells.length; k++){
                    if (i == cc.cells[k].row && j == cc.cells[k].col){
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

//    高效方式
//    private static void printWall(Cell[] cc ){
//        for(int i = 0; i < 20; i++){
//            for (int j = 0; j < 10; j++) {
//
//                if (i == cc[0].row && j == cc[0].col
//                        || i == cc[1].row && j == cc[1].col
//                        || i == cc[2].row && j == cc[2].col
//                        || i == cc[3].row && j == cc[3].col
//                        )
//                    System.out.print("*");
//                else
//                    System.out.print("-");
//
//            }
//            System.out.println();
//        }
//    }
}
