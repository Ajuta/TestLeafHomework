package week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		WebElement demo = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		WebElement source = driver.findElementByXPath("//p[text()='Drag me around']");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(source, source.getLocation().getX()+50, source.getLocation().getY()+50).perform();
		}

}
