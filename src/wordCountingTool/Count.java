package wordCountingTool;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Count  {
	
	@FXML
	private Button count;
	@FXML
	private Button clear;
	@FXML
	private Button exit;
	@FXML
	private TextField words;
	@FXML
	private TextField total;
	
	public void countWords(ActionEvent Event) {
		
		String sentence = words.getText();
		int word = 1;
		
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				word++;
			}
			total.setText(" " + word);
		}
	}
	
	public void clearText(ActionEvent Event) {
		words.setText(" ");
		total.setText(" ");
	}
	
	public void programmeExit(ActionEvent Event) {
		System.exit(0);
	}
}
