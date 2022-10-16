package com.cydeo.step_definitions;

import com.cydeo.pages.WebOrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDefinition {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    WebOrderPage webOrderPage= new WebOrderPage();



    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        webTableLoginPage.inputUsername.sendKeys("Test");
        webTableLoginPage.inputPassword.sendKeys("Tester");
        webTableLoginPage.loginButton.click();
        webOrderPage.orderButton.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {


        Select select = new Select(webOrderPage.productDropdown);
        select.selectByVisibleText(string);
    }


    @When("user enters quantity {int}")
    public void user_enters_quantity(int number) {
        webOrderPage.quantity.sendKeys(Keys.BACK_SPACE);
        webOrderPage.quantity.sendKeys(number+"");
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        webOrderPage.name.sendKeys(string);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        webOrderPage.street.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        webOrderPage.city.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        webOrderPage.state.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        webOrderPage.state.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
        BrowserUtils.clickRadioButton(webOrderPage.cardType,string);
        /*

         */
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
       webOrderPage.cardNo.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        webOrderPage.cardExp.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webOrderPage.precessButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        Assert.assertEquals("not equal",string,webOrderPage.firstRaw.getText());
    }



}
