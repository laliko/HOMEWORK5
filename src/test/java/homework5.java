import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selectors.*;

public class homework5 {
    @Test
    public void homeWork5() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;


        Selenide.open("https://www.facebook.com//");
        $("._6ltg",1).click();
        $(byName("firstname")).sendKeys("სახელი");
        $(byName("lastname")).sendKeys("gvari");
        $(byName("reg_email__")).setValue("555123456");
        $("#password_step_input").sendKeys("password123");
        $("#month").selectOption("Jan");
        $("#day").selectOption("6");
        $("#year").selectOption("1992");
        $("._58mt", 2).click();
        $(byName("preferred_pronoun")).selectOption("She: \"Wish her a happy birthday!\"");
        $("._58mt", 0).click();
        sleep(5000);


    }
}
