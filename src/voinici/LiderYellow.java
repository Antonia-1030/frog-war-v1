package voinici;
import java.awt.*;

public class LiderYellow {
    private int row;
    private int col;

    public LiderYellow(int row, int col){
        this.row= row;
        this.col= col;
    }
    public void render(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(30,30,50,50);
    }
}
