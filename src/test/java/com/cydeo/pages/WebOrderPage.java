package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebOrderPage {
    public WebOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;

    @FindBy(name = "product")
    public WebElement productDropdown;


    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zip;

    @FindBy(name = "card")
    public List<WebElement> cardType;


    @FindBy(name = "cardNo")
    public WebElement cardNo;


    @FindBy(name = "cardExp")
    public WebElement cardExp;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement precessButton;

    @FindBy(xpath = "//table[@class='table is-fullwidth']//td")
    public WebElement firstRaw;


}
