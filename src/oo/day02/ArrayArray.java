package oo.day02;

/**
 * Created by ClownK on 17/8/26.<br>
 */
public class ArrayArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        int[][] arr1 = new int[3][4]; //矩阵型数组，
        arr1[0] = new int[4];
        arr1[1] = new int[4];

        Cell[] cells1 = new Cell[]{
            new Cell(),
            new Cell(),
            new Cell()
        };

        int[][] arr2 = new int[][]{
                new int[4],
            new int[4],
            new int[4],
        };

        arr2[1][0] = 1;
        arr2[2][1] = 3;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println("元素"+i+"-"+j+" is "+arr2[i][j]);
            }
        }


    }
}
