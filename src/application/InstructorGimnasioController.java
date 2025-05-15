package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import application.Entrenador;

public class InstructorGimnasioController implements Initializable{
	
	private Stage stage;
	private Scene scene;
	
	@FXML
    private TableColumn<Entrenador, Integer> edadColumna;

    @FXML
    private TextField edadInput;

    @FXML
    private TableColumn<Entrenador, String> especializaciónColumna;

    @FXML
    private TextField especializaciónInput;

    @FXML
    private TableColumn<Entrenador, String> horarioLaboralColumna;

    @FXML
    private TextField horarioLaboralInput;

    @FXML
    private TableColumn<Entrenador, String> nombreColumna;

    @FXML
    private TextField nombreInput;

    @FXML
    private TableView<Entrenador> tableView;
    
    
    
    /*@Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nombreColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        edadColumna.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getEdad()).asObject());
        especializaciónColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEspecializacion()));
        horarioLaboralColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getHorarioLaboral()));
    }
    */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nombreColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        edadColumna.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getEdad()).asObject());
        especializaciónColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEspecializacion()));
        horarioLaboralColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().gethoraInicio() + " - " + cellData.getValue().gethoraFin()));
    }


	
	//Botón añadir
	
/*	@FXML
	
	void añadir(ActionEvent event) {
		Entrenador entrenador = new Entrenador(nombreInput.getText(),
				Integer.parseInt(edadInput.getText()),
				especializaciónInput.getText(),
				horarioLaboralInput.getText());
		ObservableList <Entrenador> entrenadores = tableView.getItems();
		entrenadores.add(entrenador);
		tableView.setItems(entrenadores);
	}*/
	
    
    @FXML
    void añadir(ActionEvent event) {
        String horarioLaboral = horarioLaboralInput.getText();
        String[] partesHorario = horarioLaboral.split("-");
        
        if (partesHorario.length == 2) { // Verifica que haya dos partes (inicio y fin)
            String horaInicio = partesHorario[0].trim();
            String horaFin = partesHorario[1].trim();
            
            // Añade el entrenador sin el horario laboral
            Entrenador entrenador = new Entrenador(nombreInput.getText(),
                    Integer.parseInt(edadInput.getText()),
                    especializaciónInput.getText(),
                    horarioLaboral, horaFin, horaFin);
            
            // Establece el horario laboral después de crear el objeto Entrenador
            entrenador.sethoraInicio(horaInicio);
            entrenador.sethoraFin(horaFin);
            
            ObservableList<Entrenador> entrenadores = tableView.getItems();
            entrenadores.add(entrenador);
            tableView.setItems(entrenadores);
        } else {
            // Maneja el caso en que el formato del horario no sea válido
            System.out.println("El formato del horario laboral no es válido");
        }
    }
    
	
	@FXML
	
	void removerEntrenador(ActionEvent event) {
		int IDseleccionado = tableView.getSelectionModel().getSelectedIndex();
		tableView.getItems().remove(IDseleccionado);
	}
	
	
	 // Método para guardar la tabla como texto
	public static void guardarTablaComoTextoEntrenador(String rutaArchivo, TableView<Entrenador> tableView) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
	        // Recorremos las filas de la tabla
	        for (Entrenador entrenador : tableView.getItems()) {
	            // Construimos una cadena con los datos del entrenador, incluyendo el horario laboral
	            String fila = 
	            		"Nombre" + "\n" +
	            		entrenador.getNombre()+ "," + "\n" +
	            		"Edad" + "\n" +
	                          entrenador.getEdad() + "," + "\n" +
	                    "Especializacion" + "\n" +
	                          entrenador.getEspecializacion() + "," + "\n" +
	                    "Horario Laboral" + "\n" +
	                          entrenador.getHorarioLaboral() + "\n" + "\n";

	            // Escribimos la fila en el archivo
	            writer.write(fila);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

    
    
    @FXML
    void guardarTablaEntrenador(ActionEvent event) {
        guardarTablaComoTextoEntrenador("entrenador_data.txt", tableView);
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
