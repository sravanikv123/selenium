package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgangeHrmDashboardPage {

    WebDriver driver;


    public OrgangeHrmDashboardPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    private WebElement dashboard;

    public WebElement getPim() {
        return pim;
    }

    @FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[1]")
    private WebElement admin;

    @FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[2]")
    private WebElement pim;

    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    private WebElement adminText;

    public WebElement getAdminText() {
        return adminText;
    }

    public WebElement getAdmin() {
        return admin;
    }

    public WebElement getDashboard() {
        return dashboard;
    }


}
