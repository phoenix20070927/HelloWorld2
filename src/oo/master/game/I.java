package oo.master.game;

/**
 * Created by ClownK on 17/8/27.<br>
 */
public class I extends Tetromino{
        I(){
            this(0,0);
        }
        I(int row, int col){
            cells[0] = new Cell(row, col);
            cells[1] = new Cell(row, col + 1);
            cells[2] = new Cell(row, col + 2);
            cells[3] = new Cell(row, col + 3);
        }





}
