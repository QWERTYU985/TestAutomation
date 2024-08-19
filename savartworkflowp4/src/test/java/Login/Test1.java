
package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://staging.savart.com/admin");
		Thread.sleep(5000);
		driver.findElementById("email").sendKeys("chaitanya@savart.com");
		driver.findElementById("standard-adornment-password").sendKeys("Chaitu@5454");
		driver.findElementByXPath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained jss6 MuiButton-containedPrimary MuiButton-fullWidth\"]").click();
		Thread.sleep(5000);
		 String pageTitle = driver.getTitle();
		 WebElement element = driver.findElement(By.tagName("body"));

	        // Check if the element is present
	        if (element.isDisplayed()) {
	            System.out.println("Page is loading: " + driver.getTitle());
	        } else {
	            System.out.println("Page is not loading properly.");
	        }
		if (!pageTitle.isEmpty()) {
	            System.out.println("Page is loading: " + pageTitle);
	        } else {
	            System.out.println("Page is not loading properly.");
	        }
		if (pageTitle != null && !pageTitle.isEmpty()) {
	            System.out.println("Page is showing: " + pageTitle);
	        } else {
	            System.out.println("Page is not showing properly.");
	        }
	
	/*(driver.getCurrentUrl().equals("https://staging.savart.com/admin/#/dashboard/prospect")) {
			System.out.println("login successfully");
		}
			else {
				System.out.println("login failed");
			}*/
		
		//driver.close();
	
	

		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		/*driver.findElementByXPath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained jss6 MuiButton-containedPrimary MuiButton-fullWidth\"]").click();
	    driver.findElementByXPath("//div[@class='tfilter']//span[1]//*[name()='svg']").click();
	    driver.findElementByXPath("//tbody/tr[1]/td[1]/span[1]/span[1]/input[1]").click();
	    driver.close();*/
        driver.findElementByXPath("//span[normalize-space()='Discount Manager']").click();
		Thread.sleep(5000);
		if (driver.getCurrentUrl().equals("https://staging.savart.com/admin/#/dashboard/prospect")) {
			System.out.println("page loading successfull");
		}
			else {
				System.out.println("page loading failed");
			}
		

		/*driver.findElementByXPath("//button[@id=\"simple-tab-2\"]").click();
		Thread.sleep(5000);
        driver.findElementByXPath("//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected\"]").click();
		Thread.sleep(5000);
        driver.findElementByXPath("//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary\"][3]").click();	
        Thread.sleep(5000);
        driver.findElementByXPath("//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary\"][4]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Ticket Manager']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Add Ticket']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Back']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='MF Dashboard']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Prospect Manager']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Add prospect']").click();*/
		driver.findElementByXPath("//span[normalize-space()='Onboarding Manager']").click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement e= driver.findElementByXPath("//tbody/tr[1]/td[2]/div[1]");
		act.doubleClick(e).perform();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='userinfotab']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Back']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//button[normalize-space()='Investments']").click();
		Thread.sleep(5000);
		/*driver.navigate().back();
		Thread.sleep(5000);*/
        driver.findElementByXPath("//button[@ class=\"ovrbtn\"][1]").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//span[normalize-space()='Back']").click();
        Thread.sleep(5000);
        
		driver.findElementByXPath("//span[normalize-space()='Portfolio']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Investments']").click();
		Thread.sleep(5000)	;
		driver.findElementByXPath("//span[normalize-space()='Investment Review']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Discount Manager']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Important']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Executive List']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='All Tasks']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//span[normalize-space()='Export']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-outlined\"]").click();
		Thread.sleep(5000);
		//driver.findElementsByXPath(");
	    driver.findElementByXPath("//span[normalize-space()='Discount Manager']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Executive List']").click();
	    Thread .sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='All Tasks']").click();
	    Thread.sleep(5000);
	    //driver.findElementByXPath("//span[normalize-space()='Ticket Manager']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Add Ticket']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='MF Dashboard']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Export']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Cancel']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div//div//div[@class='MuiTablePagination-root']//button[@title='Next page']//span[@class='MuiIconButton-label']//*[name()='svg']").click();
	    driver.findElementByXPath("//span[normalize-space()='Investor Manager']1").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Portfolio']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Investments']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Discount Manager']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Important']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Executive List']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='All Tasks']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Export']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Broker Manager']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='User Management']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//*[name()='path' and contains(@d,'M8.59 16.3')]").click();
	    driver.findElementByXPath("//span[normalize-space()='Users']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//button[@title='Next page']//span[@class='MuiIconButton-label']//*[name()='svg']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Add New Role']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Add New User']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Referral Manager']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//button[@title='Next page']//span[@class='MuiIconButton-label']//*[name()='svg']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Content Management System']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Archived Posts']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Add Post']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Back']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//div[9]").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//button[@title='Next page']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Discount Manager']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Add Notification']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Lookup Manager']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//button[@title='Next page']//span[@class='MuiIconButton-label']//*[name()='svg']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Add New Lookup Detail']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Back']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Call Requests']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//button[@title='Next page']//span[@class='MuiIconButton-label']//*[name()='svg']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Investors Calls']").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//span[normalize-space()='Internal Support']").click();
	    Thread.sleep(5000);
	}


	    
        /*driver.findElementByXPath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeStart']//span[@class='MuiIconButton-label']//*[name()='svg']").click();
		Thread.sleep(5000)
		driver.findElementByXPath("//div[@class='passwordparent']//div[2]").click();
		Thread.sleep(5000);
		if (driver.getCurrentUrl().equals("https://staging.savart.com/admin/#/")) {
			System.out.println("logout successfull");
		}
		  else {
				System.out.println("logout failed");
			
		  }
		
		driver.close();*/
        
		
		}
		

