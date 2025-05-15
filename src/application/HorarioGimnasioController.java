package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
import application.Horario;

public class HorarioGimnasioController implements Initializable{
	
	
	private Stage stage;
	private Scene scene;
	

    @FXML
    private TableColumn<Horario, String> aperturaColumna;

    @FXML
    private TextField aperturaInput;

    @FXML
    private TableColumn<Horario, String> cierreColumna;

    @FXML
    private TextField cierreInput;

    @FXML
    private TableColumn<Horario, String> horarioDisponibleColumna;

    @FXML
    private TextField horarioDisponibleInput;

    @FXML
    private TableColumn<Horario, String> horarioEntrenadorDisponibleColumna;

    @FXML
    private TextField horarioEntrenadorDisponibleInput;

    @FXML
    private TableView<Horario> tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        aperturaColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApertura()));
        cierreColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCierre()));
        horarioDisponibleColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getHorarioDisponible()));
        horarioEntrenadorDisponibleColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEntrenadorDisponible()));
    }

    @FXML
    void añadir(ActionEvent event) {
        Horario horario = new Horario(aperturaInput.getText(), cierreInput.getText(),
                horarioDisponibleInput.getText(), horarioEntrenadorDisponibleInput.getText());
        ObservableList<Horario> horarios = tableView.getItems();
        horarios.add(horario);
        tableView.setItems(horarios);
    }

    @FXML
    void removerHorario(ActionEvent event) {
        int IDseleccionado = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(IDseleccionado);
    }

    // Método para guardar la tabla como texto
    public static void guardarTablaComoTextoHorario(String rutaArchivo, TableView<Horario> tableView) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            // Recorremos las filas de la tabla
            for (Horario horario : tableView.getItems()) {
                // Construimos una cadena con los datos del horario
            
                String fila = "Horario de Apertura" + "\n" +
                		horario.getApertura() + "," + "\n" +
                		"Horario de Cierre" + "\n" +
                		horario.getCierre() + "," + "\n" +
                		"Horario disponible " + "\n" +
                		horario.getHorarioDisponible() + "," + "\n" +
                		"Horario del Entrenador disponible " + "\n" +
                		horario.getEntrenadorDisponible() + "\n" + "\n";
                // Escribimos la fila en el archivo
                writer.write(fila);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void guardarTablaHorario(ActionEvent event) {
        guardarTablaComoTextoHorario("horario_data.txt", tableView);
    }
    
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
