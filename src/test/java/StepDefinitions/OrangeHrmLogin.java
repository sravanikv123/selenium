package StepDefinitions;

import Pages.OrangeHrmLoginPage;
import Pages.OrgangeHrmDashboardPage;
import Pages.PageObjectManger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utills.BaseClass;
import utills.ConfigReader;

import static hooks.Hooks.driver;

public class OrangeHrmLogin extends BaseClass {


public   static  PageObjectManger pom;
       @Given("open the OrangeHRM login page")
    public void open_the_orange_hrm_login_page() {
           pom=new PageObjectManger(driver);
        driver.get(ConfigReader.get("url"));
      //  screenShots("loginpage.png");

           attachScreenshot("LoginPage");
    }
      @When("enter the {string} and {string}")
    public void enter_the_and(String user, String pass) {
        sendValues(pom.getLoginPage().getUsername(),user);
        sendValues(pom.getLoginPage().getPassword(),pass);
       // screenShots("cred.png");

          attachScreenshot("Cred Page");
    }


  @When("click the login button")
    public void click_the_login_button() {
        //driver.findElement(By.xpath("//*[text()=' Login ']")).click();
        //lp.getLogin().click();
        tap(pom.getLoginPage().getLogin());
       // screenShots("afterlogin.png");

      attachScreenshot("After Login");
    }
    @Then("validate the login scenario")
    public void validate_the_login_scenario() {
        String text = pom.getDashboardPage().getDashboard().getText();

        Assertions.assertEquals("Dashboard", text);
        //screenShots("dashboard.png");
  
        attachScreenshot("Dashboard page");
    }


}
