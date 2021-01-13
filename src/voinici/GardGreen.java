package voinici;
import java.awt.*;

public class GardGreen {
    private int row;
    private int col;

    public GardGreen(int row, int col){
        this.row= row;
        this.col= col;
    }
    public void render(Graphics g){
        g.fillOval(30,30,50,50);
        g.setColor(Color.GREEN);
    }
}
