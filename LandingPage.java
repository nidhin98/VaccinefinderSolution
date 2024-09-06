package Inerg.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Inerg.AbstractComponents.abstractcomponent;

public class LandingPage extends abstractcomponent {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		super(driver);
		//initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//selecting about
	  @FindBy(xpath="//span[text()=\"About\"]")
	  WebElement about;
	  
	//selecting the 1st link (name)
	  @FindBy(xpath="//div[@class=\"modal-body\"]/p/a/strong[text()=\"Athul Nair\"]")
	  WebElement namelink;
	  
	//selecting the 2nd link (cowin)
	  @FindBy(xpath="//a[text()=\"CoWIN API Guidelines\"]")
	  WebElement cowinlink;
	  
	//selecting the cancel option
	  @FindBy(xpath="//button[text()=\"Cancel\"]")
	  WebElement cancel;
	  
	//selecting refresh
	  @FindBy(xpath="//button[text()=\"Refresh\"]")
	  WebElement refresh;
		 
	//selecting the 1st button from left
	  @FindBy(xpath="//button[@class=\"mr-2 mt-2 btn btn-outline-info btn-sm\"][1]")
	 WebElement reset;
		  
	//selecting the 2nd button from left
	  @FindBy(xpath="//button[@title=\"Refresh\"]")
	  WebElement refreshleft;
			  
			  
	//selecting the 3rd button from left
	  @FindBy(xpath="//button[@title=\"Notification\"]")
	  WebElement notification;
	  
	//navigating to 2nd page
	  @FindBy(xpath="//a[text()=\"Covid Cases\"]")
	  WebElement covidcases;
	  
	  //wait condition  
	 //By alertby = By.xpath("//div[@class=\"modal-body\"]/p/a/strong[text()=\"Athul Nair\"]");
	  
	  public void validations1() throws InterruptedException
	  {
		  about.click();
		  
		//waitforelementtoappear(alertby);
		  namelink.click();
		  cowinlink.click();
		  cancel.click();
		  Thread.sleep(2000);
		  refresh.click();
		  refreshleft.click();
		  notification.click();
		  covidcases.click();
	  }
	  
	  
	  public void goTo()
	  { driver.get("https://indian-vaccine.web.app/");
	  }		  
	  
	  
		 
	  
	  
	  
	  
		 

}
