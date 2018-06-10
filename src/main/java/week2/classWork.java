package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classWork {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("MicroSoft");
		driver.findElementById("createLeadForm_firstName").sendKeys("Dona");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jackson");
//		driver.findElementByClassName("smallSubmit").click();
		//dropdown
		WebElement object1 = driver.findElementById("createLeadForm_dataSourceId");
		Select source = new Select(object1);
		source.selectByVisibleText("Existing Customer");
		
		WebElement object2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketing = new Select(object2);
		marketing.selectByIndex(3);
		
		WebElement object3 = driver.findElementById("createLeadForm_industryEnumId");
		Select industry = new Select(object3);
		List<WebElement> alloptions = industry.getOptions();
		for (WebElement eachoption : alloptions) {
			System.out.println(eachoption.getText());
			}
		
//		Day2
		driver.findElementById("createLeadForm_birthDate-button").click();
		WebElement table = driver.findElementByXPath("//div[@class='calendar']/table");
		List<WebElement> rows = table.findElements(By.className("daysrow"));
		System.out.println(rows.size());
		WebElement row = rows.get(3);
		List<WebElement> cols = row.findElements(By.tagName("td"));
		WebElement col = cols.get(1);
		col.click();
		System.out.println(col.getText());
		
//		Xpath
			
			
		driver.findElementByName("submitButton").click();
		driver.close();

	}

}
