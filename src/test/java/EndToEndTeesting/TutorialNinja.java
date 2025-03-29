package EndToEndTeesting;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialNinja {

	
	WebDriver driver;
	@BeforeTest
	
	public void set() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		
	}
	//.....register functionality................
	
	@Test
	public void Register() throws InterruptedException {
		
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myaccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='My Account']")));
		myaccount.click();
	
	WebElement Register = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']"));
	Register.click();

	Thread.sleep(4);
	// automate the register functionality
	
	WebElement fname = driver.findElement(By.xpath("//input[@id='input-firstname']"));
	fname.sendKeys("Rajit");
	
	WebElement lname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
	lname.sendKeys("Kumar");
	
	WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));	
	email.sendKeys("raaaaajjit123@gmail.com");
	
	WebElement telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
	telephone.sendKeys("1234566");
	
	
	WebElement pwd = driver.findElement(By.xpath("//input[@id='input-password']"));
	pwd.sendKeys("rajit@123");
	
	WebElement confpwd= driver.findElement(By.xpath("//input[@id='input-confirm']"));
	confpwd.sendKeys("rajit@123");
	
	WebElement subscribeBtn= driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
	subscribeBtn.click();
	
	WebElement policybtn= driver.findElement(By.xpath("//input[@name='agree']"));
	policybtn.click();
	
	WebElement submitbtn= driver.findElement(By.xpath("//input[@value='Continue']"));
	submitbtn.click();
	
	
	
	
	WebElement logout = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"));
	logout.click();
	
	
	
	
	String successmsg = driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).getText();
	
	if(successmsg.contains("Your Account Has Been Created!")) {
		System.out.println("The user is successfully login");
	}else {
		System.out.println("The user is not successfully login");

	}
	
	}
	
	//.........Login functionality................
	
	@Test()
	public void login() {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myaccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='My Account']")));
		myaccount.click();
		
		WebElement Login = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']"));
		Login.click();
		
		
		WebElement  Email= driver.findElement(By.xpath("//input[@id='input-email']"));
		Email.sendKeys("rajit123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.sendKeys("rajit@123");
		
		
		
	}
	//.....search and add to cart functionality...........
	
	@Test()
	public void searchProduct() throws InterruptedException {
		WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchbar.sendKeys("Phone");
		
		WebElement searchbtn = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		searchbtn.click();
		
		Thread.sleep(4);
		
		WebElement product = driver.findElement(By.xpath("//div[@class='image']//a"));
		product.click();
		
		WebElement productselection = driver.findElement(By.xpath("//li[5]//a[1]//img[1]"));
		productselection.click();
		
		
		WebElement productselectionCancleBtn= driver.findElement(By.xpath("//button[normalize-space()='×']"));
		productselectionCancleBtn.click();
		
	   WebElement addtoCartbtn = driver.findElement(By.xpath("//button[@id='button-cart']"));
	   addtoCartbtn.click();
	
	   WebElement cartBox = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
	   cartBox.click();
	
	  WebElement viewcartbtn= driver.findElement(By.xpath("//strong[normalize-space()='View Cart']"));
	  viewcartbtn.click();
	
	 String producttext = driver.findElement(By.xpath("//div[@class='table-responsive']")).getText()	;
	 System.out.println(producttext);
	 
	 Thread.sleep(5);
	 
	 if(producttext.contains("iPhone *** product 11")) {
			System.out.println("The user is successfully login");
		}else {
			System.out.println("The user is not successfully login");

		}
	 
		 
	 
	 //checkout the product.........
	 
	 
	 WebElement checkoutbtn = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
	 checkoutbtn.click();
	 	 
	 
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
