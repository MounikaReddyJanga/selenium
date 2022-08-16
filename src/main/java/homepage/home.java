package homepage;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.model.Frame;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.jodah.failsafe.internal.util.Assert;



public class home {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\e005056\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.virginvoyages.com/book/");
		Thread.sleep(7000);
		
		
		
//		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"helpButtonSpan\"]")));
//		driver.findElement(By.xpath("//*[@id=\"helpButtonSpan\"]")).click();
//        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        
//
//		Alert allertpopup = driver.switchTo().alert();
//		allertpopup.dismiss();
		//WebElement sendtexttoframe = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]")));
//		Thread.sleep(2000);
//		 driver.findElement(By.id("tinymce")).clear();
//	    driver.findElement(By.id("tinymce")).sendKeys("I'm inside frame");
	    
//        Actions mousehover = new Actions(driver);
//        mousehover.moveToElement(driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"))).build().perform();
//        

        
        
//        System.out.println(driver.getTitle());
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Book a Cruise | Virgin Voyages";
//        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
//        	System.out.println("Titles are same : Pass");
//        }
//        else {
//        	System.out.println("Titles are not same : fail");
//        }
//        
	      
       
        
//        WebElement firstname = driver.findElement(By.name("firstname"));
//        firstname.sendKeys("TestVV");
//        WebElement lastname = driver.findElement(By.name("lastname"));
//        lastname.sendKeys("Sailor");
//        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
//        email.sendKeys("mail@gmail.com");
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("hjkl");
//        Select month = new Select(driver.findElement(By.xpath("//*[@aria-label='Select Month']")));
//        month.selectByVisibleText("JUN");
//        Select date = new Select(driver.findElement(By.xpath("//*[@aria-label='Select Day']")));
//        date.selectByIndex(3);
//        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div/div[2]/form/div/div[6]/div/div/div[3]/div/select")));
//        year.selectByValue("1996");
//        
//        try {
//        	Boolean click =  driver.findElement(By.xpath("//*[@for='subscribeEmail']")).isSelected();
//        	System.out.println("able to click" + click);
//        	
//        }
//        catch (Exception e) {
//        	System.out.println("Unable to click the checkbox");
//        }
//        

	}
}
