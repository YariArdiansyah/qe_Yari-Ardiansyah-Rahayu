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

public class SaucedemoStepDefinitions extends UIInteractions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Given("user on saucedemo login page")
    public void userOnSaucedemoLoginPage() {
        driver.navigate().to("https://www.saucedemo.com/");
        driver.getTitle().equals("Swag Labs");
    }

    @When("user input valid credentials")
    public void userInputValidCredentials() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys("secret_sauce");
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        WebElement loginbutton = driver.findElement(By.id("login-button"));
        loginbutton.click();
    }

    @Then("user should redirected to saucedemo homepage")
    public void userShouldRedirectedToSaucedemoHomepage() {
        driver.getTitle().equals("Products");
    }

    @Given("user on homepage")
    public void userOnHomepage() {
        driver.getTitle().equals("Products");
    }

    @And("user click on menu button")
    public void userClickOnMenuButton() {
        WebElement menubutton = driver.findElement(By.id("react-burger-menu-btn"));
        menubutton.click();
    }

    @And("user click on logout button")
    public void userClickOnLogoutButton() {
        WebElement logoutbutton = driver.findElement(By.id("logout_sidebar_link"));
        logoutbutton.click();
    }

    @Then("user should redirected to saucedemo login page")
    public void userShouldRedirectedToSaucedemoLoginPage() {
        driver.getTitle().equals("Swag Labs");
    }

    @And("user click on add cart")
    public void userClickOnAddCart() {
        WebElement addcartbutton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addcartbutton.click();
    }

    @And("user click on cart button")
    public void userClickOnCartButton() {
        WebElement cartbutton = driver.findElement(By.id("//a[@class='shopping_cart_link']"));
        cartbutton.click();
    }

    @Then("user should redirected to saucedemo cart page")
    public void userShouldRedirectedToSaucedemoCartPage() {
        driver.getTitle().equals("Your Cart");
    }


    @Given("user on saucedemo homepage")
    public void userOnSaucedemoHomepage() {
        driver.getTitle().equals("Products");
    }
}
