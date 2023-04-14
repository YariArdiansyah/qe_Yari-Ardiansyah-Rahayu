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
public class SepulsaStepDefinitions extends UIInteractions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Given("user on sepulsa home page")
    public void userOnSepulsaHomePage() {
        driver.navigate().to("https://www.sepulsa.com/");
        driver.getTitle().equals("Sepulsa Mobile | Isi Ulang Pulsa Secara Online Cepat dan Terpercaya ");
    }

    @And("user click on masuk button")
    public void userClickOnMasukButton() {
        WebElement masukbutton = driver.findElement(By.id("button_signin_home"));
        masukbutton.click();
    }

    @When("user input corrected credentials")
    public void userInputCorrectedCredentials() {
        WebElement usernameField = driver.findElement(By.id("email"));
        usernameField.sendKeys("081914062710");
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys("bravosix");
    }

    @And("user click on masuk button at login page")
    public void userClickOnMasukButtonAtLoginPage() {
        WebElement masukloginbutton = driver.findElement(By.id("submit_login"));
        masukloginbutton.click();
    }

    @Then("user should go to sepulsa homepage")
    public void userShouldGoToSepulsaHomepage() {
        driver.getTitle().equals("Sepulsa Mobile | Isi Ulang Pulsa Secara Online Cepat dan Terpercaya ");
    }

    @Given("user on sepulsa homepage")
    public void userOnSepulsaHomepage() {
        driver.getTitle().equals("Sepulsa Mobile | Isi Ulang Pulsa Secara Online Cepat dan Terpercaya ");
    }

    @And("user click on akun button")
    public void userClickOnAkunButton() {
        WebElement akunbutton = driver.findElement(By.id("button_profile"));
        akunbutton.click();
    }

    @And("user click on keluar button")
    public void userClickOnKeluarButton() {
        WebElement keluarbutton = driver.findElement(By.id("button_signout"));
        keluarbutton.click();
    }

    @Then("user should go to sepulsa login page")
    public void userShouldGoToSepulsaLoginPage() {
        driver.getTitle().equals("Sepulsa Mobile | Isi Ulang Pulsa Secara Online Cepat dan Terpercaya | Signin");
    }

    @Given("user on sepulsa login page")
    public void userOnSepulsaLoginPage() {
        driver.getTitle().equals("Sepulsa Mobile | Isi Ulang Pulsa Secara Online Cepat dan Terpercaya | Signin");
    }

    @And("user click on daftar button")
    public void userClickOnDaftarButton() {
        WebElement daftarbutton = driver.findElement(By.id("redirect_register"));
        daftarbutton.click();
    }

    @And("user input form register")
    public void userInputFormRegister() {
        driver.getTitle().equals("Sepulsa Mobile | Isi Ulang Pulsa Secara Online Cepat dan Terpercaya | Signup");
    }

    @And("user click on daftar button at register page")
    public void userClickOnDaftarButtonAtRegisterPage() {
        WebElement regdaftarbutton = driver.findElement(By.id("submit"));
        regdaftarbutton.click();
    }

    @Then("user should go to verification page")
    public void userShouldGoToVerificationPage() {
        driver.getTitle().equals("Sepulsa Mobile | Isi Ulang Pulsa Secara Online Cepat dan Terpercaya | Verify | [...email]");
    }
}
