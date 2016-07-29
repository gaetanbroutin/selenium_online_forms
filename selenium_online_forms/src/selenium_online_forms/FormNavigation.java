package selenium_online_forms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormNavigation {
	
	
	public void next(WebDriver driver, int actionOccurences) {
		for (int i=1; i<=actionOccurences; i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    driver.findElement(By.xpath("//*[@kind='next_button']")).click();
		}
	}

	public void back(WebDriver driver) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//*[@kind='previous_button']")).click();
	}	
	
	public void save(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//*[@kind='save_button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fadeLayer']")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='fadeLayer']")));
	}	
	public void submit(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//*[@kind='submit_button']")).click();
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    alert.accept();
	}	
}