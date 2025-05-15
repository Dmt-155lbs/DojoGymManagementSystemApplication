package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleDoubleProperty;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import application.Cliente;

public class ClienteController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	
	@FXML
    private TableView<Cliente> tableView;
    
    //Columnas

    @FXML
    private TableColumn<Cliente, Double> alturaColumna;

    @FXML
    private TableColumn<Cliente, Integer> edadColumna;

    @FXML
    private TableColumn<Cliente, String> histEntrenamientoColumna;
    
    @FXML
    private TableColumn<Cliente, String> nombreColumna;
    
    @FXML
    private TableColumn<Cliente, String> objFitnessColumna;
    
    @FXML
    private TableColumn<Cliente, Double> pesoColumna;
 
    //Text Input
    
    @FXML
    private TextField alturaInput;
    
    @FXML
    private TextField edadInput;

    @FXML
    private TextArea historialEntrenamientoInput;

    @FXML
    private TextField nombreInput;

    @FXML
    private TextArea objetivosFitnessInput;

    @FXML
    private TextField pesoInput;


	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		nombreColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
	    edadColumna.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getEdad()).asObject());
	    pesoColumna.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getPeso()).asObject());
	    alturaColumna.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getAltura()).asObject());
	    histEntrenamientoColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().gethistorialEntrenamiento()));
	    objFitnessColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getobjetivosFitness()));
	}
	
	//Botón añadir
	
	@FXML
	
	void añadir(ActionEvent event) {
		Cliente cliente = new Cliente(nombreInput.getText(),
				Integer.parseInt(edadInput.getText()),
				Double.parseDouble(pesoInput.getText()),
				Double.parseDouble(alturaInput.getText()),
				historialEntrenamientoInput.getText(),
				objetivosFitnessInput.getText());
		ObservableList <Cliente> clientes = tableView.getItems();
		clientes.add(cliente);
		tableView.setItems(clientes);
	}
	
	@FXML
	
	void removerCliente(ActionEvent event) {
		int IDseleccionado = tableView.getSelectionModel().getSelectedIndex();
		tableView.getItems().remove(IDseleccionado);
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
	
	
	
	 // Método para guardar la tabla como texto
	public static void guardarTablaComoTextoCliente(String rutaArchivo, TableView<Cliente> tableView) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
	        // Recorremos las filas de la tabla
	        for (Cliente cliente : tableView.getItems()) {
	            // Construimos una cadena con los datos del entrenador, incluyendo el horario laboral
	            String fila = 
	            		"Nombre" + "\n" +
	            		cliente.getNombre() + "," + "\n" +
	            		"Edad" + "\n" +
	                    	cliente.getEdad() + "," + "\n" +
	                    "Peso" + "\n" +
	                          cliente.getPeso() + "," + "kg" + "\n" +
	                    "Altura" + "\n" +
	                          cliente.getAltura() + "," + "m" + "\n" +
	                    "Historial de Entrenamiento" + "\n" +
	                          cliente.gethistorialEntrenamiento() + "," + "\n" +
	                    "Objetivos Fitness" + "\n" +
	                          cliente.getobjetivosFitness() + "\n" + "\n";

	            // Escribimos la fila en el archivo
	            writer.write(fila);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

   
   
   @FXML
   void guardarTablaCliente(ActionEvent event) {
       guardarTablaComoTextoCliente("cliente_data.txt", tableView);
   }

}
