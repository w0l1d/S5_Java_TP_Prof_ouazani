package tp9.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Converter extends JFrame {



    private JButton btnConv = new JButton("Conversion");
    private JFormattedTextField txtAmount = new JFormattedTextField(NumberFormat.getInstance());
    private JLabel lblResult = new JLabel("0 Euro");

    private JPanel pnlCadre = new JPanel(new BorderLayout());
    private JPanel pnlNorth = new JPanel(new GridLayout(1, 2));


    public Converter() {


        pnlNorth.add(txtAmount, 0);
        pnlNorth.add(btnConv, 1);
        pnlNorth.setVisible(true);

        pnlCadre.add(pnlNorth, BorderLayout.CENTER);
        pnlCadre.add(lblResult, BorderLayout.SOUTH);
        pnlCadre.setVisible(true);



        add(pnlCadre);




        btnConv.addActionListener(e -> {
            long i = (long)txtAmount.getValue();
            i *= 11;
            lblResult.setText(i + " Euro");
        });




        setTitle("Conversion Dirham -> Euro");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 110);
        setVisible(true);

    }


    public static void main(String[] args) {
        new Converter();
    }


}
