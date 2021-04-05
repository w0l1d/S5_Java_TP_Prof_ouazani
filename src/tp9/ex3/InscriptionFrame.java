package tp9.ex3;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InscriptionFrame extends JFrame {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("'le' dd/MM/yyyy 'à' hh:mm:ss");
    private DecimalFormat decimalFormat = new DecimalFormat("#,##.00 DH");
    private MaskFormatter maskFormatter = new MaskFormatter("0#.##.##.##.##");

    private JTextField txtNom = new JTextField();
    private JTextField txtPrenom = new JTextField();
    private JFormattedTextField txtDate = new JFormattedTextField(dateFormat);
    private JFormattedTextField txtTel = new JFormattedTextField(maskFormatter);
    private JTextField txtLogin = new JTextField();
    private JPasswordField txtPwd = new JPasswordField();
    private JFormattedTextField txtMontant = new JFormattedTextField(decimalFormat);
    private JTextArea txtAdresse = new JTextArea();


    private JLabel lblNom = new JLabel("Nom", SwingConstants.LEFT);
    private JLabel lblPrenom = new JLabel("Prenom", SwingConstants.LEFT);
    private JLabel lblDate = new JLabel("Date d'inscription", SwingConstants.LEFT);
    private JLabel lblTel = new JLabel("Telephone", SwingConstants.LEFT);
    private JLabel lblLogin = new JLabel("Login", SwingConstants.LEFT);
    private JLabel lblPwd = new JLabel("Mot de passe", SwingConstants.LEFT);
    private JLabel lblMontant = new JLabel("Montant a payer", SwingConstants.LEFT);
    private JLabel lblAdresse = new JLabel("Adresse", SwingConstants.LEFT);

    private JLabel lblSexe = new JLabel("Sexe", SwingConstants.LEFT);



    private ButtonGroup groupSexe = new ButtonGroup();
    private JRadioButton radioMale = new JRadioButton("Homme");
    private JRadioButton radioFemale = new JRadioButton("Femme");



    private JCheckBox cBoxTennis = new JCheckBox("Tennis");
    private JCheckBox cBoxSquash = new JCheckBox("Squash");
    private JCheckBox cBoxNat = new JCheckBox("Natation");
    private JCheckBox cBoxAthl = new JCheckBox("Athletisme");
    private JCheckBox cBoxRand = new JCheckBox("Randonnee");
    private JCheckBox cBoxFoot = new JCheckBox("Foot");
    private JCheckBox cBoxBasket = new JCheckBox("Basket");
    private JCheckBox cBoxVolley = new JCheckBox("Volley");
    private JCheckBox cBoxPel = new JCheckBox("Pelanque");


    private JButton btnOk = new JButton("Ok");
    private JButton btnCancel = new JButton("Annuler");


    private BorderLayout borderCadre = new BorderLayout();
    private GridLayout gridLoisirs = new GridLayout(9, 1, 7, 10);
    private GridLayout gridInputs = new GridLayout(17, 1, 7, 5);
    private FlowLayout flowBtn = new FlowLayout(FlowLayout.CENTER);
    private FlowLayout flowSexe = new FlowLayout(FlowLayout.CENTER);

    private JPanel pnlLoisirs = new JPanel(gridLoisirs);
    private JPanel pnlInputs = new JPanel(gridInputs);
    private JPanel pnlBtns = new JPanel(flowBtn);
    private JPanel pnlSexe = new JPanel(flowSexe);
    private JPanel pnlCadre = new JPanel(borderCadre);


    public InscriptionFrame() throws ParseException {
        pnlLoisirs.add(cBoxTennis);
        pnlLoisirs.add(cBoxSquash);
        pnlLoisirs.add(cBoxNat);
        pnlLoisirs.add(cBoxAthl);
        pnlLoisirs.add(cBoxRand);
        pnlLoisirs.add(cBoxFoot);
        pnlLoisirs.add(cBoxBasket);
        pnlLoisirs.add(cBoxVolley);
        pnlLoisirs.add(cBoxPel);

        pnlLoisirs.setVisible(true);


        pnlBtns.add(btnOk);
        pnlBtns.add(btnCancel);
        pnlBtns.setVisible(true);




        lblNom.setLabelFor(txtNom);
        lblPrenom.setLabelFor(txtPrenom);
        lblAdresse.setLabelFor(txtAdresse);
        lblDate.setLabelFor(txtDate);
        lblLogin.setLabelFor(txtLogin);
        lblPwd.setLabelFor(txtPwd);
        lblMontant.setLabelFor(txtMontant);
        lblTel.setLabelFor(txtTel);

        pnlInputs.add(lblNom);
        pnlInputs.add(txtNom);
        pnlInputs.add(lblPrenom);
        pnlInputs.add(txtPrenom);
        pnlInputs.add(lblDate);
        pnlInputs.add(txtDate);
        pnlInputs.add(lblTel);
        pnlInputs.add(txtTel);
        pnlInputs.add(lblLogin);
        pnlInputs.add(txtLogin);
        pnlInputs.add(lblPwd);
        pnlInputs.add(txtPwd);
        pnlInputs.add(lblMontant);
        pnlInputs.add(txtMontant);
        pnlInputs.add(lblAdresse);
        pnlInputs.add(txtAdresse);

        txtMontant.setValue(10.2);


        groupSexe.add(radioMale);
        groupSexe.add(radioFemale);
        pnlSexe.add(lblSexe);
        pnlSexe.add(radioMale);
        pnlSexe.add(radioFemale);
        pnlInputs.add(pnlSexe);

        pnlInputs.setVisible(true);




        pnlCadre.add(pnlLoisirs, BorderLayout.EAST);
        pnlCadre.add(pnlInputs, BorderLayout.CENTER);
        pnlCadre.add(pnlBtns, BorderLayout.SOUTH);



        pnlCadre.setVisible(true);
        this.add(pnlCadre);

        setTitle("Melange de Layouts");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 600);
        setVisible(true);

    }



}
