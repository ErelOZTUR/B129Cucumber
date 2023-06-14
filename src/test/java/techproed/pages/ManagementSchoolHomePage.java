package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class ManagementSchoolHomePage {
    public ManagementSchoolHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement login;

    @FindBy(id="username")
    public WebElement username;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement accountlogin;
    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu;
    @FindBy(xpath = "(//*[@class='nav-link'])[10]")
    public WebElement studentmanagement;
    @FindBy(id = "advisorTeacherId")
    public WebElement teacherselectddm;

}
