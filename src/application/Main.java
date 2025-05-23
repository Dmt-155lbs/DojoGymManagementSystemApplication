package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;


public class Main extends Application {


	@Override
	public void start(Stage stage) throws IOException{
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) {
        launch(args);
    }
}
