package bookShop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import net.proteanit.sql.DbUtils;

import java.sql.*;

import javax.swing.JOptionPane;

public class BookController {
	
	  @FXML
	    private Button clear;

	    @FXML
	    private Button delete;

	    @FXML
	    private TextField editionfield;

	    @FXML
	    private Button exit;

	    @FXML
	    private TextField namefield;

	    @FXML
	    private TextField pricefield;

	    @FXML
	    private Button save;

	    @FXML
	    private Button update;
	    
	    @FXML
	    private ScrollPane scroll;
	    
	    @FXML
	    private TextField idfield;
	    
	    @FXML
	    public void ClearMeth(ActionEvent event) {
	    	namefield.setText("");
    		editionfield.setText("");
    		pricefield.setText("");
    		namefield.requestFocus();
	    }

	    @FXML
	    public void DeleteMeth(ActionEvent event) {
	    	
	    	String bid;
	    	
	    	bid = idfield.getText();
	    	
	    	try {
	    		pst = con.prepareStatement("delete from book where id = ?");
	    		
	    		pst.setString(1, bid);
	    		pst.executeUpdate();
	    		JOptionPane.showMessageDialog(null, "Record Deleted!!!!!");
	    		table_load();
	    		namefield.setText("");
	    		editionfield.setText("");
	    		pricefield.setText("");
	    		namefield.requestFocus();//this method is to Clear the textfield.
	    	}
	    	
	    	catch(SQLException ex) {
	    		ex.printStackTrace();
	    	}
	    }

	    @FXML
	    public void ExitMeth(ActionEvent event) {
	    	System.exit(0);
	    }

	    @FXML
	    public void SaveMeth(ActionEvent event) {
	    	String bname, edition, price;
	    	
	    	bname = namefield.getText();
	    	edition = editionfield.getText();
	    	price = pricefield.getText();
	    	
	    	try {
	    		pst = con.prepareStatement("insert into book(name,edition,price)value(?,?,?)");
	    		pst.setString(1, bname);
	    		pst.setString(2, edition);
	    		pst.setString(3, price);
	    		pst.executeUpdate();
	    		JOptionPane.showMessageDialog(null, "Record Added!!!!!");
	    		table_load();
	    		namefield.setText("");
	    		editionfield.setText("");
	    		pricefield.setText("");
	    		namefield.requestFocus();//this method is to Clear the textfield.
	    	}
	    	
	    	catch(SQLException ex) {
	    		ex.printStackTrace();
	    	}
	    	
	    }
	    
	    @FXML
	    public void KeyReleased(KeyEvent event) {
	    	try {
	    		
	    		String id = idfield.getText();
	    		
	    		pst = con.prepareStatement("Select name, edition, price from book where id = ?");
	    		pst.setString(1, id);
	    		rs = pst.executeQuery();
	    		
	    		if (rs.next()== true) {
	    			String name = rs.getString(1);
	    			String edition = rs.getString(2);
	    			String price = rs.getString(3);
	    			
	    			namefield.setText(name);
	    			editionfield.setText(edition);
	    			pricefield.setText(price);
	    		}
	    		else {
	    			namefield.setText("");
	    			editionfield.setText("");
	    			pricefield.setText("");
	    		}
	    		
	    	}
	    	
	    	catch(SQLException ex) 
	    	{
	    		ex.printStackTrace();
	    	}
	    }

	    @FXML
	    public void UpdateMeth(ActionEvent event) {
	    	
	    	String bname, edition, price,bid;
	    	
	    	bname = namefield.getText();
	    	edition = editionfield.getText();
	    	price = pricefield.getText();
	    	
	    	bid = idfield.getText();
	    	
	    	try {
	    		pst = con.prepareStatement("update book set name = ?,edition =?,price = ? where id = ?");
	    		pst.setString(1, bname);
	    		pst.setString(2, edition);
	    		pst.setString(3, price);
	    		pst.setString(4, bid);
	    		pst.executeUpdate();
	    		JOptionPane.showMessageDialog(null, "Record Updates!!!!!");
	    		table_load();
	    		namefield.setText("");
	    		editionfield.setText("");
	    		pricefield.setText("");
	    		namefield.requestFocus();//this method is to Clear the textfield.
	    	}
	    	
	    	catch(SQLException ex) {
	    		ex.printStackTrace();
	    	}
	    }
	    
	    public BookController() {
	    	//initialize();
	    	Connect();
	    	table_load();
	    }
	    
	    Connection con;
	    PreparedStatement pst;
	    ResultSet rs;
	    
	    public void Connect() {
	    	
	    	try {
	    		Class.forName("com.mysql.jdbc.Driver");
	    		con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop" , "root"
	    				, "");
	    	}
	    	catch(ClassNotFoundException ex) {
	    	}
	    	catch(SQLException ex) {
	    		
	    	}
	    }
	    
	    @FXML
	    public void table_load() {
	    	try {
	    		pst = con.prepareStatement("Select * from book");
	    		rs = pst.executeQuery();
	    		 scroll.setModel(DbUtils.resultSetToTableModel(rs));
	    	}
	    	
	    	catch(SQLException ex) 
	    	{
	    		ex.printStackTrace();
	    	}
	    }

}
