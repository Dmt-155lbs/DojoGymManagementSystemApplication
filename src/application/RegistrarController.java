package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RegistrarController {
	
	private Stage stage;
	private Scene scene;
	
	@FXML
	private Label opcionLabel;
	
	
	@FXML
    void showEstud(ActionEvent event) throws IOException{
    	 if (stage == null) {
 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 	    }

 	    Parent root = FXMLLoader.load(getClass().getResource("/view/EstudianteFXML.fxml"));
 	    scene = new Scene(root);
 	    stage.setScene(scene);
 	    stage.show();
 	

    }
	
	@FXML
    void showCliente(ActionEvent event) throws IOException{
    	 if (stage == null) {
 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 	    }

 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Cliente.fxml"));
 	    scene = new Scene(root);
 	    stage.setScene(scene);
 	    stage.show();
 	

    }
	
	
	@FXML
    void showMenu(ActionEvent event) throws IOException {
    	 if (stage == null) {
 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 	    }

 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
 	    scene = new Scene(root);
 	    stage.setScene(scene);
 	    stage.show();
    	
    }

}
