package com.mycompany.atms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerinfoController extends DestinationCustomer implements Initializable {

	ObservableList<String> genderList = FXCollections.observableArrayList("Male", "Female");

	ObservableList<String> timeList = FXCollections.observableArrayList("Morning", "Evening", "Night");

	ObservableList<String> optiontoList = FXCollections.observableArrayList("KHULNA", "RAJSHAHI", "CHITTAGONG");

	ObservableList<String> fnameList = FXCollections.observableArrayList("US-BANGLA", "NOVO-AIR", "REGENT-AIR");

	ObservableList<String> seatclassList = FXCollections.observableArrayList("BUSINESS", "ECONOMY");

	String deptime;
	String arritime;

	String dtime;

	public String index = "";
	public int cid;

	@FXML
	private TextField cadd;

	@FXML
	private TextField cemail;

	@FXML
	private ComboBox gendar;

	@FXML
	private ComboBox fname;

	@FXML
	private Label lndetail;

	@FXML
	private TextField cname;

	@FXML
	private TextField cprice;

	@FXML
	private ComboBox optionto;

	@FXML
	private ComboBox seatclass;

	@FXML
	private ComboBox time;

	@FXML
	private Label hlabel;

	@FXML
	private TextField cphon;

	@FXML
	private DatePicker DepDate;

	@FXML
	public void initialize(URL location, ResourceBundle resources) {

		gendar.setValue("Male");
		gendar.setItems(genderList);
		gendar.setValue("Female");
		gendar.setItems(genderList);

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

	int price = 0;

	@FXML
	void search(ActionEvent event) throws IOException {

		//=====================================
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

			usBangla();

			if (destination.equals("Chittagong") == true) {

				if (sclass.equals("Business")) {
					price = price_to_Chittagong_in_Business_class;
				}

				if (sclass.equals("Economy")) {
					price = price_to_Chittagong_in_Economy_class;
				}

				uschittagong();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

			if (destination.equals("Rajshahi") == true) {

				if (sclass.equals("Business")) {
					price = price_to_Rajshahi_in_Business_class;
				}

				if (sclass.equals("Economics")) {
					price = price_to_Rajshahi_in_Economy_class;
				}

				usrajshahi();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

			if ((destination.equals("Khulna") == true)) {

				if (sclass.equals("Business")) {
					price = pricetoKhulna_in_Business_class;
				}

				if (sclass.equals("Economy")) {
					price = pricetoKhulna_in_Economy_class;
				}

				uskhulna();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

		}

		//--------novo air
		if (flightname.equals("NOVO AIR") == true) {

			novoAir();

			if (destination.equals("Chittagong") == true) {

				if (sclass.equals("Business")) {
					price = price_to_Chittagong_in_Business_class;
				}

				if (sclass.equals("Economy")) {
					price = price_to_Chittagong_in_Economy_class;
				}

				novochittagong();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

			if (destination.equals("Khulna") == true) {

				if (sclass.equals("Business")) {
					price = pricetoKhulna_in_Business_class;
				}

				if (sclass.equals("Economy")) {
					price = pricetoKhulna_in_Economy_class = 4000;
				}

				novokhulna();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

			if (destination.equals("Rajshahi") == true) {

				if (sclass.equals("Business")) {
					price = price_to_Rajshahi_in_Business_class;
				}

				if (sclass.equals("Economy")) {
					price = price_to_Rajshahi_in_Economy_class;
				}

				novorajshahi();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

		}

		//--------regent air   
		if (flightname.equals("REGENT AIR") == true) {

			regentAir();

			if (destination.equals("Chittagong") == true) {

				if (sclass.equals("Business")) {
					price = price_to_Chittagong_in_Business_class;
				}

				if (sclass.equals("Economy")) {
					price = price_to_Chittagong_in_Economy_class;
				}

				regentchittagong();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

			if (destination.equals("Khulna") == true) {

				if (sclass.equals("Business")) {
					price = pricetoKhulna_in_Business_class;
				}

				if (sclass.equals("Economy")) {
					price = pricetoKhulna_in_Economy_class;
				}

				regentkhulna();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

			if (destination.equals("Rajshahi") == true) {

				if (sclass.equals("Business")) {
					price = price_to_Rajshahi_in_Business_class;
				}

				if (sclass.equals("Economy")) {
					price = price_to_Rajshahi_in_Economy_class;
				}

				regentrajshahi();

				if (time.getValue().equals("Morning")) {
					deptime = dtime1;
					arritime = aritime1;
					dtime = "Morning";
				}

				if (time.getValue().equals("Evening")) {
					deptime = dtime2;
					arritime = aritime2;
					dtime = "Evening";
				}

				if (time.getValue().equals("Night")) {
					deptime = dtime3;
					arritime = aritime3;
					dtime = "Night";
				}

			}

		}

		String str = null;

		File f = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + "totalcustomern.txt");

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		while ((str = br.readLine()) != null) {
			index = index + str;

		}

		br.close();
		cid = Integer.parseInt(index);

		if (sclass.equals("Business")) {
			if (cid <= 15) {
				hlabel.setText("AVAILABLE");
			} else {
				hlabel.setText("NOT AVAILABLE");
			}
		}

		if (sclass.equals("Economy")) {
			if (cid <= 25) {
				hlabel.setText("AVAILABLE");
			} else {
				hlabel.setText("NOT AVAILABLE");
			}
		}

	}

	@FXML
	public void submit(ActionEvent event) {

		customername = cname.getText();
		phonenumber = cphon.getText();
		address = cadd.getText();
		customeremail = cemail.getText();

		if (gendar.getValue().equals("Male")) {
			customergendar = "Male";
		}

		if (gendar.getValue().equals("Female")) {
			customergendar = "Female";
		}

		LocalDate Date = DepDate.getValue();

		lndetail.setText("Customer Id :" + Integer.toString(cid) + "\n" + flightname + "\n" + customername + "\n" + phonenumber + "\n" + address + "\n" + customeremail + "\n" + customergendar + "\n" + dtime + "\n" + sclass + "\n" +"Departure : "+ deptime + "\n" +"Arrival:"+ arritime + "\n" + Integer.toString(price) + " TAKA" + "\n" + "Departure Date : " + Date);

		
	}

	@FXML
	public void confirm(ActionEvent event) throws IOException {

		String copy;

		File A = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "flightname.txt");
		A.getParentFile().mkdirs();
		A.createNewFile();
		FileWriter fw = new FileWriter(A);
		PrintWriter pw = new PrintWriter(fw);
		pw.print(flightname);
		pw.close();

		File h = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "destination.txt");
		h.getParentFile().mkdirs();
		h.createNewFile();
		FileWriter fw7 = new FileWriter(h);
		PrintWriter pw7 = new PrintWriter(fw7);
		pw7.print(destination);
		pw7.close();

		File i = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "time.txt");
		i.getParentFile().mkdirs();
		i.createNewFile();
		FileWriter fw8 = new FileWriter(i);
		PrintWriter pw8 = new PrintWriter(fw8);
		pw8.print(dtime);
		pw8.close();

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

		File g = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "gender.txt");
		g.getParentFile().mkdirs();
		g.createNewFile();
		FileWriter fw6 = new FileWriter(g);
		PrintWriter pw6 = new PrintWriter(fw6);
		pw6.print(customergendar);
		pw6.close();

		File x = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "deperture.txt");
		x.getParentFile().mkdirs();
		x.createNewFile();
		FileWriter fw12 = new FileWriter(x);
		PrintWriter pw12 = new PrintWriter(fw12);
		pw12.print(deptime);
		pw12.close();

		File y = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "arrival.txt");
		y.getParentFile().mkdirs();
		y.createNewFile();
		FileWriter fw13 = new FileWriter(y);
		PrintWriter pw13 = new PrintWriter(fw13);
		pw13.print(arritime);
		pw13.close();

		LocalDate Date = DepDate.getValue();

		File s = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + cid + "/" + "Departure Date.txt");
		s.getParentFile().mkdirs();
		s.createNewFile();
		FileWriter fw15 = new FileWriter(s);
		PrintWriter pw15 = new PrintWriter(fw15);
		pw15.print(Date);
		pw15.close();

		copy = Integer.toString(cid + 1);

		File z = new File("Data/" + flightname + "/" + destination + "/" + sclass + "/" + dtime + "/" + "totalcustomern.txt");
		z.getParentFile().mkdirs();
		z.createNewFile();	
		FileWriter fw11 = new FileWriter(z);
		PrintWriter pw11 = new PrintWriter(fw11);
		pw11.print(copy);
		pw11.close();

		lndetail.setText("\n\n" + "Thank You!!");

	}

}
