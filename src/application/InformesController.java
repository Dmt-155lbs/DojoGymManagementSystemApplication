package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.IOException;


public class InformesController {
	private Stage stage;
	private Scene scene;



	
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
	  
	  @FXML
	    public void showInformes(ActionEvent event) throws IOException {
	    	 if (stage == null) {
	 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 	    }

	 	    Parent root = FXMLLoader.load(getClass().getResource("/view/InformesFinal.fxml"));
	 	    scene = new Scene(root);
	 	    stage.setScene(scene);
	 	    stage.show();
	    	
	    }
	  

}
