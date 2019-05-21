
package com.mycompany.atms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class SearchFlightController extends DestinationCustomer implements Initializable {


     ObservableList<String> destinationList = FXCollections.observableArrayList("KHULNA","RAJSHAHI","CHITTAGONG");
     ObservableList<String> flightnameList = FXCollections.observableArrayList("US-BANGLA","NOVO-AIR","REGENT-AIR");
    
    
    

    
    
    @FXML
    private Label detaillb;

    @FXML
    private ComboBox flig;

    @FXML
    private ComboBox dest;


    
     public void initialize(URL location, ResourceBundle resources) {
         
         
       dest.setValue("KHULNA");
       dest.setItems(destinationList);
       dest.setValue("RAJSHAHI");
       dest.setItems(destinationList);
       dest.setValue("CHITTAGONG");
       dest.setItems(destinationList);
       flig.setValue("US-BANGLA");
       flig.setItems(flightnameList);
       flig.setValue("NOVO-AIR");
       flig.setItems(flightnameList);
       flig.setValue("REGENT-AIR");
       flig.setItems(flightnameList);

    }
    
    
    
    

    
    
    @FXML
    void sbutton(ActionEvent event) {
        
        if(dest.getValue().equals("KHULNA")){
            destination = "Khulna";
            
        }
        if(dest.getValue().equals("RAJSHAHI")){
            destination = "Rajshahi";
        }
        
        if(dest.getValue().equals("CHITTAGONG")){
            destination = "Chittagong";
        }
        
        if(flig.getValue().equals("US-BANGLA")){
            flightname = "US BANGLA";
        }
        
        if(flig.getValue().equals("NOVO-AIR")){
            flightname = "NOVO AIR";
        }
        
        if(flig.getValue().equals("REGENT-AIR")){
            flightname = "REGENT AIR";
        }
        
   
        
  //**********************************      
        
        
         if(flightname.equals("US BANGLA")==true){
         
  
       
            if(destination.equals("Chittagong")==true){                    
                   
                 uschittagong();
       
        }
        
        
        if(destination.equals("Rajshahi")==true){
          
            
            usrajshahi();
      
            
        }
        
        
         if((destination.equals("Khulna")==true)){
             
            uskhulna();
            

            
        }
         
        } 
        
         //--------novo air
         
         if(flightname.equals("NOVO AIR")==true){
             
            if(destination.equals("Chittagong")==true){
              
             novochittagong();
                 

                              
        }    
        

          
          if(destination.equals("Khulna")==true){
              
             novokhulna();
                     
        }  
            
            
          if(destination.equals("Rajshahi")==true){
 
             novorajshahi();    

        }   
          

          
        }  
         
         
         //--------regent air   
          if(flightname.equals("REGENT AIR")==true){
              
           
            if(destination.equals("Chittagong")==true){
           
              
            regentchittagong();          
        }   
            
            
          if(destination.equals("Khulna")==true){
                                        
             
            regentkhulna(); 
                 
  
        }    
            
            
          if(destination.equals("Rajshahi")==true){
                       
              
            
            regentrajshahi(); 
          
        }
  
       }
        

       detaillb.setText("Flightname: "+flightname+"\n"+"Destination: "+destination+"\n"+"Morning--"+"\n"+"Deperture Time: "+dtime1+"\n"+"Arrival Time: "+aritime1+"\n"+"Evening--"+"\n"+"Deperture Time: "+dtime2+"\n"+"Arrival Time: "+aritime3+"\n"+"Night--"+"\n"+"Deperture Time: "+dtime3+"\n"+"Arrival Time: "+aritime3);

    }
   

   
    
}
