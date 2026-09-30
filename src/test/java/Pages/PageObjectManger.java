package Pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManger {

  private  WebDriver driver;
  private  OrangeHrmLoginPage loginPage;
  private   OrgangeHrmDashboardPage dashboardPage;


    public PageObjectManger(WebDriver driver)
    {
        this.driver=driver;
    }

    public OrangeHrmLoginPage getLoginPage()
    {
        if(loginPage==null)
        {
            loginPage=new OrangeHrmLoginPage(driver);
        }
        return  loginPage;
    }

    public OrgangeHrmDashboardPage getDashboardPage()
    {
        if(dashboardPage==null)
        {
            dashboardPage=new OrgangeHrmDashboardPage(driver);
        }
        return  dashboardPage;
    }
}
