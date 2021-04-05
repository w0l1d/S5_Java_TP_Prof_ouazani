package tp8.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Cadre extends JFrame {

    public Cadre() {
        this.setTitle("Cadre du exercice 2 :");

        this.setResizable(false);


        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.add(new JButton("Ok"));

        this.add(panel);
        panel.setVisible(true);



        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 150);

        this.setVisible(true);



    }


    public static void main(String[] args) {
        new Cadre();
    }
}
