package tp9.ex4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import com.toedter.calendar.JDateChooser;


	public class EX4 extends JFrame implements ActionListener {
	   private JPanel pan1 = new JPanel();
	   private JPanel pan2 = new JPanel();
	   private JPanel pan3 = new JPanel();
	   private JPanel pan4 = new JPanel();
	   private JPanel pan5 = new JPanel();
	   private JPanel pan6 = new JPanel();
	   public JTextField FNom=new JTextField("", 20);
	   JDateChooser dateChooser = new JDateChooser();

	   //Date FDate=new Date();
       public JCheckBox foot=new JCheckBox("Foot");
       public JCheckBox basket=new JCheckBox("Basket");
       public JCheckBox tennis=new JCheckBox("Tennis");
       public JCheckBox squash=new JCheckBox("Squash");
       public JCheckBox natation=new JCheckBox("Natation");
       public JCheckBox athletisme=new JCheckBox("Athlétisme");
       public JCheckBox randonnee=new JCheckBox("Randonnée");
       public JCheckBox volley=new JCheckBox("Volley");
       public JCheckBox pelanque=new JCheckBox("Pelanque");
       public JRadioButton homme=new JRadioButton("Homme");
       public JRadioButton femme=new JRadioButton("Femme");
       public ButtonGroup groupe= new ButtonGroup();
	   JButton ajouter=new JButton("Ajouter enregi");
	   JButton fermer=new JButton("Fermer");
	   JButton modifier=new JButton("Modifier");
	   JButton supprimer=new JButton("Supprimer");
	   JButton afficher=new JButton("Afficher tab");
	   JButton ajouter_table=new JButton("Ajouter une table");
	   JButton reset= new JButton("Vider");
	   String []list= {"Option 1", "Option 2", "Option 3", "Option 4"};
	   public JComboBox CBox= new JComboBox(list);
	   public JTextField login= new JTextField("", 20);
	   
	   private Connection con;
	   private Statement st;
	   private ResultSet rs;
	   
	   public void setFNom(String nom) {
		  FNom.setText(nom);
	   }
	   
	   public void setLogin(String l) {
		   login.setText(l);
	   }
	   
	   public void setCBoxm(String cbox) {
		   CBox.setSelectedItem(cbox);
	   }
	   
	   
		
	   public EX4() {
		   // connexion à la base de données
		   try{
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/base", "Rajae", "Rajae");
				st=con.createStatement();
				System.out.println("accès avec succès");
				
			}catch(Exception ex){
				System.out.println("Erreur: "+ex);
			}
		   // fin de a connexion à la base de données
		   
	     setTitle("Gestion des adhérents");        setSize(600, 600);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	     pan1.setLayout(new BorderLayout());
	     pan1.add(pan6, BorderLayout.SOUTH);// ajouter pan6 au sud de pan1 
	     pan1.add(pan2);
	     this.
	     pan1.add(pan4, BorderLayout.EAST);
	     this.add(pan1);
	     pan2.setLayout(new BorderLayout());
	     pan2.add(pan3, BorderLayout.NORTH);  
	     pan2.add(pan5, BorderLayout.SOUTH);  // ajouter pan5 au sud de pan2
	     pan3.setLayout(new GridLayout(8,1));
	     pan3.add(new JLabel("Nom"));
	     pan3.add(FNom);
	     pan3.add(new JLabel("Date d'inscription"));
		 pan3.add(dateChooser);
	     pan3.add(new JLabel("Login"));
	     pan3.add(login);
	     pan3.add(new JLabel("Options"));
	     pan3.add(CBox);
	     pan4.setLayout(new GridLayout(9,1));
	     pan4.add(tennis);
	     pan4.add(squash);
	     pan4.add(natation);
	     pan4.add(athletisme);
	     pan4.add(randonnee);
	     pan4.add(foot);
	     pan4.add(basket);
	     pan4.add(volley);
	     pan4.add(pelanque);
	     pan5.setLayout(new FlowLayout());
	     pan5.add(new JLabel("Sexe"));
	     pan5.add(homme);
	     pan5.add(femme);
	     homme.setMnemonic('H');  femme.setMnemonic('F');
	     groupe.add(homme);      groupe.add(femme);

	     pan6.setLayout(new FlowLayout());
	     pan6.add(ajouter);
	     pan6.add(ajouter_table);
	     pan6.add(modifier);
	     pan6.add(supprimer);
	     pan6.add(afficher);
	     pan6.add(reset);
	     pan6.add(fermer);
	     
	     setVisible(true);
	     
	     ajouter.addActionListener(this);
	     modifier.addActionListener(this);
	     supprimer.addActionListener(this);
	     afficher.addActionListener(this);
	     ajouter_table.addActionListener(this);
	     reset.addActionListener(this);
	     
	     // fermeture avec confirmation
	     fermer.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent arg0) {
	        	 sortieAvecConf();
	         }
	     });
	     this.pack();

	   }
	   
	   void  sortieAvecConf()  {
		   if  (JOptionPane.showConfirmDialog(this,
		   "Voulez-vous  vraiment  quitter  ce  programme?",
		   "Attention!",
		   JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		       System.exit(0);
		   }

	   
	     public void actionPerformed(ActionEvent arg) {
	    	 String Sexe="",Sport="", Options=" ";
	    	 
	    	 Object source=arg.getSource();
		    	 if(source==ajouter){
			    	 try {
				    	 st = con.createStatement();
				    	 String requete="INSERT INTO Adherent(Nom,Login,Options,Sexe,Sport) VALUES (?,?,?,?,?)";
				    	 PreparedStatement ps = con.prepareStatement(requete);
				    	 ps.setString(1, FNom.getText());
				    	 ps.setString(2, login.getText());
				    	 Options= CBox.getSelectedItem().toString();
				    	 ps.setString(3, Options);
				    	 if (homme.isSelected())  Sexe="Homme";
				    	 if (femme.isSelected())  Sexe="Femme";
				    	 ps.setString(4, Sexe);
				    	 if (foot.isSelected()) Sport+=foot.getText()+ " ";
				    	 if (basket.isSelected()) Sport+=basket.getText()+ " ";
				    	 if (tennis.isSelected()) Sport+=tennis.getText()+ " ";
				 	     if (squash.isSelected()) Sport+=squash.getText()+ " ";
				 	     if (natation.isSelected()) Sport+=natation.getText()+ " ";
				 	     if (athletisme.isSelected()) Sport+=athletisme.getText()+ " ";
				 	     if (randonnee.isSelected()) Sport+=randonnee.getText()+ " ";
				 	     if (volley.isSelected()) Sport+=volley.getText()+ " ";
				 	     if (pelanque.isSelected()) Sport+=pelanque.getText()+ " ";
				    	 ps.setString(5, Sport);

				    	 int nb = ps.executeUpdate();
				    	 JOptionPane.showMessageDialog(null, "Inserted successfully");
				    	 } catch (SQLException e) {
				    		 JOptionPane.showMessageDialog(null, e);
						}
		    	 }
		    	 
		    	 if(source==reset){
		    		 FNom.setText("");
		    		 login.setText("");
		    		 groupe.clearSelection();
		    		 CBox.setSelectedIndex(0);
		    		 if (foot.isSelected()) foot.setSelected(false);
			    	 if (basket.isSelected()) basket.setSelected(false);
			    	 if (tennis.isSelected()) tennis.setSelected(false);
			 	     if (squash.isSelected()) squash.setSelected(false);
			 	     if (natation.isSelected()) natation.setSelected(false);
			 	     if (athletisme.isSelected()) athletisme.setSelected(false);
			 	     if (randonnee.isSelected()) randonnee.setSelected(false);
			 	     if (volley.isSelected()) volley.setSelected(false);
			 	     if (pelanque.isSelected()) pelanque.setSelected(false);
		    		 
		    	 }
		    	 
		    	 if(source==modifier){
		    		 
		    		 try{
		    			Table t= new Table();
		    			String log= login.getText();
		    			String requete= "UPDATE Adherent set Nom=?, Options=?, Sexe=?, Sport=? where Login ='"+log+"'";
		    			PreparedStatement ps = con.prepareStatement(requete);
				    	 ps.setString(1, FNom.getText());
				    	 Options= CBox.getSelectedItem().toString();
				    	 ps.setString(2, Options);
				    	 if (homme.isSelected())  Sexe="Homme";
				    	 if (femme.isSelected())  Sexe="Femme";
				    	 ps.setString(3, Sexe);
				    	 if (foot.isSelected()) Sport+=foot.getText()+ " ";
				    	 if (basket.isSelected()) Sport+=basket.getText()+ " ";
				    	 if (tennis.isSelected()) Sport+=tennis.getText()+ " ";
				 	     if (squash.isSelected()) Sport+=squash.getText()+ " ";
				 	     if (natation.isSelected()) Sport+=natation.getText()+ " ";
				 	     if (athletisme.isSelected()) Sport+=athletisme.getText()+ " ";
				 	     if (randonnee.isSelected()) Sport+=randonnee.getText()+ " ";
				 	     if (volley.isSelected()) Sport+=volley.getText()+ " ";
				 	     if (pelanque.isSelected()) Sport+=pelanque.getText()+ " ";
				    	 ps.setString(4, Sport);
				    	 
				    	 int nb = ps.executeUpdate();
				    	 // refresh JTable
				    	 DefaultTableModel model= (DefaultTableModel)t.tab.getModel();
				    	 model.setRowCount(0);
				    	 t.show_adherent();
				    	 t.setVisible(true);
				    	 //////////
				    	 JOptionPane.showMessageDialog(null, "Updated successfully");
				    	 } catch (SQLException e) {
				    		 JOptionPane.showMessageDialog(null, e);
						}

		    	 }
		    	 

		    	 if(source==supprimer){
		    		 try{
		    			 Table t= new Table();
		    			 String log= login.getText();
		    			 String requete= "delete from Adherent WHERE Login ='"+log+"'";
		    			 st.executeUpdate(requete);
		    			// refresh JTable
				    	 DefaultTableModel model= (DefaultTableModel)t.tab.getModel();
				    	 model.setRowCount(0);
				    	 t.show_adherent();
				    	 t.setVisible(true);
				    	 //////////
				    	 JOptionPane.showMessageDialog(null, "Deleted successfully");
			    	 } catch (SQLException e) {
			    		 JOptionPane.showMessageDialog(null, e);
					 }

		    	 }
		    	 
		    	 if(source==afficher){
		    		 try{
		    			 Table tab= new Table();
		    			 tab.setVisible(true);
		    			 setVisible(false);
		    		  }catch(Exception ex){
		    			  System.out.println("Erreur: "+ex);
		    		  }
		    	 }
		    	 
		    	 if(source==ajouter_table){
		    		 try{
		    			 Statement st = con.createStatement();
		    			 String requete = "CREATE TABLE Personne(id int not null auto_increment, prenom VARCHAR(15), nom varchar(15), age INT, primary key(id))";
		    			 st.executeUpdate(requete);
				    	 JOptionPane.showMessageDialog(null, "Table created successfully");
			    	 } catch (SQLException e) {
			    		 JOptionPane.showMessageDialog(null, e);
			    	 }
		    	 }
		    	 
		    	 
	      }

	     
	   public static void main(String[] args) {  
	     new EX4();
	   }
	}
	     
