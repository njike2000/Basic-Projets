package HeightConverstion;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setResizable(false);
		Parent root = FXMLLoader.load(getClass().getResource("heightConverter.fxml"));
		primaryStage.setTitle("Feet und Inches TO Centimetre Convertre");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
