package HeightConverstion;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Converter  {
	
	@FXML
	private Button convert;
	@FXML
	private Button clear;
	@FXML
	private Button exit;
	@FXML
	private TextField feet;
	@FXML
	private TextField inches;
	@FXML
	private TextField centimetre;
	
	public void convertTo(ActionEvent event) throws IOException{
		Main m = new Main();
		double fit, cler, cent;
		
		fit = Double.parseDouble(feet.getText());
		cler = Double.parseDouble(inches.getText());
		cent = (fit * 12 + cler) * 2.54;
		centimetre.setText(String.valueOf(cent));
	}
	
	public void clearText(ActionEvent event) throws IOException{
		feet.setText(" ");
		inches.setText(" ");
		centimetre.setText(" ");
	}
	
	public void programmeExit(ActionEvent event) throws IOException{
		System.exit(0);
	}
	
}
