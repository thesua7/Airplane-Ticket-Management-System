
package com.mycompany.atms;
import org.apache.commons.io.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CancelController extends DestinationCustomer implements Initializable {

    ObservableList<String> timeList = FXCollections.observableArrayList("Morning","Evening","Night"); 
    ObservableList<String> optiontoList = FXCollections.observableArrayList("KHULNA","RAJSHAHI","CHITTAGONG");
    ObservableList<String> fnameList = FXCollections.observableArrayList("US-BANGLA","NOVO-AIR","REGENT-AIR");
    ObservableList<String> seatclassList = FXCollections.observableArrayList("BUSINESS","ECONOMY"); 
    
    
    
    @FXML
    private ComboBox fname;

    @FXML
    private Label labeldone;

    @FXML
    private ComboBox optionto;

    @FXML
    private ComboBox time;

    @FXML
    private ComboBox seatclass;
    
    
    
    @FXML
    private TextField cusid;

    
    String dtime;
    int cid;
    String index;
    String str=null;
    
    @FXML
    void done(ActionEvent event) throws FileNotFoundException, IOException {
        
        cid = Integer.parseInt(cusid.getText());
        
        
        if(optionto.getValue().equals("KHULNA")){
            destination = "Khulna";
            
        }
        if(optionto.getValue().equals("RAJSHAHI")){
            destination = "Rajshahi";
        }
        
        if(optionto.getValue().equals("CHITTAGONG")){
            destination = "Chittagong";
        }
        
        if(fname.getValue().equals("US-BANGLA")){
            flightname = "US BANGLA";
        }
        
        if(fname.getValue().equals("NOVO-AIR")){
            flightname = "NOVO AIR";
        }
        
        if(fname.getValue().equals("REGENT-AIR")){
            flightname = "REGENT AIR";
        }
        
        
        if(seatclass.getValue().equals("BUSINESS")){
            sclass = "Business";
            
        }
        
        if(seatclass.getValue().equals("ECONOMY")){
            sclass = "Economy";
            
        }
        
        
        
         if(time.getValue().equals("Morning")){
   
            dtime = "Morning";           
            }
        
          if(time.getValue().equals("Evening")){
        
            dtime = "Evening";
             }  
          
         if(time.getValue().equals("Night")){
            dtime = "Night";
             
           }
        
        
       
     
        labeldone.setText("DONE");
        
      
      
       File f = new File("Data/"+flightname+"/"+destination+"/"+sclass+"/"+dtime+"/"+cid);
       FileUtils.deleteDirectory(f);
      
          

    }
    
    
    
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        
        
        time.setValue("Morning");
        time.setItems(timeList);
        time.setValue("Evening");
        time.setItems(timeList);
        time.setValue("Night");
        time.setItems(timeList);
       

       optionto.setValue("KHULNA");
       optionto.setItems(optiontoList);
       optionto.setValue("RAJSHAHI");
       optionto.setItems(optiontoList);
       optionto.setValue("CHITTAGONG");
       optionto.setItems(optiontoList);
       
       fname.setValue("US-BANGLA");
       fname.setItems(fnameList);
       fname.setValue("NOVO-AIR");
       fname.setItems(fnameList);
       fname.setValue("REGENT-AIR");
       fname.setItems(fnameList);
       
       seatclass.setValue("Business");
       seatclass.setItems(seatclassList);
       seatclass.setValue("Economy");
       seatclass.setItems(seatclassList);
        
        
        
        
    }    
    
    


    
    
}
