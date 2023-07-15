import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowsAuthentication {

	public static void main(String[] args) {

		System.setProperty("webdriver.geckodriver.driver",
				"/Users/shellymutu-grigg/firefoxdriver_mac_aarch64/geckodriver");
		WebDriver firefoxDriver = new FirefoxDriver();

		// Send username and password for windows authentication via URL
		firefoxDriver.get("https://admin:admin@the-internet.herokuapp.com/");
		firefoxDriver.findElement(By.linkText("Basic Auth")).click();

		firefoxDriver.close();

	}

}
