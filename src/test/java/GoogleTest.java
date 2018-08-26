import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void userCanSearch() {
        open("https://google.com/");
        new GooglePage().searchFor("Java");

        SearchResultPage results = new SearchResultPage();
        results.getResult(0).shouldHave(text("Что такое автоматическое обновление Java?"));
        // original results.getResult(0).shouldHave(text("Computer programming language"));
    }

    @Test
    public void testApp() {
        App app = new App();
        app.logMessages();
    }
}
