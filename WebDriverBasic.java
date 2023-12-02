package seleniumleraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class WebDriverBasic {
    public static void main(String[] args) {

        // 2. set up the chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver-win64\\chromedriver.exe");
// 1. create a instance of web driver
        WebDriver driver = new ChromeDriver();
        // 3. Navigate to the webpage
        driver.get("https://demo.nopcommerce.com/");
      //   4. Get page Title
      //  i
        String PageTitle = driver.getTitle();
        System.out.println("Page Title is;"+PageTitle);
       // ii
        System.out.println("Page Title is;"+ driver.getTitle());
        // 5. expected vs actual - validation
        String ExpectedPageTitle = "nopcommerce demo store";
        if (ExpectedPageTitle.equals(driver.getTitle())){
            System.out.println("pageTitle  is correct");
        }else{
            System.out.println("pageTilte is incorrect");
        }
        // 6. navigation
        driver.findElement(By.className("ico-login")).click();
        // 7. navigate back
        driver.navigate().back();
        // 8. navigate Forward
        driver.navigate().forward();
        // 9. refresh
        driver.navigate().refresh();
        //10. maximize the window
        driver.manage().window().maximize();
        // 11.get current url
        System.out.println("current url is:"+driver.getCurrentUrl());
        // 12. close or quit the window
        driver.close(); // current tab
        driver.quit(); // all tab
    }
}
