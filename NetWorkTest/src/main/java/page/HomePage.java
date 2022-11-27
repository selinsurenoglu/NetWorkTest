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
            System.out.println("Network sayfas�ndas�n�z");
        }
        else{
            System.out.println("Sayfay� kontrol ediniz");
        }
    }

    By checkPage=By.xpath("//a[@class='current' and contains(text(),'2')]");
    public void checkPageNumberTwo(){
        if (driver.findElement(checkPage).isEnabled() == true){
            System.out.println("2.sayfadas�n�z");
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
            Log4j.info("Sepetteki �r�nlerin say�s� 2 tanedir");
            System.out.println("Sepetteki �r�nlerin say�s� 2 tanedir");
        }
        else{
            System.out.println("�r�n say�s� eksik");
        }
    }

    By mouseHoverCart = By.xpath("//a[@class='dIB']");
    public void hoverCartMouse(){
        actionsPerform(mouseHoverCart);
    }

}
