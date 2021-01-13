package boinoPole;
import java.awt.*;

public class BoinaPoziciya {
    private int row;
    private int col;
    private int fieldSize;

    public BoinaPoziciya(int row, int col){
        this.row= row;
        this.col= col;
        this.fieldSize= 100;
    }
    public void render(Graphics g){
        int tileX= this.col * this.fieldSize;
        int tileY= this.row * this.fieldSize;

        g.setColor(Color.WHITE);
        g.fillRect(tileX,tileY,this.fieldSize, this.fieldSize);
    }

}
