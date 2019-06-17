package practiceTests;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


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

        //Click the dropdown button on the page
        dropDownButton.click();
        Thread.sleep(3000);

        //Select Web Hosting Account from the Drop down list
        WebElement AccountMangerDropDown = driver.findElement(By.xpath("//a[text()=\"Web Hosting Account\"]"));

        // Click the Web hosting account from the drop down list
        AccountMangerDropDown.click();
        Thread.sleep(5000);

        //Scroll down to the bottom of the page and locate the "GOT IT" button to consent to the use of site cookies
        WebElement  gotItButton = driver.findElement(By.xpath("//button[@class=\"optanon-allow-all accept-cookies-button\"]"));
        Thread.sleep(4000);

        // click the "GOT IT" button to consent to use site cookies
        gotItButton.click();
        Thread.sleep(4000);

        //locate the "Partner with Register.com" paragraph
         WebElement paragraph = driver.findElement(By.xpath("//p[text()=\"Partner with Register.com\"]"));

        //Scroll action the page to bring the "Partner with Register.com" paragraph to view
         Actions action = new Actions(driver);
        action.moveToElement(paragraph);
        Thread.sleep(4000);

        //locate affiliate link with paragraph and click on the Affiliate link
        WebElement affiliate_link = driver.findElement(By.linkText("Become an Affiliate"));
        affiliate_link.click();
        Thread.sleep(4000);
        driver.close();
    }

}
