package tp9.ex4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Table extends JFrame{
	
	public JTable tab = new JTable();
	
	   private Connection con=null;
	   private Statement st=null;
	   private ResultSet rs=null;
	
	public Table() {
		
		this.setTitle("Table");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(600, 400);
		show_adherent();
	}

	ArrayList<Adherent> AdherentList(){
		ArrayList<Adherent> AdherentList= new ArrayList<>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/base", "Rajae", "Rajae");
			st=con.createStatement();
			System.out.println("accès avec succès");
			String query1= "select * from Adherent";
			st= con.createStatement();
			rs= st.executeQuery(query1);
			Adherent adherent;
			while(rs.next()) {
				adherent= new Adherent(rs.getString("Nom"), rs.getString("Login"), rs.getString("Options"), rs.getString("Sexe"), rs.getString("Sport"));
				AdherentList.add(adherent);
			}
			
		} catch (Exception e) {
   		 JOptionPane.showMessageDialog(null, e);
		}
		return AdherentList;
	
    }
	
	public void show_adherent() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/base", "Rajae", "Rajae");
			st=con.createStatement();
			System.out.println("accès avec succès");
			
			DefaultTableModel model = new DefaultTableModel(new String[]{"Nom", "Login", "Options", "Sexe", "Sport"}, 0);
			String sql="select * from Adherent";
			rs = st.executeQuery(sql);
			while(rs.next())
			{
			    String d = rs.getString("Nom");
			    String e = rs.getString("Login");
			    String f = rs.getString("Options");
			    String g = rs.getString("Sexe");
			    String h = rs.getString("Sport");
			    model.addRow(new Object[]{d, e, f, g, h});
			    tab.setModel(model);
			    JScrollPane pane= new JScrollPane(tab);
				getContentPane().add(pane, BorderLayout.CENTER);
			}
		}catch (Exception e) {
	   		 JOptionPane.showMessageDialog(null, e);
		}
		
		tab.addMouseListener(new MouseAdapter(){
		    public void mouseClicked(MouseEvent e) {
		    	int i= tab.getSelectedRow();
		    	TableModel model= tab.getModel();
		    	EX4 ex4= new EX4();
		    	ex4.setFNom(model.getValueAt(i, 0).toString());
		    	ex4.setLogin(model.getValueAt(i, 1).toString());
		    	String option= model.getValueAt(i, 2).toString();
		        switch(option) {
			    	case "Option 1": ex4.CBox.setSelectedIndex(0); break;
			    	case "Option 2": ex4.CBox.setSelectedIndex(1); break;
			    	case "Option 3": ex4.CBox.setSelectedIndex(2); break;
			    	case "Option 4": ex4.CBox.setSelectedIndex(3); break;
	    	    }
		    	String sexe= model.getValueAt(i, 3).toString();
		    	if(sexe.equals("Homme")) {
		    		ex4.homme.setSelected(true);
		    	}
		    	if(sexe.equals("Femme")) {
		    		ex4.femme.setSelected(true);
		    	}
		    	String cbox= model.getValueAt(i, 4).toString();
		        String[] eachSport = cbox.split(" ");
		        for(String a: eachSport) {
			    	switch(a) {
				    	case "Foot": ex4.foot.setSelected(true); break;
				    	case "Basket": ex4.basket.setSelected(true); break;
				    	case "Tennis": ex4.tennis.setSelected(true); break;
				    	case "Squash": ex4.squash.setSelected(true); break;
				    	case "Natation": ex4.natation.setSelected(true); break;
				    	case "Athletisme": ex4.athletisme.setSelected(true); break;
				    	case "Randonnée": ex4.randonnee.setSelected(true); break;
				    	case "Volley": ex4.volley.setSelected(true); break;
				    	case "Pélanque": ex4.pelanque.setSelected(true); break;
			    	}
		    	}
		        
		    } 
	    });

	}
	
	public static void main(String[] args) {
		Table t= new Table();
		t.setVisible(true);

	}

}
