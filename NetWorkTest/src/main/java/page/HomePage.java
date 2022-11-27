package page;

import log.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);

    }

    By pageLoad = By.xpath("//a[contains(@href, 'network')]");
    public void pageLoadAssert(){
        if (driver.findElement(pageLoad).isEnabled() ==true){
            assertEquals(pageLoad);
            System.out.println("Network sayfasýndasýnýz");
        }
        else{
            System.out.println("Sayfayý kontrol ediniz");
        }
    }

    By checkPage=By.xpath("//a[@class='current' and contains(text(),'2')]");
    public void checkPageNumberTwo(){
        if (driver.findElement(checkPage).isEnabled() == true){
            System.out.println("2.sayfadasýnýz");
            assertEquals(checkPage);
        }
        else {
            System.out.println("Sistemi kontrol ediniz");
        }
    }

    By checkCartPiece = By.xpath("//a[@class='current' and contains(text(),'2')]");
    public void cartProductPiece(){
        assertEquals(checkCartPiece);
        if(driver.findElement(checkCartPiece).isEnabled() == true){
            Log4j.info("Sepetteki ürünlerin sayýsý 2 tanedir");
            System.out.println("Sepetteki ürünlerin sayýsý 2 tanedir");
        }
        else{
            System.out.println("Ürün sayýsý eksik");
        }
    }

    By mouseHoverCart = By.xpath("//a[@class='dIB']");
    public void hoverCartMouse(){
        actionsPerform(mouseHoverCart);
    }

}
