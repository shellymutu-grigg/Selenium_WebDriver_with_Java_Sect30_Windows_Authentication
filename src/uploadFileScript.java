import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.MessageFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadFileScript {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		// Initialize webDriver
		System.setProperty("webdriver.geckodriver.driver",
				"/Users/shellymutu-grigg/firefoxdriver_mac_aarch64/geckodriver");
		WebDriver firefoxDriver = new FirefoxDriver();

		// Cater for page load
		firefoxDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to web site
		firefoxDriver.get("https://www.grammarly.com/plagiarism-checker");

		// Cater for page load
		firefoxDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize window
		firefoxDriver.manage().window().maximize();

		// Scroll operation using Javascript Executor
		JavascriptExecutor js = (JavascriptExecutor) firefoxDriver;

		// Scroll Down page browse option
		js.executeScript("window.scrollBy(0,200)");

		// Allow processing time after scroll
		Thread.sleep(3000);

		// Find upload file element
		WebElement chooseFile = firefoxDriver.findElement(By.xpath("(//span[@class='o9viu-text'])[2]"));

		// Click on element
		chooseFile.click();

		// Allow processing time after click
		Thread.sleep(2000);

		StringSelection stringSelection = new StringSelection(
				"/Users/shellymutu-grigg/Desktop/Lynngate_2b_april_mow_23.doc");

		// Copy to clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Create an object of Robot class
		Robot robot = new Robot();

		// CMD + TAB is needed to regain focus
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);

		// Open Goto window CMD+SHIFT+G
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_G);
		robot.delay(1000);

		// CMD + TAB is needed to regain focus
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);

		// Open Goto window CMD+SHIFT+G
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_G);
		robot.delay(1000);

		// Paste the clip board value CMD+V
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);

		// Press Enter key to select file
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);

		// Paste the clip board value CMD+V
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);

		// Press Enter key to select file
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);

		// Press Escape key to close the Goto window and Upload window
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.delay(1000);

		firefoxDriver.close();

		System.out.println(MessageFormat.format("Successfully uploaded file", "uploaded"));
	}
}
