package application;

import javafx.event.ActionEvent;

import java.io.IOException;
//import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class Taek1Controller implements Initializable {
	private Stage stage;
	private Scene scene;
    @FXML
    private TableView<Instructor> tableView;
    
    //Columnas

    @FXML
    private TableColumn<Instructor, String> deporteColumna;

    @FXML
    private TableColumn<Instructor, String> edadColumna;

    @FXML
    private TableColumn<Instructor, String> generoColumna;
    
    @FXML
    private TableColumn<Instructor, String> nombreColumna;
    
    @FXML
    private TableColumn<Instructor, String> horainicioColumna;
    
    @FXML
    private TableColumn<Instructor, String> horafinalColumna;
 
    //Text Input
    
    @FXML
    private TextField deporteInput;
    
    @FXML
    private TextField edadInput;

    @FXML
    private TextArea horafinalInput;

    @FXML
    private TextField nombreInput;

    @FXML
    private TextArea horainicioInput;

    @FXML
    private TextField generoInput;


	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
	
			nombreColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
		    edadColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEdad()));
		    generoColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getGenero())); 
		    deporteColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDeporte())); 
		    horainicioColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().gethorainicio()));
		    horafinalColumna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().gethorafinal()));
		
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
	 
	@FXML 
	
	void añadir(ActionEvent event) {
		Instructor cliente = new Instructor(nombreInput.getText(),
				edadInput.getText(),
				generoInput.getText(),
				deporteInput.getText(),
				horainicioInput.getText(),
				horafinalInput.getText());
		ObservableList <Instructor> clientes = tableView.getItems();
		clientes.add(cliente);
		tableView.setItems(clientes);
	}
	
	@FXML
	
	void removerCliente(ActionEvent event) {
		int IDseleccionado = tableView.getSelectionModel().getSelectedIndex();
		tableView.getItems().remove(IDseleccionado);
	}
	
	

}
