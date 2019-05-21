package com.mycompany.atms;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    
    @FXML
    private Label label;
   
    @FXML
    public void change(ActionEvent event) throws IOException {
      
        String uname = username.getText();
        String pword = password.getText();
        
        if((uname.equals("admin"))&&(pword.equals("admin"))){
        
          ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();   
            
            
          try{  Stage stage = new Stage();
         
         Parent root;
        root = FXMLLoader.load(getClass().getResource("/fxml/FlightBooking.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles_1.css");
        stage.setMaximized(true);
        stage.setTitle("Airlines Ticket Management System");
        stage.setScene(scene);
        stage.show();
          }
          
          catch(IOException e){
              
          }
            
            
            
        }
        else {
            label.setText("ERROR");
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
