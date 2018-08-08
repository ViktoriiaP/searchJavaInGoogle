import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void userCanSearch() {
        open("https://google.com/ncr");
        new GooglePage().searchFor("Java");

        SearchResultPage results = new SearchResultPage();
        results.getResult(0).shouldHave(text("Java: Computer programming language"));
    }
}
