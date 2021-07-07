package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Calculate {
	
	private double total = 0.0;
	private double total1 = 0.0;
	private char math_operator;
		
	@FXML
	Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndot, btnEqual,
			plus, minus, div, mult;
	@FXML
	Button clear;
	
	@FXML
	TextField Text;
	
	public void Zero(ActionEvent even) {
		String zero = Text.getText() + btn0.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void One(ActionEvent even) {
		String zero = Text.getText() + btn1.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void Two(ActionEvent even) {
		String zero = Text.getText() + btn2.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void Three(ActionEvent even) {
		String zero = Text.getText() + btn3.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void Four(ActionEvent even) {
		String zero = Text.getText() + btn4.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void Five(ActionEvent even) {
		String zero = Text.getText() + btn5.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void Six(ActionEvent even) {
		String zero = Text.getText() + btn6.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void Seven(ActionEvent even) {
		String zero = Text.getText() + btn7.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void Eight(ActionEvent even) {
		String EIght = Text.getText() + btn8.getText();
		Text.getText();
		Text.setText(EIght);
	}
	
	public void Nein(ActionEvent even) {
		String zero = Text.getText() + btn9.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void dot(ActionEvent even) {
		String zero = Text.getText() + btn9.getText();
		Text.getText();
		Text.setText(zero);
	}
	
	public void ClearText(ActionEvent even) {
		
		total1 = 0;
		Text.setText(" ");
	}
	
	public void add(ActionEvent even) {
		//total = total + Double.parseDouble(Text.getText());
		//Text.setText("");
		String button_text = plus.getText();
		getMath_operator(button_text);
	}
	
	public void sub(ActionEvent even) {
		String button_text = minus.getText();
		getMath_operator(button_text);
	}
	
	public void multiply(ActionEvent even) {
		String button_text = mult.getText();
		getMath_operator(button_text);
	}
	
	public void divide(ActionEvent even) {
		String button_text = div.getText();
		getMath_operator(button_text);
	}
	
	public void Result(ActionEvent even) {
		//total1 = total + Double.parseDouble(Text.getText());
		//Text.setText(Double.toString(total));
		//total = 0;
		switch(math_operator) {
		
		case '+':
		 	total1 = total + Double.parseDouble(Text.getText());
		 	break;

		case '-':
		 	total1 = total - Double.parseDouble(Text.getText());
		 	break;

		case '*':
		 	total1 = total * Double.parseDouble(Text.getText());
		 	break;

		case '/':
		 	total1 = total / Double.parseDouble(Text.getText());
		 	break;
		}
		Text.setText(Double.toString(total1));
		total = 0;
	}

	public void getMath_operator(String btnText) {
		math_operator = btnText.charAt(0);
		total = total + Double.parseDouble(Text.getText());
		Text.setText("");
	}


	
}
