package selenium_online_forms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class online_form_incoming {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        
        String baseUrl = "https://1602.moveon4.com/form/542405a10f9d30f402000000/eng";
        
        //String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fadeLayer']")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='fadeLayer']")));
        driver.findElement(By.xpath("//*[@kind='next_button']")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@kind='next_button']")).click();
        driver.findElement(By.id("ᐅPersonᐅfieldset-identity_labelᐅsurname")).sendKeys("training123");
        
        // Enter login
      
        

        //close Broswer
        //driver.close();
       
        // exit the program explicitly
        //System.exit(0);
    }

}