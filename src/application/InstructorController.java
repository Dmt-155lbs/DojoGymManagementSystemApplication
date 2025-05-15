package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class InstructorController {
	
	private Stage stage;
	private Scene scene;


	@FXML
	private TextField nombreTextField;
	@FXML
	private TextField generoTextField;
	@FXML
	private TextField edadTextField;
	@FXML
	private TextField deporteTextField;
	@FXML
	private Button registrarButton;
	@FXML
	private Label mensajeLabel;

	@FXML
	 public void showTaek1(ActionEvent event) throws IOException {
		 if (stage == null) {
	 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 	    }

	 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Taek1.fxml"));
	 	    scene = new Scene(root);
	 	    stage.setScene(scene);
	 	    stage.show();
       
        
    }
	
	@FXML
	 public void showJudo1(ActionEvent event) throws IOException {
		 if (stage == null) {
	 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 	    }

	 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Judo1.fxml"));
	 	    scene = new Scene(root);
	 	    stage.setScene(scene);
	 	    stage.show();
      
       
   }
	
	@FXML
	 public void showBox1(ActionEvent event) throws IOException {
		 if (stage == null) {
	 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 	    }

	 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Boxeo1.fxml"));
	 	    scene = new Scene(root);
	 	    stage.setScene(scene);
	 	    stage.show();
      
       
   }
	
	@FXML
	 public void showMuay1(ActionEvent event) throws IOException {
		 if (stage == null) {
	 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 	    }

	 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Muay1.fxml"));
	 	    scene = new Scene(root);
	 	    stage.setScene(scene);
	 	    stage.show();
      
       
   }
	
	
	// Event Listener on Button.onAction
	@FXML
	public void showMenu(ActionEvent event) throws IOException{
	 	 if (stage == null) {
	 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 	    }

	 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
	 	    scene = new Scene(root);
	 	    stage.setScene(scene);
	 	    stage.show();
	}
	

}
