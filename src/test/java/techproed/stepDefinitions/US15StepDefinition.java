package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.ManagementSchoolHomePage;
import techproed.pages.ViceDeanStudentManagement;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US15StepDefinition {
    ManagementSchoolHomePage managementSchoolHomePage;
    ViceDeanStudentManagement vice;

    @Given("Kullanıcı _{string} sayfasina gider")
    public void kullanıcı_SayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }
    @When("Kullanıcı LOG IN e tıklar")
    public void kullanıcı_log_ın_e_tıklar() {
        managementSchoolHomePage =new ManagementSchoolHomePage();
        managementSchoolHomePage.login.click();

    }
    @When("Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer")
    public void kullanıcı_geçerli_vice_dean_olarak_user_name_ve_password_u_girer() {
        managementSchoolHomePage.username.sendKeys(ConfigReader.getProperty("username"),Keys.TAB,ConfigReader.getProperty("password"));
        managementSchoolHomePage.accountlogin.click();

    }
    @When("Kullanıcı menuden student management e tıklar")
    public void kullanıcı_menuden_student_management_e_tıklar() {
        managementSchoolHomePage.menu.click();
        ReusableMethods.click(managementSchoolHomePage.studentmanagement);


    }

    @Then("Kullanıcı istediği danışman öğretmeni seçer")
    public void kullanıcıIstediğiDanışmanÖğretmeniSeçer() {
        Select select=new Select(managementSchoolHomePage.teacherselectddm);
        select.selectByIndex(1);

    }


    @And("And Kullanıcı NAME İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void andKullanıcıNAMEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {

        vice=new ViceDeanStudentManagement();
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı name in altında Required yazısını görür.")
    public void kullanıcıNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.namerequired.isDisplayed());
    }

    @And("Kullanıcı SurNAME i boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıSurNAMEIBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.female.click();
        vice.submit.click();

    }

    @Then("Kullanıcı surname in altında Required yazısını görür.")
    public void kullanıcıSurnameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.surnamerequired.isDisplayed());
    }

    @And("Kullanıcı BIRTH PLACE İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıBIRTHPLACEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.female.click();
        vice.submit.click();

    }

    @Then("Kullanıcı Birth Place in altında Required yazısını görür.")
    public void kullanıcıBirthPlaceInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.birthplacerequired.isDisplayed());
    }

    @And("Kullanıcı E-mail İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıEMailİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();

    }

    @Then("Kullanıcı E-mail in altında Required yazısını görür.")
    public void kullanıcıEMailInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.emailrequired.isDisplayed());
    }

    @And("Kullanıcı Telefon numarası İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıTelefonNumarasıİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı Telefon numarası in altında Required yazısını görür.")
    public void kullanıcıTelefonNumarasıInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.phoneNumber.isDisplayed());
    }

    @And("Kullanıcı cinsiyet İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıCinsiyetİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.submit.click();
    }

    @Then("Kullanıcı You have entered an invalid value. Valid values are: MALE, FEMALE uyarısını görür")
    public void kullanıcıYouHaveEnteredAnInvalidValueValidValuesAreMALEFEMALEUyarısınıGörür() {
        Assert.assertTrue(vice.genderalert.isDisplayed());
    }

    @And("Kullanıcı Date Of Birth İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıDateOfBirthİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı Date Of Birth in altında Required yazısını görür.")
    public void kullanıcıDateOfBirthInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.dobrequired.isDisplayed());
    }

    @And("Kullanıcı User Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıUserNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();

    }

    @Then("Kullanıcı User Name in altında Required yazısını görür.")
    public void kullanıcıUserNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.usernamerequired.isDisplayed());
    }

    @And("Kullanıcı father name İ boş bırakıp NAME,surname,Birth Place,email,Date Of Birth,Ssn,User name,cinsiyet,mother name,geçerli password,Telefon numarası girdikten sonra submit e tıklar")
    public void kullanıcıFatherNameİBoşBırakıpNAMESurnameBirthPlaceEmailDateOfBirthSsnUserNameCinsiyetMotherNameGeçerliPasswordTelefonNumarasıGirdiktenSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı Father Name in altında Required yazısını görür.")
    public void kullanıcıFatherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.fathernamerequired.isDisplayed());
    }

    @And("Kullanıcı Mother Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıMotherNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice=new ViceDeanStudentManagement();
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();

    }

    @Then("Kullanıcı Mother Name in altında Required yazısını görür.")
    public void kullanıcıMotherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.mothernamerequired.isDisplayed());
    }
}
