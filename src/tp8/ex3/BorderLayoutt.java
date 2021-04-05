package tp8.ex3;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutt extends JFrame {


    public BorderLayoutt() {
        JPanel pnl = new JPanel(new BorderLayout());
        pnl.add(new Button("Ouest"), BorderLayout.WEST);
        pnl.add(new Button("Nord"), BorderLayout.NORTH);
        pnl.add(new Button("Est"), BorderLayout.EAST);
        pnl.add(new Button("Sud"), BorderLayout.SOUTH);
        pnl.add(new Button("Centre"), BorderLayout.CENTER);

        pnl.setVisible(true);
        add(pnl);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350, 250);
        setVisible(true);


    }

    public static void main(String[] args) {
        new BorderLayoutt();
    }

}
