package application; 

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


public class EstudianteController {
	
	private Stage stage;
	private Scene scene;

    @FXML
    private Button registrarButton;
    
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

    @FXML
    private Label mensajeLabel;

   

  

    @FXML
    public void ShowTaek(ActionEvent event) throws IOException {
    	 if (stage == null) {
    	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    }

    	    Parent root = FXMLLoader.load(getClass().getResource("/view/Taeke.fxml"));
    	    scene = new Scene(root);
    	    stage.setScene(scene);
    	    stage.show();
      
       
    }

    @FXML
    public void showJudo(ActionEvent event) throws IOException {
    	 if (stage == null) {
    	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    }

    	    Parent root = FXMLLoader.load(getClass().getResource("/view/Judoe.fxml"));
    	    scene = new Scene(root);
    	    stage.setScene(scene);
    	    stage.show();
     
      
    }

    @FXML
    public void showBox(ActionEvent event) throws IOException {
    	 if (stage == null) {
    	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    }

    	    Parent root = FXMLLoader.load(getClass().getResource("/view/Boxe.fxml"));
    	    scene = new Scene(root);
    	    stage.setScene(scene);
    	    stage.show();
     
      
    }

    @FXML
    public void showMuay(ActionEvent event) throws IOException {
    	 if (stage == null) {
    	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    }

    	    Parent root = FXMLLoader.load(getClass().getResource("/view/Muaye.fxml"));
    	    scene = new Scene(root);
    	    stage.setScene(scene);
    	    stage.show();
     
      
    }
/*
    private void registrarEstudiante() {
    	
            String nombre = nombreTextField.getText();
            String genero = generoTextField.getText();
            int edad = Integer.parseInt(edadTextField.getText());
            String deporte = deporteTextField.getText();

            // Lógica para registrar al estudiante con los datos obtenidos
            if (deportesInstructores.containsKey(deporte)) {
            	 Instructor instructor = deportesInstructores.get(deporte);
                 System.out.println("Horarios disponibles (hora de inicio) para " + deporte + ": " + instructor.getHorariosDisponibles());
                 System.out.print("Elija un número disponible: ");
                
          
                // Resto de la lógica de registro...

                try (FileWriter writer = new FileWriter("informacion.txt", true)) {
                    writer.write("Estudiante: " + nombre + ", Género: " + genero + ", Edad: " + edad + "\n");
                    writer.write("Deporte practicado: " + deporte + "\n");
                    // Aquí puedes agregar más información sobre el estudiante si es necesario
                    writer.write("--------------------------------------\n");
                } catch (IOException e) {
                    System.err.println("Error al escribir en el archivo: " + e.getMessage());
                }

            } else {
                mensajeLabel.setText("No hay instructores registrados para el deporte " + deporte);
            }
        
    }
*/ 


}




