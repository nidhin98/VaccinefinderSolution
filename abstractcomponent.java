package Inerg.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractcomponent {
	
	WebDriver driver;
	
	public abstractcomponent(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		
	}

	public void waitforelementtoappear( By findBy)
	
	{WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	

}}
