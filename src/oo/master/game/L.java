package oo.master.game;

/**
 * Created by ClownK on 17/8/27.<br>
 */
public class L extends Tetromino{


    L(){
        this(0, 0);
    }

    L(int row, int col) {
        cells = new Cell[4];
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col+1);
        cells[2] = new Cell(row, col+2);
        cells[3] = new Cell(row+1, col+2);
    }

}
