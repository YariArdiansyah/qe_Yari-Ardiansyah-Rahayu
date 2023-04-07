package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SepulsaStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://sepulsa.com");
        driver.getTitle().equals("Sepulsa Mobile | Isi Ulang Pulsa Secara Online Cepat dan Terpercaya ");
    }

    @And("user input incorrect username")
    public void userInputIncorrectUsername() {
        WebElement usernameField = driver.findElement(By.id("email"));
        usernameField.sendKeys("Incorrect Email");
    }

    @And("user input incorrect password")
    public void userInputIncorrectPassword() {
        WebElement usernameField = driver.findElement(By.id("password"));
        usernameField.sendKeys("Incorrect Password");
    }

    @And("user input click login")
    public void userInputClickLogin() {
        WebElement loginButton = driver.findElement(By.cssSelector("div:nth-child(1) div.App:nth-child(1) div.section.section-signin form.signup-form.mt-min-15px:nth-child(3) > div.signup-button:nth-child(3)"));
        loginButton.click();
    }

    @When("user click on Pulsa")
    public void userClickOnPulsaPaketData() {
        WebElement buttonPulsa = driver.findElement(By.id("Pulsa"));
        buttonPulsa.click();
    }

    @And("user choose provider {string}")
    public void userChooseProviderSimpati() {
        WebElement buttonSimpati = driver.findElement(By.id("product_type_0"));
        buttonSimpati.click();
    }

    @And("user choose credit amount {string}")
    public void userChooseCreditAmount() {
        WebElement button5ribu = driver.findElement(By.id("Telkomsel Rp5.000"));
        button5ribu.click();
    }

    @And("user click {string}")
    public void userClickBeli() {
        WebElement buttonBayar = driver.findElement(By.xpath("//span[contains(text(),'Bayar Sekarang')]"));
        buttonBayar.click();
    }

    @When("user choose product with credit amount")
    public void userChooseProductWithCreditAmount() {
        WebElement button10ribu = driver.findElement(By.id("Telkomsel Rp10.000"));
        button10ribu.click();
    }

    @And("user choose bank transfer method")
    public void userChooseBankTransferMethod() {
        WebElement buttonBank = driver.findElement(By.id("checkbox Kredivo"));
        buttonBank.click();
    }

    @Then("user click buy")
    public void userClickBuy() {
        WebElement buttonBayar = driver.findElement(By.xpath("//span[contains(text(),'Bayar Sekarang')]"));
        buttonBayar.click();
    }

    @And("user choose E-wallet method")
    public void userChooseEWalletMethod() {
        WebElement buttonGopay = driver.findElement(By.id("checkbox Gopay"));
        buttonGopay.click();
    }

    @When("user click on menu product")
    public void userClickOnMenuProduct() {
        WebElement buttonMenu = driver.findElement(By.id("Pulsa"));
        buttonMenu.click();
    }

    @And("user input phone number {string}")
    public void userInputPhoneNumber(int arg0) {
        WebElement nohp =driver.findElement(By.id("phone_number"));
        nohp.sendKeys("081914062710");
    }
}
