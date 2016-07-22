package selenium_online_forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectOption{

	public void SelectOption(WebDriver driver, WebDriverWait wait, String idSelect, String value) {
	    driver.findElement(By.name(idSelect)).click();
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@name='"+ idSelect + "' and @class='busy']")));
	    Select countries = new Select(driver.findElement(By.name(idSelect)));
	    countries.selectByValue(value);
	    driver.findElement(By.name(idSelect)).click();
	}
}
