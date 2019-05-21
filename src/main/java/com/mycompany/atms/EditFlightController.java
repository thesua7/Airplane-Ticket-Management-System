package com.mycompany.atms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EditFlightController extends DestinationCustomer implements Initializable {

	ObservableList<String> optiontoList = FXCollections.observableArrayList("KHULNA", "RAJSHAHI", "CHITTAGONG");
	ObservableList<String> fnameList = FXCollections.observableArrayList("US-BANGLA", "NOVO-AIR", "REGENT-AIR");
	ObservableList<String> seatclassList = FXCollections.observableArrayList("BUSINESS", "ECONOMY");
	ObservableList<String> timeList = FXCollections.observableArrayList("Morning", "Evening", "Night");

	@FXML
	private Label donelabel;

	@FXML
	private ComboBox time;

	@FXML
	private ComboBox fname;

	@FXML
	private ComboBox seatclass;

	@FXML
	private ComboBox optionto;

	@FXML
	private TextField cname;

	@FXML
	private TextField cadd;

	@FXML
	private TextField customerid;

	@FXML
	private TextField cemail;

	@FXML
	private TextField cphon;

	String dtime;
	int cid;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

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

		time.setValue("Morning");
		time.setItems(timeList);
		time.setValue("Evening");
		time.setItems(timeList);
		time.setValue("Night");
		time.setItems(timeList);

		seatclass.setValue("Business");
		seatclass.setItems(seatclassList);
		seatclass.setValue("Economy");
		seatclass.setItems(seatclassList);

		//------------
	}

        
	@FXML
	void editbutton(ActionEvent event) {

		if (optionto.getValue().equals("KHULNA")) {
			destination = "Khulna";

		}
		if (optionto.getValue().equals("RAJSHAHI")) {
			destination = "Rajshahi";
		}

		if (optionto.getValue().equals("CHITTAGONG")) {
			destination = "Chittagong";
		}

		if (fname.getValue().equals("US-BANGLA")) {
			flightname = "US BANGLA";
		}

		if (fname.getValue().equals("NOVO-AIR")) {
			flightname = "NOVO AIR";
		}

		if (fname.getValue().equals("REGENT-AIR")) {
			flightname = "REGENT AIR";
		}

		if (seatclass.getValue().equals("BUSINESS")) {
			sclass = "Business";

		}

		if (seatclass.getValue().equals("ECONOMY")) {
			sclass = "Economy";

		}

		//=====================================   
		if (flightname.equals("US BANGLA") == true) {

			if (destination.equals("Chittagong") == true) {

				if (time.getValue().equals("Morning")) {
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					dtime = "Night";
				}

			}

			if (destination.equals("Rajshahi") == true) {

				if (time.getValue().equals("Morning")) {
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					dtime = "Night";
				}

			}

			if ((destination.equals("Khulna") == true)) {

				if (time.getValue().equals("Morning")) {
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					dtime = "Night";
				}

			}

		}

		//--------novo air
		if (flightname.equals("NOVO AIR") == true) {

			if (destination.equals("Chittagong") == true) {

				if (time.getValue().equals("Morning")) {
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					dtime = "Night";
				}

			}

			if (destination.equals("Khulna") == true) {

				if (time.getValue().equals("Morning")) {
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					dtime = "Night";
				}

			}

			if (destination.equals("Rajshahi") == true) {

				if (time.getValue().equals("Morning")) {
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					dtime = "Night";
				}

			}

		}

		//--------regent air   
		if (flightname.equals("REGENT AIR") == true) {

			if (destination.equals("Chittagong") == true) {

				if (time.getValue().equals("Morning")) {
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					dtime = "Night";
				}

			}

			if (destination.equals("Khulna") == true) {

				if (time.getValue().equals("Morning")) {
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					dtime = "Night";
				}

			}

			if (destination.equals("Rajshahi") == true) {

				if (time.getValue().equals("Morning")) {

					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {

					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {

					dtime = "Night";
				}

			}

		}

	}

	@FXML
	void done(ActionEvent event) throws IOException {

		cid = Integer.parseInt(customerid.getText());
		customername = cname.getText();
		phonenumber = cphon.getText();
		address = cadd.getText();
		customeremail = cemail.getText();

		File b = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "customername.txt");
		b.getParentFile().mkdirs();
		b.createNewFile();
		FileWriter fw1 = new FileWriter(b);
		PrintWriter pw1 = new PrintWriter(fw1);
		pw1.print(customername);
		pw1.close();

		File c = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "address.txt");
		c.getParentFile().mkdirs();
		c.createNewFile();
		FileWriter fw2 = new FileWriter(c);
		PrintWriter pw2 = new PrintWriter(fw2);
		pw2.print(address);
		pw2.close();

		File d = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "phonenumber.txt");
		d.getParentFile().mkdirs();
		d.createNewFile();
		FileWriter fw3 = new FileWriter(d);
		PrintWriter pw3 = new PrintWriter(fw3);
		pw3.print(phonenumber);
		pw3.close();

		File e = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "email.txt");
		e.getParentFile().mkdirs();
		e.createNewFile();
		FileWriter fw4 = new FileWriter(e);
		PrintWriter pw4 = new PrintWriter(fw4);
		pw4.print(customeremail);
		pw4.close();

		donelabel.setText("DONE");

	}

}
