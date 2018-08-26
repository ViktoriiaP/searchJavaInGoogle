import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class StepDefinitions {
    private String word;


    @Given("an open browser with google.com")
    public void openGoogleSearch() {
        Configuration.browser = "chrome";//default Mozzila Firefox
        Configuration.startMaximized = false;
        Configuration.reportsFolder = "target/surefire-reports";
        open("https://google.com/");
    }

    @When("a word (.*) is entered in input field")
    public void enterWord(String word) {
        this.word = word;
        $(By.name("q")).val(word).pressEnter();
    }

    @Then("the first one should contain (.+)")
    public void theFirstOneShouldContainWord(String expectedText) {
       $$("word").findBy(text(expectedText));
    }
}