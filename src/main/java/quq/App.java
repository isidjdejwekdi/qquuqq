package quq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, AWTException {
        Boolean tf=false;
        System.setProperty("webdriver.chrome.driver",
                         "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ozon.ru/");
        WebElement kat = driver.findElement(By.xpath("//button[@value='Каталог']"));
        //WebElement picTab = driver.findElement(By.linkText("Каталог"));
        kat.click();
        Thread.sleep(1000);
        WebElement books = driver.findElement(By.xpath("//span[contains(text(),'Книги')]"));
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(books).build().perform();

        WebElement tech = driver.findElement(By.linkText("Компьютерные технологии"));
        tech.click();
        Thread.sleep(1000);

       WebElement check1 = driver.findElement(By.xpath("//span[text() ='Бестселлеры']"));
       check1.click();
       Thread.sleep(1500);
       WebElement check2 = driver.findElement(By.xpath("//div[@class='items']//span"));
       check2.click();
       Thread.sleep(1500);

       WebElement fuc = driver.findElement(By.xpath("//button[@aria-label='Закрыть сообщение']"));
       fuc.click();
       Thread.sleep(1500);

       //WebElement but = driver.findElement(By.xpath("//div[@data-index='1']//button[@class='buy-text-button ui-l ui-l9 ui-l4 ui-l1 ui-a ui-a4']"));
       WebElement busk = driver.findElement(By.xpath("//div[@data-index='1']//span[text()='В корзину']"));

       Thread.sleep(1500);
       //tf=busk.isDisplayed();
       //System.out.println(tf);
       busk.click();
       Thread.sleep(1500);
       WebElement proverka = driver.findElement(By.xpath("//div[@class='count-button-wrap']"));
       tf=proverka.isDisplayed();
       //Thread.sleep(1500);
       //WebElement busk2 = driver.findElement(By.xpath("//div[@data-index='2']//span[text()='В корзину']"));
       System.out.println(tf);

       WebElement cart = driver.findElement(By.xpath("//a[@href='/cart']"));
       cart.click();




    }
}
