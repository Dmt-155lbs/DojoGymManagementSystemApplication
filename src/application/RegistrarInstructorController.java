package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RegistrarInstructorController {
	
	private Stage stage;
	private Scene scene;
	
	
	@FXML
	private Label opcionLabel;

	// Event Listener on Button.onAction
	@FXML
	public void showInstructorGimnasio(ActionEvent event) throws IOException {
		if (stage == null) {
 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 	    }

 	    Parent root = FXMLLoader.load(getClass().getResource("/view/InstructorGimnasio.fxml"));
 	    scene = new Scene(root);
 	    stage.setScene(scene);
 	    stage.show();
 	
	}
	// Event Listener on Button.onAction
	@FXML
	public void showInstructorArtesMarciales(ActionEvent event) throws IOException {
		if (stage == null) {
 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 	    }

 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Instructor.fxml"));
 	    scene = new Scene(root);
 	    stage.setScene(scene);
 	    stage.show();
 	
	}
	// Event Listener on Button.onAction
	@FXML
	public void showMenu(ActionEvent event) throws IOException {
		if (stage == null) {
 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 	    }

 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
 	    scene = new Scene(root);
 	    stage.setScene(scene);
 	    stage.show();
	}
}
