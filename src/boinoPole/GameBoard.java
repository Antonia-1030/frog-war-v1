package boinoPole;
//zadavam kato otdelni,zashtoto ne mojah v 1 class da gi napravya
import voinici.GardYellow;
import voinici.GardGreen;
import voinici.LiderGreen;
import voinici.LiderYellow;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame{
    public final int Voinici=10;
    private ArrayList<Object> voiska=new ArrayList<>();

    public GameBoard() {
        //Razmer i zatvaryane
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        gameSetup();
    }

    public void gameSetup(){
            //Zeleni jabi
            voiska.add(new GardGreen(0,0));
            voiska.add(new GardGreen(0,1));
            voiska.add(new GardGreen(0,2));
            voiska.add(new GardGreen(0,3));
            voiska.add(new LiderGreen(0,4));

            //Jalti jabi
            voiska.add(new GardYellow(4,4));
            voiska.add(new GardYellow(4,3));
            voiska.add(new GardYellow(4,2));
            voiska.add(new GardYellow(4,1));
            voiska.add(new LiderYellow(4,0));

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 5; col++) {

                BoinaPoziciya tile = new BoinaPoziciya(row, col);
                tile.render(g);
                GardGreen g1=new GardGreen(row,col);
                g1.render(g);
                GardYellow g2=new GardYellow(row,col);
                g2.render(g);
                LiderGreen l1=new LiderGreen(row,col);
                l1.render(g);
                LiderYellow l2=new LiderYellow(row,col);
                l2.render(g);
            }
        }
    }
}
