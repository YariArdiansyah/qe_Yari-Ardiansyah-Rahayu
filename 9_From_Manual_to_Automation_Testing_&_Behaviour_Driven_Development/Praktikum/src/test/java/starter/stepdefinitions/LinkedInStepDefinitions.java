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

import javax.swing.*;

public class LinkedInStepDefinitions extends UIInteractions {

    @Managed(driver = "chrome")
    WebDriver driver;


    @Given("user is on landing page")
    public void userIsOnLandingPage() {
        driver.navigate().to("https://linkedin.com");
        driver.getTitle().equals("LinkedIn: Log In or Sign Up");
    }

    @And("user input correct username")
    public void userInputCorrectUsername() {
        WebElement usernameField = driver.findElement(By.id("session_key"));
        usernameField.sendKeys("2006017@itg.ac.id");
    }

    @And("user input correct password")
    public void userInputCorrectPassword() {
        WebElement usernameField = driver.findElement(By.id("session_password"));
        usernameField.sendKeys("ardiansyah2608");
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        driver.navigate().to("https://www.linkedin.com/feed/?trk=homepage-basic_google-one-tap-submit");
        driver.getTitle().equals("Feed | LinkedIn");
    }

    @And("user click login")
    public void userClickLogin() {
        WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonLogin.click();
    }

    @And("user input post")
    public void userInputPost() {
        WebElement postTestArea =driver.findElement(By.id("ember214"));
        postTestArea.click();
    }

    @And("user input text in post field section")
    public void userInputTextInPostFieldSection() {
        WebElement postTestArea =driver.findElement(By.xpath("//p[contains(text())]"));
        postTestArea.sendKeys("TESTIING YARI AR");
    }

    @And("user click send post")
    public void userClickSendPost() {
        WebElement buttonSend = driver.findElement(By.id("ember228"));
        buttonSend.click();
    }

    @Then("user see their post in their feed")
    public void userSeeTheirPostInTheirFeed() {
        driver.navigate().to("https://www.linkedin.com/feed/?trk=homepage-basic_google-one-tap-submit");
        driver.getTitle().equals("Feed | LinkedIn");
    }

    @And("user input in the text box {string}")
    public void userInputInTheTextBoxHelloYari() {
        WebElement postTestArea =driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
        postTestArea.sendKeys("Hello Yari");
    }

    @Then("user see their post in their feed with tagged connection")
    public void userSeeTheirPostInTheirFeedWithTaggedConnection() {
        driver.navigate().to("https://www.linkedin.com/feed/?trk=homepage-basic_google-one-tap-submit");
        driver.getTitle().equals("Feed | LinkedIn");
    }

    @Then("user see their post in their feed with hashtags")
    public void userSeeTheirPostInTheirFeedWithHashtags() {
        driver.navigate().to("https://www.linkedin.com/feed/?trk=homepage-basic_google-one-tap-submit");
        driver.getTitle().equals("Feed | LinkedIn");
    }

    @And("user dont input any text on post field")
    public void userDontInputAnyTextOnPostField() {
        WebElement postField = driver.findElement(By.xpath("div class=\"ql-editor ql-blank\" data-gramm=\"false\" data-placeholder=\"What do you want to talk about?\" aria-placeholder=\"What do you want to talk about?\" aria-label=\"Text editor for creating content\" role=\"textbox\" aria-multiline=\"true\" data-test-ql-editor-contenteditable=\"true\" xpath=\"1\" contenteditable=\"true\"></div>"));
        postField.click();
        postField.sendKeys(Keys.ENTER);
    }

    @And("user click post button")
    public void userClickPostButton() {
        WebElement buttonSend = driver.findElement(By.id("ember228"));
        buttonSend.click();
    }

    @Then("user see error message")
    public void userSeeErrorMessage() {
        WebElement errorMessage = driver.findElement(By.className("error-message"));
        String actualMessage = errorMessage.getText();
        String expectedMessage = "Please enter text to post";
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("user input that exceeds character limit")
    public void userInputThatExceedsCharacterLimit() {
        String longText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nec faucibus magna. Proin a dolor quis est aliquet mollis vel non erat. Quisque vel sollicitudin velit. Donec condimentum lacinia ante, in bibendum lacus tincidunt quis. Ut aliquam volutpat metus, euismod placerat mauris eleifend et. Nunc varius sagittis libero vel feugiat. Fusce malesuada lectus vitae tortor vestibulum, non ullamcorper ex porttitor. Donec posuere mi sed sapien interdum, in cursus nisl scelerisque. Nulla faucibus nisl at lectus finibus ultricies. Pellentesque luctus velit quis eros viverra, sed ultricies risus lobortis. Cras laoreet euismod elit. Sed dignissim nisl id erat dignissim, eu accumsan risus fermentum.";
        WebElement postInput = driver.findElement(By.xpath("//div[@class='comments-comment-box-comment__text-editor']"));
        postInput.sendKeys(longText);
    }

    @And("user click post")
    public void userClickPost() {
        WebElement buttonSend = driver.findElement(By.id("ember228"));
        buttonSend.click();
    }

    @And("user input comment on comment field")
    public void userInputCommentOnCommentField() {
        WebElement commentArea =driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']//p"));
        commentArea.sendKeys("TESTIING YARI AR");
    }

    @And("user click send")
    public void userClickSend() {
        WebElement buttonSend = driver.findElement(By.id("ember228"));
        buttonSend.click();
    }

    @Then("user see their comment in the commend section below post")
    public void userSeeTheirCommentInTheCommendSectionBelowPost() {
        WebElement commentSection = driver.findElement(By.className("comments-comment-box-comment__text-editor"));
        WebElement userComment = commentSection.findElement(By.xpath("//article[@id='ember365']//div[contains(@class,'comments-comment-item-content-body break-words')]//div//div[contains(@class,'comments-comment-item__inline-show-more-text')]//span[contains(@class,'comments-comment-item__main-content feed-shared-main-content--comment t-14 t-black t-normal')]//div[contains(@class,'update-components-text relative')]"));
        Assert.assertTrue(userComment.isDisplayed());
    }

    @And("user click and push scroll button")
    public void userClickAndPushScrollButton() {
        WebElement scrollButton = driver.findElement(By.xpath("//section[contains(@class,'scrollable msg-overlay-list-bubble__content msg-overlay-list-bubble__content--scrollable')]"));
    scrollButton.click();
    }

    @And("user drag scroll button")
    public void userDragScrollButton() {
        WebElement scrollButton = driver.findElement(By.xpath("//section[contains(@class,'scrollable msg-overlay-list-bubble__content msg-overlay-list-bubble__content--scrollable')]"));
        scrollButton.click();
    }

    @Then("user see other people feed")
    public void userSeeOtherPeopleFeed() {
        driver.navigate().to("https://www.linkedin.com/feed/?trk=homepage-basic_google-one-tap-submit");
        driver.getTitle().equals("Feed | LinkedIn");
    }
}