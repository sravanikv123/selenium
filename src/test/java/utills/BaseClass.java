package utills;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public void browserConfig(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();
        String implicitwait = ConfigReader.get("implicitwait");
        long l = Long.parseLong(implicitwait);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(l));
    }


    public void sendValues(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void tap(WebElement element) {
        element.click();
    }

    public void screenShots(String Filename) {
        try {
            TakesScreenshot tk = (TakesScreenshot) driver;
            File src = tk.getScreenshotAs(OutputType.FILE);
            File trg = new File("D:\\Thillai\\Studies\\Games\\" + Filename);
            FileHandler.copy(src, trg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void attachScreenshot(String screenshotName) {

        byte[] screenshot =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);

        Allure.attachment(screenshotName, new ByteArrayInputStream(screenshot));


    }
}