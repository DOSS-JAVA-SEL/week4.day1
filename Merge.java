package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Merge {

	public static void main(String[] args) {
		
	 //Pseudo Code
		//setting the browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		 // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		//driver.get("http://leaftaps.com/opentaps/control/login\");
		 
		// 2. Enter UserName and Password Using Id Locator
		
		// 3. Click on Login Button using Class Locator
	
		// 4. Click on CRM/SFA Link
		
		// 5. Click on contacts Button
		
		// 6. Click on Merge Contacts using Xpath Locator
	
		 // 7. Click on Widget of From Contact
		
		// 8. Click on First Resulting Contact
		
		// 9. Click on Widget of To Contact
		
		// 10. Click on Second Resulting Contact
		
		// 11. Click on Merge button using Xpath Locator
		 
		// 12. Accept the Alert
		
		//13. Verify the title of the page
		
	}

}