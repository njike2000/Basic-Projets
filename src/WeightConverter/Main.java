package WeightConverter;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		try{ 
		primaryStage.setResizable(false);
		Parent root = FXMLLoader.load(getClass().getResource("Tool.fxml"));
		primaryStage.setTitle("Weigth Convertion Tool");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
