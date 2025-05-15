package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

	private Stage stage;
	private Scene scene;


    @FXML
    public void showInf(ActionEvent event)throws IOException {
    	if (stage == null) {
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    }

	    Parent root = FXMLLoader.load(getClass().getResource("/view/Informes.fxml"));
	    scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
    	
    }

    @FXML
    public void showIns(ActionEvent event) throws IOException{
    	if (stage == null) {
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    }

	    Parent root = FXMLLoader.load(getClass().getResource("/view/RegistrarInstructor.fxml"));
	    scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();

    }

    /*@FXML
    void showEstud(ActionEvent event) throws IOException{
    	 if (stage == null) {
 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 	    }

 	    Parent root = FXMLLoader.load(getClass().getResource("/view/EstudianteFXML.fxml"));
 	    scene = new Scene(root);
 	    stage.setScene(scene);
 	    stage.show();
 	

    }*/
    
	@FXML
    void showRegistrar(ActionEvent event) throws IOException{
    	 if (stage == null) {
 	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 	    }

 	    Parent root = FXMLLoader.load(getClass().getResource("/view/Registrar.fxml"));
 	    scene = new Scene(root);
 	    stage.setScene(scene);
 	    stage.show();
 	

    }
    
    

    @FXML
    void showHora(ActionEvent event) throws IOException {
    	 if (stage == null) {
  	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	    }

  	    Parent root = FXMLLoader.load(getClass().getResource("/view/RegistrarHorario.fxml"));
  	    scene = new Scene(root);
  	    stage.setScene(scene);
  	    stage.show();

    }

}


