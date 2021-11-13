package bookShop;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainBook extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent load = FXMLLoader.load(getClass().getResource("BookShop.fxml"));
		Scene scene = new Scene(load);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Book Shop");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
