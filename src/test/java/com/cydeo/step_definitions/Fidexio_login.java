package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Fidexio_login {

    FidexioPage fidexioPage = new FidexioPage();

    @When("user goes to the fidexio login page")
    public void user_goes_to_the_fidexio_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Then("user lands the login page")
    public void user_lands_the_login_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Best"));
    }

/*
    @When("user enter posmanager username")
    public void user_enter_posmanager_username() {

        fidexioPage.username.sendKeys(ConfigurationReader.getProperty("pu"));


    }

 */

    @When("user enter posmanager pwssword")
    public void user_enter_posmanager_pwssword() {
        fidexioPage.password.sendKeys(ConfigurationReader.getProperty("pp"));

    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        fidexioPage.button.click();
    }

    @Then("user should see posmanager dashboard")
    public void user_should_see_posmanager_dashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Odoo"));

    }

    @When("user enter salemanager username")
    public void user_enter_salemanager_username() {
        fidexioPage.username.sendKeys(ConfigurationReader.getProperty("su"));
    }

    @When("user enter salemanager pwssword")
    public void user_enter_salemanager_pwssword() {
        fidexioPage.password.sendKeys(ConfigurationReader.getProperty("sp"));
    }

    @Then("user should see salemanager dashboard")
    public void user_should_see_salemanager_dashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Odoo"));
    }


    @When("user enter posmanager username")
    public void userEnterPosmanagerUsername() {
        fidexioPage.username.sendKeys(ConfigurationReader.getProperty("pu"));
    }
}
