package WeightConverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WeightConv  {

	@FXML
	Button Convert, Exit, Clear;
	@FXML
	TextField kilogramm, pound;
	
	public void clearText (ActionEvent even) {
		kilogramm.setText(" ");
		pound.setText(" ");
	}
	
	public void programExit (ActionEvent even) {
		System.exit(0);
		
	}
	
	public void Converter (ActionEvent even) {
		
		Double kg, pd;
		
		pd = Double.parseDouble(kilogramm.getText());
		kg = pd * 0.45359237;
		pound.setText(String.valueOf(kg));
	}
	

}
