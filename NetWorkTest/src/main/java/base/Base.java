package base;

import log.Log4j;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    protected WebDriver driver;

    @Before
    public void setup(){
        setProperty();
        driver = new ChromeDriver();
        driver.get("https://www.network.com.tr/");
        Log4j.startLog("NetworkTest");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        Log4j.endLog("NetworkTest");
        driver.quit();
    }


    public static void setProperty(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
    }
}
