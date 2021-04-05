package tp8.ex3;

import javax.swing.*;
import java.awt.*;

public class GridLayoutt extends JFrame {


    public GridLayoutt() {
        JPanel pnl = new JPanel();
        GridLayout grid = new GridLayout();
        grid.setRows(3);
        pnl.setLayout(grid);

        for (int i = 0; i < 5; i++)
            pnl.add(new JButton((i + 1) + ""), i);

        pnl.setVisible(true);
        add(pnl);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350, 250);
        setVisible(true);



    }


    public static void main(String[] args) {
        new GridLayoutt();
    }

}
