package Inerg.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Inerg.AbstractComponents.abstractcomponent;

public class Certificate extends abstractcomponent {
	WebDriver driver;
	public Certificate(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Download link
	@FindBy(xpath="//strong[text()=\\\"whatsapp link\\\"]")
	  WebElement whatsapp;
	
	//selecting the cancel option
	 @FindBy(xpath="//button[text()=\\\"Cancel\\\"]")
	  WebElement cancellast;
	
	public void validations3()
	{
		whatsapp.click();
		cancellast.click();
		driver.close();
	}

}
