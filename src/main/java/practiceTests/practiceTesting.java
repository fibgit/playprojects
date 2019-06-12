package practiceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class practiceTesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\boma.fiberesima\\Downloads\\chromedriver\\ChromeDriver.exe");

        // Instantiate drivers
        ChromeDriver driver = new ChromeDriver();

        //Get to the test page
        driver.get("http://localhost:4567/alert.html");

        Thread.sleep(2000);

        WebElement clickBox = driver.findElement(By.id("alertexamples"));

        clickBox.click();


        Thread.sleep(2000);


    }

}

