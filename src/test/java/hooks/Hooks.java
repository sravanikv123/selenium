package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utills.BaseClass;
import utills.ConfigReader;

import java.io.ByteArrayInputStream;

public class Hooks extends BaseClass {



    @Before
    public void browserLaunch()
    {
        ConfigReader.loadConfig();
        browserConfig(ConfigReader.get("browser"));



    }

    @After
    public void closerBrowser(Scenario scenario)
    {
        if (scenario.isFailed() && driver != null)
        {
            byte[] screenshot = ((TakesScreenshot) driver) .getScreenshotAs(OutputType.BYTES);
            Allure.attachment( "Failure Screenshot", new ByteArrayInputStream(screenshot) );
        }


        if (driver != null) { driver.quit(); }
    }
}
