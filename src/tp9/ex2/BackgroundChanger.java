package tp9.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundChanger extends JFrame implements ActionListener {

    private JButton btnBlue = new JButton("Bleu");
    private JButton btnGreen = new JButton("Vert");

    private JPanel pnlColorScreen = new JPanel(new GridLayout());
    private JPanel pnlCadre = new JPanel(new BorderLayout());
    private JPanel pnlBtns = new JPanel(new FlowLayout(FlowLayout.CENTER));


    public BackgroundChanger() {

        btnBlue.addActionListener(this);
        btnGreen.addActionListener(this);

        pnlBtns.add(btnBlue);
        pnlBtns.add(btnGreen);


        pnlColorScreen.setBackground(Color.GRAY);
        pnlCadre.add(pnlColorScreen, BorderLayout.CENTER);
        pnlCadre.add(pnlBtns, BorderLayout.SOUTH);

        add(pnlCadre);


        setSize(200, 150);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BackgroundChanger();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        Color color = null;
        if (src.equals(btnBlue))
            color = Color.BLUE;
        else if (src.equals(btnGreen))
            color = Color.GREEN;

        if (color != null)
            pnlColorScreen.setBackground(color);

    }
}
