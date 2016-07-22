package selenium_online_forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://1602.moveon4.com/locallogin/54086fd30f9d30ba7b000000/eng";

        
        //String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        // Enter login
        driver.findElement(By.name("label_email")).sendKeys("gaetan.broutin1@yopmail.com");
        driver.findElement(By.name("label_password")).sendKeys("gaetan.broutin1@yopmail.com");
        driver.findElement(By.name("label_password")).submit();

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