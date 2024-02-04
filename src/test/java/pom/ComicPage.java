package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicPage extends BasePage{

    @FindBy(className = "wp-block-query-title")
    private WebElement pageTitleLocator;
    private String titlepage = "Category: comics";


    public ComicPage(WebDriver driver) {
        super(driver);
    }
    public boolean isTitleComicsDisplayed() throws Exception{
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlepage);
    }
}
