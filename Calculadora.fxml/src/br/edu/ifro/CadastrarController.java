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
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class CadastrarController implements Initializable {

    @FXML
    private TextField usuario;
    @FXML
    private PasswordField senha1;
    @FXML
    private PasswordField senha2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cadastrar(ActionEvent event) {
        
        if(senha1.getText().equals(senha2.getText())){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Calculadora");
        EntityManager em = emf.createEntityManager();

        
        Login a = new Login();
        a.setUsuario(usuario.getText());
        a.setSenha(senha1.getText());
        a.setConfsenha(senha2.getText());
        
        em.getTransaction().begin();

        em.persist(a);
      em.getTransaction().commit();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Senha Incorreta!");
            alert.showAndWait();
        }
    }

    private void voltar(ActionEvent event) throws IOException {
   System.exit(0);
    }
    
}
