package oo.master.game;

/**
 * Created by ClownK on 17/8/27.<br>
 */
public class O extends Tetromino{

    O(){
        this(0, 0);
    }

    O(int row, int col) {
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row+1, col);
        cells[2] = new Cell(row, col+1);
        cells[3] = new Cell(row+1, col+1);
    }

}
