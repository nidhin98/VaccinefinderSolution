package Inerg.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Inerg.AbstractComponents.abstractcomponent;

public class covidcases extends abstractcomponent {
	
    WebDriver driver;
	
	public  covidcases(WebDriver driver) {

		super(driver);
	//initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//validating refresh button
	@FindBy(xpath="//button[@type=\"button\"])[2]")
	  WebElement refresh2;
			 
	//validating text button on right  
	@FindBy(xpath="//button[@title=\"Text\"]")
	  WebElement text;
			 
			 
	//validating piechart button
	@FindBy(xpath="//button[@title=\"Pie Chart\"]")
	  WebElement piechart;
	
	 //Navigating to Certificate tab 
	@FindBy(xpath="//a[text()=\\\"Download Certificate\\\"]")
	  WebElement download;
		  
	
	public void validations2()
	{
		refresh2.click();
		text.click();
		piechart.click();
		download.click();
	}
			  

}
