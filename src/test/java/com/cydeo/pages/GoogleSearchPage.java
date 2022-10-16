package com.cydeo.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class GoogleSearchPage {

    //create constructor
    // initialize the driver instance and this class' instance using PageFactory.initElements
    public GoogleSearchPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
    }

    //We can start locating web elements using @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;

//    public WebElement capitalElement(String capital){
//        return Driver.getDriver().findElement(By.linkText(capital));
//    }

    public String getCapital(){
        return com.cydeo.utilities.Driver.getDriver().findElement(By.xpath("//a[@class='FLP8od']")).getText();
    }

    @FindBy (xpath = "//div[.='Accept all']")
    public WebElement popUp;

}