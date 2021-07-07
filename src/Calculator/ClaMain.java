package Calculator;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClaMain extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent load = FXMLLoader.load(getClass().getResource("Calcu.fxml"));
		primaryStage.setResizable(false);
		primaryStage.setTitle("My Calculcator");
		Scene scene = new Scene(load);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
