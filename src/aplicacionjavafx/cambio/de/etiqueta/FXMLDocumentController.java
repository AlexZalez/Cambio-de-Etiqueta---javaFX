/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package aplicacionjavafx.cambio.de.etiqueta;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Administrador
 */
public class FXMLDocumentController implements Initializable {
    
    private boolean cambio = true;
    @FXML
    private Label label;
    @FXML
    private Button myButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (cambio) {
            label.setText("Estoy activa");  
            myButton.setText("Desactivar");
            cambio = false;
        }else{
            label.setText("Estoy inactiva");
            myButton.setText("Activar");
            cambio = true;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
