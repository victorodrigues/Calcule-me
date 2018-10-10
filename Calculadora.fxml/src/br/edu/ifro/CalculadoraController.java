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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class CalculadoraController implements Initializable {
        
    @FXML
    private TextField txtNUmero1;
    @FXML
    private TextField txtNUmero2;
    @FXML
    private TextField txtResultado;
    @FXML
    private  Label label;
        @FXML
    private void soma(ActionEvent event) {
       Double num1 = Double.parseDouble(txtNUmero1.getText());
       Double num2 = Double.parseDouble(txtNUmero1.getText());
       Double resultado = num1 + num2; 
   
    txtResultado.setText(resultado.toString());
    }
     @FXML
    private void subtracao (ActionEvent event) {
       Double num1 = Double.parseDouble(txtNUmero1.getText());
       Double num2 = Double.parseDouble(txtNUmero1.getText());
       Double resultado = num1 - num2; 
   
    txtResultado.setText(resultado.toString());
    }
    
     @FXML
    private void mltiplicacao(ActionEvent event) {
       Double num1 = Double.parseDouble(txtNUmero1.getText());
       Double num2 = Double.parseDouble(txtNUmero1.getText());
       Double resultado = num1 * num2; 
   
    txtResultado.setText(resultado.toString());
    }
    
     @FXML
    private void divicao(ActionEvent event) {
       Double num1 = Double.parseDouble(txtNUmero1.getText());
       Double num2 = Double.parseDouble(txtNUmero1.getText());
       Double resultado = num1 / num2; 
   
    txtResultado.setText(resultado.toString());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
