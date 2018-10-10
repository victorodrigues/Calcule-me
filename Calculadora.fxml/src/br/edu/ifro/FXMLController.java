/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 03358365263
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField txtusu;
    @FXML
    private PasswordField txtsenha;
    @FXML
    private Button btnCad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void entrar(ActionEvent event) {
    }

    @FXML
    private void cadastrarL(ActionEvent event) {
    }
    
}
