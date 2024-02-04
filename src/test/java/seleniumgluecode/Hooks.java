package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browserManager.DriverManager;
import runner.browserManager.DriverManagerFactory;
import runner.browserManager.DriverType;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;

    @Before("@browser")
    public void setUp() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/test/resources/config.properties"));
        driverManager = DriverManagerFactory.getmanager(DriverType.CHROME);
        driver = driverManager.getDriver();

        /* _____________________________________________________________
        Ejemplo de Espera Implícita
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        _________________________________________________________________*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url_base"));
        driver.manage().window().maximize();
    }

    @After("@browser")
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
