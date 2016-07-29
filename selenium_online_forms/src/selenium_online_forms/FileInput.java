package selenium_online_forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileInput {

	public static void upload(WebDriver driver, String inputPath,  String filePath) {
		driver.findElement(By.id(inputPath)).sendKeys(filePath);
	}
	
}
