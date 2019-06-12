package practiceTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class autoCompleteTests {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\boma.fiberesima\\Downloads\\chromedriver\\ChromeDriver.exe");

        WebDriver driver = new ChromeDriver();

        //Navigate to the Login page of the organisation
        driver.get("https://www.register.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        //Find the login tab on the page
        WebElement clickLoginTab = driver.findElement(By.id("log-in"));
        Thread.sleep(1000);

        //Click the login tab
        clickLoginTab.click();

        //Find the dropdown button on the page
        WebElement dropDownButton = driver.findElement(By.className("selectButton"));

        //Click the dropdown
        dropDownButton.click();
        Thread.sleep(3000);

        driver.close();
    }

}
