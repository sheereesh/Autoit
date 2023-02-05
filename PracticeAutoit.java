package practicelAutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Register.html");
		 Thread.sleep(6000);
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
 WebElement button=driver.findElement(By.xpath("//input[@id='imagesrc']"));
		 //JavascriptExecutor js=(JavascriptExecutor)driver;
		 //js.executeScript("arguments[0].click();",button);
 Actions action=new Actions(driver);
 action.moveToElement(button).click().build().perform();
 Thread.sleep(4000);
 Runtime.getRuntime().exec("D:/Fileupload.exe");
 Thread.sleep(5000);
 driver.quit();
		 }

}
