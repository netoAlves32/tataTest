package co.com.tata.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registerUser.feature",
        glue = {"co.com.tata.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
        )

public class RegisterUser {

}
