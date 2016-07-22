package selenium_online_forms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        
        String baseUrl = "https://1602-bo.moveon4.com/";

        
        //String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        // Enter login
        driver.findElement(By.name("username")).sendKeys("training@test.com");
        driver.findElement(By.name("password")).sendKeys("training123");
        driver.findElement(By.name("password")).submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sideBarFunding_wrapper")));
        driver.findElement(By.id("sideBarFunding_wrapper")).click();
        driver.findElement(By.id("sideBarOption-fundings")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='actionsToolbar']/li[1]/a")));
        driver.findElement(By.xpath("//*[@id='actionsToolbar']/li[1]/a")).click();
        
        
        //instanciate and click on dropdown
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='customFormLoading']")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='customFormLoading']")));
        List<WebElement> allDropDowns = driver.findElements(By.xpath("//*[@id='info_Funding_']//select[not(@disable_validation='true')]"));
        for (WebElement element: allDropDowns){
            element.click();
        }
        //Select countries = new Select(driver.findElement(By.name("countryId")));
        //countries.selectByIndex(0);
        // get the actual value of the title
      //  actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        */
        //close Broswer
        //driver.close();
       
        // exit the program explicitly
        //System.exit(0);
    }

}