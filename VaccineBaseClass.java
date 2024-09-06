package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Inerg.pageobjects.Certificate;
import Inerg.pageobjects.LandingPage;
import Inerg.pageobjects.covidcases;

public class VaccineBaseClass {

	public static void main(String[] args) throws InterruptedException {
	//Initializing driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
	
//Reference to Landing page
				LandingPage landingpage = new LandingPage(driver);
				landingpage.goTo();
				landingpage.validations1();
				
				
//1st Page-Vaccine Finder
//1 dropdown in vaccine finder page-Defect
						// WebElement drop =driver.findElement(By.xpath("//Select[@name=\"selectState\"]"));
						// Select dropdown = new Select(drop);
						// dropdown.selectByIndex(1);
						 
//2 dropdown in vaccine finder page-Defect
						// WebElement drop2 =driver.findElement(By.xpath("//Select[@name=\"selectState\"]"));
						// Select dropdown2 = new Select(drop2);
						// dropdown.selectByIndex(1);
				 
//selecting the 1st radio button from left(Reset Current Search)
				  
		        Boolean b1 =driver.findElement(By.xpath("//button[@class=\"mr-2 mt-2 btn btn-outline-info btn-sm\"][1]")).isSelected();		 
				  if(b1==false)
				  {  System.out.println(b1+ " Reset Current Search is not selected");}
				  else {System.out.println(b1+ " Reset Current Search is  selected");}

//selecting the 2nd button from left
					
					  Boolean b2 =driver.findElement(By.xpath("//button[@title='Refresh']")).isSelected();
					  if(b2==false)
					  {  System.out.println(b2+ " Refresh Button is not selected");}
					  else {System.out.println(b2+ " Refresh Button is  selected");}
					  
//selecting the 3rd Radio button from left
						 
						  Boolean b3 =driver.findElement(By.xpath("//button[@title=\"Notification\"]")).isSelected();
						  //System.out.println(b3+ "Notification radio button is not selected");
						  if(b3==false)
						  {  System.out.println(b3+ " Notification radio button is not selected");}
						  else {System.out.println(b3+ " Notification radio button is not selected");}
				
 //navigating to 2nd page-Covid Cases
						  covidcases covid = new covidcases(driver);
						  covid.validations2();
						  
//2 dropdowns in covid cases tab
						  
//1 dropdown in Covid Cases  tab-Defect				
				// WebElement drop3 =driver.findElement(By.xpath("//Select[@name="selectedState"]"));
				// Select dropdown3 = new Select(drop3);
				// dropdown.selectByIndex(1);
						 
//2 dropdown in covid cases page-Defect
				// WebElement drop4 =driver.findElement(By.xpath("//Select[@name="selectedDistrict"]"));
				// Select dropdown4 = new Select(drop4);
				// dropdown.selectByIndex(1);
				
						  
//validating refresh radio  button on left
			 Boolean b4 =driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).isSelected();
			  if(b4==false)
			  {  System.out.println(b4+ " Refresh Button is not selected");}
			 else {System.out.println(b4+ " Refresh Button is  selected");}
							  
//validating text radio button on right  
							 
							  Boolean b5 =driver.findElement(By.xpath("//button[@title=\"Text\"]")).isSelected();
							  
							  if(b5==false)
							  {  System.out.println(b5+ "  Text Button is not selected");}
							  else {System.out.println(b5+ "  Text Button is  selected");}
							   
//validating piechart radio button on the right
							 					 
							  Boolean b6 =driver.findElement(By.xpath("//button[@title=\"Pie Chart\"]")).isSelected();
							  if(b6==false)
							  {  System.out.println(b6+ " Pie chart Button is not selected");}
							  else {System.out.println(b6+ " Pie chart Button is  selected");}				
						  
// Navigating to 3rd one (download certificate)
						  
							  Certificate certificate = new Certificate(driver);
							  certificate.validations3();
									  
				  
			
				  

	}

}
