package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import utills.BaseClass;

import static StepDefinitions.OrangeHrmLogin.pom;

public class OrangeHrmDashBoard extends BaseClass {



    @When("click the admin tab")
    public void click_the_admin_tab() {
       tap(pom.getDashboardPage().getAdmin());
    }

    @When("click the pim tab")
    public void click_the_pim_tab() {
        tap(pom.getDashboardPage().getPim());
    }

    @Then("validate the admin scenario")
    public void validate_the_admin_scenario() {
        String text = pom.getDashboardPage().getAdminText().getText();
        Assertions.assertEquals("Admin\n" +
                "User Management", text);
    }
}
