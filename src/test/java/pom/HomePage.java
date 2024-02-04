package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(partialLinkText = "The Little Tester comics")
    private WebElement titleComicNotCached;
    @FindBy(partialLinkText = "The Little Tester comics")
    @CacheLookup
    private WebElement titleComic;
    private String titleHomepage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageIsDisplayed () throws Exception {
        return  this.getTitle().equals(titleHomepage);
    }
    public void clickOnTitleComics() throws Exception{
        this.click(titleComic);
    }
}
