package page;

import log.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageCartEmpty extends  BasePage{
    public HomePageCartEmpty(WebDriver driver) {
        super(driver);
    }

    By checkCArtControl = By.xpath("//p[contains(text(),'Sepetinizde �r�n bulunmamaktad�r')]");

    public void checkCartEmpty(){
        assertEquals(checkCArtControl);
        if (driver.findElement(checkCArtControl).isEnabled() == true){
            Log4j.info("Sepette �r�n yok");
            System.out.println("Sepette �r�n yok");
        }
        else{
            System.out.println("Sepette �r�n bulunmaktad�r");
        }
    }
}
