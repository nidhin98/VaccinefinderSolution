package demo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VaccineFinderPageSingle {

	public static void main(String[] args) {
		
//Setting Up Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//Launching URL	
		driver.get("https://indian-vaccine.web.app/");
		
//1st Page-Vaccine Finder
		
//1 dropdown in vaccine finder page-Defect
		// WebElement drop =driver.findElement(By.xpath("//Select[@name=\"selectState\"]"));
		// Select dropdown = new Select(drop);
		// dropdown.selectByIndex(1);
		 
//2 dropdown in vaccine finder page-Defect
		// WebElement drop2 =driver.findElement(By.xpath("//Select[@name=\"selectState\"]"));
		// Select dropdown2 = new Select(drop2);
		// dropdown.selectByIndex(1);
		 
//selecting about
		 driver.findElement(By.xpath("//span[text()=\"About\"]")).click();
		 
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			
//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class=\"modal-body\"]/p/a/strong[text()=\"Athul Nair\"]"))));
		 
//selecting the 1st link (name-Athul Nair) from About
		 driver.findElement(By.xpath("//div[@class=\"modal-body\"]/p/a/strong[text()=\"Athul Nair\"]")).click();
		 
//selecting the 2nd link (cowin) from About
		 driver.findElement(By.xpath("//a[text()=\"CoWIN API Guidelines\"]")).click();
		 
 //selecting the cancel option in about tab
		 driver.findElement(By.xpath("//button[text()=\"Cancel\"]")).click();
		 
 //selecting refresh button in the centre
		 driver.findElement(By.xpath("//button[text()=\"Refresh\"]")).click();
		 
//selecting the 1st radio button from left(Reset Current Search)
		 driver.findElement(By.xpath("//button[@title=\"Reset Current Search\"]")).click();
		  Boolean b1 =driver.findElement(By.xpath("//button[@title=\"Reset Current Search\"]")).isSelected();		 
		  if(b1==false)
		  {  System.out.println(b1+ " Reset Current Search is not selected");}
		  else {System.out.println(b1+ " Reset Current Search is  selected");}

//selecting the 2nd button from left
			 driver.findElement(By.xpath("//button[@title='Refresh']")).click();
			  Boolean b2 =driver.findElement(By.xpath("//button[@title='Refresh']")).isSelected();
			  if(b2==false)
			  {  System.out.println(b2+ " Refresh Button is not selected");}
			  else {System.out.println(b2+ " Refresh Button is  selected");}
			  
//selecting the 3rd Radio button from left
				 driver.findElement(By.xpath("//button[@title=\"Reset Current Search\"]")).click();
				  Boolean b3 =driver.findElement(By.xpath("//button[@title=\"Notification\"]")).isSelected();
				  //System.out.println(b3+ "Notification radio button is not selected");
				  if(b3==false)
				  {  System.out.println(b3+ " Notification radio button is not selected");}
				  else {System.out.println(b3+ " Notification radio button is not selected");}
		  
//navigating to 2nd page-Covid Cases
				  
		driver.findElement(By.xpath("//a[text()=\"Covid Cases\"]")).click();
		
//2 dropdowns in covid cases
//1 dropdown in Covid Cases page-Defect		
		        // WebElement drop3 =driver.findElement(By.xpath("//Select[@name="selectedState"]"));
				// Select dropdown3 = new Select(drop3);
				// dropdown.selectByIndex(1);
				 
//2 dropdown in Covid Cases page-Defect
				// WebElement drop4 =driver.findElement(By.xpath("//Select[@name="selectedDistrict"]"));
				// Select dropdown4 = new Select(drop4);
				// dropdown.selectByIndex(1);
		
				  
//validating refresh radio  button on left
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		  Boolean b4 =driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).isSelected();
		 // System.out.println(b3+ "Refresh radio button is not selected");
		  if(b4==false)
		  {  System.out.println(b4+ " Refresh Button is not selected");}
		  else {System.out.println(b4+ " Refresh Button is  selected");}
		  
//validating text radio button on right  
		  driver.findElement(By.xpath("//button[@title=\"Text\"]")).click();
		  Boolean b5 =driver.findElement(By.xpath("//button[@title=\"Text\"]")).isSelected();
		  //System.out.println(b5+ "Text radio button is  selected");
		  if(b5==false)
		  {  System.out.println(b5+ "  Text Button is not selected");}
		  else {System.out.println(b5+ "  Text Button is  selected");}
		   
 //validating piechart radio button on the right
		  
		  driver.findElement(By.xpath("//button[@title=\"Pie Chart\"]")).click();
		  Boolean b6 =driver.findElement(By.xpath("//button[@title=\"Pie Chart\"]")).isSelected();
		  if(b6==false)
		  {  System.out.println(b6+ " Pie chart Button is not selected");}
		  else {System.out.println(b6+ " Pie chart Button is  selected");}
		  
		  
		  
// Navigating to 3rd Page-download certificate
		  
		  driver.findElement(By.xpath("//a[text()=\"Download Certificate\"]")).click();
		  
//clicking on the whatsapp link 
		  
		  driver.findElement(By.xpath("//strong[text()=\"whatsapp link\"]")).click();
		  
//selecting the cancel option
			 driver.findElement(By.xpath("//button[text()=\"Cancel\"]")).click();
		  
	}
	}


