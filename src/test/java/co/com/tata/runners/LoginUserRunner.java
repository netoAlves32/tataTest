package co.com.tata.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/userLogin.feature",
        tags = {"@challenges"},
        glue = {"co.com.tata.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
        )

public class LoginUserRunner {

}
