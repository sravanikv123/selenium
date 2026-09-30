package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginPage {

      WebDriver driver;



    public OrangeHrmLoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[name=\"username\"]")
    private WebElement username;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[text()=' Login ']")
    private  WebElement login;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogin() {
        return login;
    }



}
