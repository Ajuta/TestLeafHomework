package week2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.sendKeys("rini");
		alert.accept();
//		driver.switchTo().frame("iframeResult");
		String text = driver.findElementByXPath("//p[contains(text(),'rini')]").getText();
		System.out.println(text);
		
	}

}
