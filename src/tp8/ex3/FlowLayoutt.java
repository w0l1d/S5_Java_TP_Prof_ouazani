package tp8.ex3;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutt extends JFrame {

    public FlowLayoutt() {

        JPanel pnl = new JPanel(new FlowLayout());
        for (int i = 1; i < 6; i++) {
            pnl.add(new JButton("button " + i));
        }
        pnl.setVisible(true);
        this.add(pnl);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 150);
        setVisible(true);
    }


    public static void main(String[] args) {
        new FlowLayoutt();




    }

}
