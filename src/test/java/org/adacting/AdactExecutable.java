package org.adacting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdactExecutable extends BaseLogin {
	
	@DataProvider(name="data")
	public Object [][] dataprovider(){
		return new Object[][] {
			
			{"jananielumalai","kirish8818"}
		};
	}
	@Test(dataProvider = "data")
	public void test1(String s1,String s2){
		launch ("https://adactin.com/HotelApp/");
		driver.manage().window().maximize();
		AdactingLogin a = new AdactingLogin();
		fill(a.getUser(),s1);
		fill(a.getPass(),s2);
		klick(a.getLogin().get(0));}
	@DataProvider(name="data1")
	public Object [][] dataProvider1(){
		return new Object[][] {
			{"Paris","  2 - Two","25/05/2020","28/05/2020","3 - Three"}
		};}
	@Test(dataProvider = "data1")
	public void test2(String s3,String s4,String s5,String s6,String s7) {
	SearchHotelPage h = new SearchHotelPage();
		select(h.getLocat(),s3);
		select(h.getRoomnum(),s4);
		fill(h.getCheckindate(),s5);
		fill(h.getCheckoutdate(),s6);
		select(h.getAdult(),s7);
		klick(h.getSearchbtn());
  SelectHotelPage p =new SelectHotelPage();
		klick(p.getRadiobtn());
		klick(p.getCbtn());}
		@DataProvider(name="data3")
		public Object [][] dataProvider3(){
			return new Object[][] {
				{"janani","Elumalai","no.14 NarayanaSwamy Street,Sholinganallur,Chennai","8608306147228844","VISA","May","2021","224"}
			};}
		@Test(dataProvider = "data3")
		public void test2(String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15) {	
BookingPage b = new BookingPage();
	      fill(b.getFname(),s8);
		  fill(b.getLname(),s9);
		  fill(b.getAdd(),s10);
		  fill(b.getCreditnum(),s11);
		  select(b.getCredittype(),s12);
		  select(b.getExmnth(),s13);
		  select(b.getExyear(),s14);
		  fill(b.getCvvnum(),s15);
		  klick(b.getBookbtn());
		//ConformationPage c = new ConformationPage();
		//System.out.println("FirstName:"+getvalue(c.getFirsname()));
		//System.out.println("Address:"+getvalue(c.getAdd()));
		

		
	}
}


