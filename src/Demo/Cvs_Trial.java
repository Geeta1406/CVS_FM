package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cvs_Trial {
	
	WebDriver driver;
	
	// DRIVER SETUPS  //
	  public  void  Browser_setup(String url) throws InterruptedException
	 {
		// Set the system property for the ChromeDriver executable
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	   		// Initialize the WebDriver
	   		//WebDriver driver = new ChromeDriver();
	   		this.driver=new ChromeDriver();
	   		 // Navigate to the specified URL
	   		 this.driver.get(url);

	   	        //  Maximize the browser window
	   	        this.driver.manage().window().maximize();

	   		 Thread.sleep(2000);
		
	 }
	  // LOGIN CVS WEB//
	  
	  public void  Login() throws InterruptedException
	  {
		  
		   
	  
		  //  User name//
	  
		    this.driver.findElement(By.name("email")).sendKeys("tshetty@forbesmarshall.com");
		  
		   Thread.sleep(2000);
		  
		   // password//
		   this.driver.findElement(By.name("password")).sendKeys("123Tirth123@");
			  Thread.sleep(2000);
		   
			// login  button //
			  
			 this.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			  	  
	  }
	  
	  // cvs - control valve sizing//
	   public void  cvs() throws InterruptedException
	   {
		 //button1-cvs //
	    	
			 driver.findElement(By.id("button1")).click();
			  Thread.sleep(2000);
			   
	   }
	   
	   // *****CustomerDetails*****// 
	    public void  customer_details() throws InterruptedException
	    {
	    	//CustomerDetailsBtn
	       	driver.findElement(By.id("CustomerDetailsBtn")).click();
	        Thread.sleep(2000);
	        
	   	    //offer no 
	       	driver.findElement(By.xpath("//input[@id='OfferNo']")).sendKeys(" offer no-1");
	        Thread.sleep(2000);
	        
	    	//Qty 
	      	 driver.findElement(By.xpath("//input[@id='Qty']")).sendKeys("1");
	        Thread.sleep(2000);
	        
	      //ItemNo
	      	 driver.findElement(By.xpath("//input[@id='ItemNo']")).sendKeys("1");
	        Thread.sleep(2000);

	      //SheetNo
	      	 driver.findElement(By.xpath("//input[@id='SheetNo']")).sendKeys("1");
	        Thread.sleep(2000);
	      	
	      	//Customer
	       driver.findElement(By.xpath("//input[@id='Customer']")).sendKeys(" company");
	       Thread.sleep(2000);
	      	
	      	//Project
	      	driver.findElement(By.xpath("//input[@id='Project']")).sendKeys("arca cvs ");
	       Thread.sleep(2000);
	      	
	      	//TagNo
	      	driver.findElement(By.xpath("//input[@id='TagNo']")).sendKeys("  tag no-12");
	       Thread.sleep(2000);
	      	
	      	//EnggName
	      	driver.findElement(By.xpath("//input[@id='EnggName']")).sendKeys(" arca engineer ");
	       Thread.sleep(2000);
	      	
	      	//RevisionNo
	      	driver.findElement(By.xpath("//input[@id='RevisionNo']")).sendKeys("1");
	       Thread.sleep(2000);
	      	
	      	//CustomerRef
	      	driver.findElement(By.xpath("//input[@id='CustomerRef']")).sendKeys("refernce 1");
	       Thread.sleep(2000);
	      	 	

	    }
	    
	    ///*** field  parameter***//
	    public void  Field_Parameter()
	    {
             //select-fluid-type
       driver.findElement(By.xpath("//select[@id='select-fluid-type']"));

                      //fluid
       driver.findElement(By.xpath("//select[@id='fluid']"));

                   //units-type
        driver.findElement(By.xpath("//select[@id='units-type']"));

                     //model
        driver.findElement(By.xpath("//select[@id='model']"));

                      //qw
        driver.findElement(By.xpath("//select[@id='qw']"));
                      
	    }
       public static void main(String[] args) throws InterruptedException 
       {
           Cvs_Trial fm = new Cvs_Trial();
           
             fm.Browser_setup(" http://localhost:3000");
             fm.Login();
             fm.cvs();
             fm.customer_details();
             fm.Field_Parameter();
             
             
       }
}

