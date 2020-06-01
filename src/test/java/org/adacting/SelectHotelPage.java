package org.adacting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SelectHotelPage extends BaseLogin {
	
	public SelectHotelPage() {
		
	PageFactory.initElements(driver, this);}

	@FindBy(id="radiobutton_4")
	private WebElement radiobtn;
	@FindBy(id="continue")
	private WebElement cbtn;
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getCbtn() {
		return cbtn;
	}
	


}
