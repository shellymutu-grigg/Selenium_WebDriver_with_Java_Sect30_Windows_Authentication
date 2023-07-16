import java.awt.AWTException;
import java.io.IOException;
import java.text.MessageFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadFileScript {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.geckodriver.driver",
				"/Users/shellymutu-grigg/firefoxdriver_mac_aarch64/geckodriver");
		WebDriver firefoxDriver = new FirefoxDriver();

		firefoxDriver.get("https://altoconvertpdftojpg.com/");
		WebElement chooseFile = firefoxDriver.findElement(By.id("browse"));
		chooseFile.sendKeys("/Users/shellymutu-grigg/Desktop/NEW_ZEALAND_WARRANTY_EN.PDF");
		firefoxDriver.findElement(By.id("browse")).click();

		Thread.sleep(3000);

		// This does not work yet
		System.out.println(MessageFormat.format("Successfully uploaded file", "uploaded"));

		firefoxDriver.findElement(By.id("submit_btn")).click();

		Thread.sleep(4000);

		firefoxDriver.close();

	}

}
