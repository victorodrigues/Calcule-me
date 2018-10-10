/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private  Button btnSoma;
    @FXML
    private Button btnSubtracao;
    @FXML
    private Button btnMultiplicacao;
    @FXML
    private Button btnDivisao;
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
    
        @FXML
        private void historico(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Listagem.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),500,500);
        Stage stage = new Stage();
        stage.setTitle("Listagem");
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
