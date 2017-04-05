package ohtu;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Tester {
    

    public static void main(String[] args) {
        File pathBinary = new File("/home/mlyra/firefox28Driver/firefox/firefox");
        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
        //WebDriver driver = new HtmlUnitDriver();
        

        driver.get("http://localhost:4567");
        
        sleep(2);
        
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("Henkka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("salasana1");
        element = driver.findElement(By.name("signup"));
        
        sleep(2);
        element.submit();

        sleep(3);
        
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        sleep(3);
        
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
