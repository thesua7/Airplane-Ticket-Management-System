
package com.mycompany.atms;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FlightBookController implements Initializable {


 
     public void fbook(ActionEvent event) {
         
    ((Stage) (((Button) event.getSource()).getScene().getWindow())).show();
         
         
              
          try{  
          Stage stage = new Stage();
         
   
         
        Parent root;
        
        root = FXMLLoader.load(getClass().getResource("/fxml/Customerinfo.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles - Copy.css");
        stage.setMaximized(true);
        stage.setTitle("Airlines Ticket Management System");
        stage.setScene(scene);
        stage.show();
          }
          
          catch(IOException e){
              
          }
              
              
              
              
              
              
              
              
              
              
              
              
              
         
         
         

    }
     
         public void ebook(ActionEvent event) {
         
             ((Stage) (((Button) event.getSource()).getScene().getWindow())).show();
              
              
             
                try{  
              
          Stage stage = new Stage();
         
         Parent root;
        root = FXMLLoader.load(getClass().getResource("/fxml/EditFlight.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/EditFlight1.css");
        stage.setMaximized(true);
        stage.setTitle("Airlines Ticket Management System");
        stage.setScene(scene);
        stage.show();
          }
          
          catch(IOException e){
              
          }
              
              
              
              
              
              
        

    }
     
         
         public void sbook(ActionEvent event) {
         
           ((Stage) (((Button) event.getSource()).getScene().getWindow())).show();
        
            try{  
              
          Stage stage = new Stage();
         
         Parent root;
        root = FXMLLoader.load(getClass().getResource("/fxml/SearchFlight.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/SearchFlight.css");
        stage.setMaximized(true);
        stage.setTitle("Airlines Ticket Management System");
        stage.setScene(scene);
        stage.show();
          }
          
          catch(IOException e){
              
          }
            
            
        
            

    }
         
         
     
         
         
         
      
    @FXML
    public void cancelfl(ActionEvent event) {
 
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).show();
        
        
         try{  
              
          Stage stage = new Stage();
         
         Parent root;
        root = FXMLLoader.load(getClass().getResource("/fxml/Cancel.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/cancel.css");
        stage.setMaximized(true);
        stage.setTitle("Airlines Ticket Management System");
        stage.setScene(scene);
        
        stage.show();
          }
          
          catch(IOException e){
              
          }
       
        
        
        
        
        
        
        
        
        
        
        
    }   
         
    
    
  @FXML
    public void exit(ActionEvent event) {
        
        
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

    }
         
     
     
     public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }

  
     

}