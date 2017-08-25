package oo.day01;

/**
 * Created by ClownK on 17/8/24.<br>
 */
public class Cell {
    /**
     * 行为抽象：
     * 下落drop()
     * 左右移动moveLeft()
     * 显示行号列号信息getCellInfo()
     */
    //长、宽、高、形状、颜色、行号、列号
    //长、宽、高、形状 的再次抽象------>图片

    int row;
    int col;

    void drop(){
        row++;
    }

    void moveLeft(int n) {
        col -= n;
    }
    String getCellInfo(){
        return row+","+col;
    }



}
