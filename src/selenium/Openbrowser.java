package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {

		System.setProperty("webdiver.chrome.driver", "E:\\Selenium\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://sell.amazon.in/");
		//driver.get("https://demo.guru99.com/test/upload/");
		driver.get("https://demo.guru99.com/popup.php");


	}

}
