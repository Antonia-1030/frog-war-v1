package voinici;
import java.awt.*;

public class GardYellow {
    private int row;
    private int col;

    public GardYellow(int row, int col){
        this.row= row;
        this.col= col;
    }
    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(480, 480, 200, 200);
    }
}
