package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void click(By element) throws Exception{
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear");
        }
    }
    public void click(WebElement element) throws Exception{
        try {
            element.click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear");
        }
    }

    public boolean isDisplayed(By element) throws Exception{
        try {
         return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar");
        }
    }
    public boolean isDisplayed(WebElement element) throws Exception{
        try {
            return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar");
        }
    }

    public String getText(By element) throws Exception{
        try {
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener Texto");
        }
    }
    public String getText(WebElement element) throws Exception{
        try {
           return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener Texto");
        }
    }
    public String getTitle() throws Exception{
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el Titulo");
        }
    }
}
