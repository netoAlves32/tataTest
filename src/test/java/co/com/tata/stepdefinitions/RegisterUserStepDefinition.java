package co.com.tata.stepdefinitions;

import co.com.tata.tasks.Complete;
import co.com.tata.tasks.DiligenceData;
import co.com.tata.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegisterUserStepDefinition {

    @Given("^than Luz wants be a user on the web page$")
    public void than_Luz_wants_be_a_user_on_the_web_page() {
        theActorCalled("Luz").wasAbleTo(OpenUp.thePage());
    }

    @When("^(.*) Diligence the differents registration forms on demoblaze web page$")
    public void luz_Diligence_the_differents_registration_forms_on_demoblaze_web_page(String actor) {
        theActorCalled(actor).attemptsTo(DiligenceData.onTheForm());
    }

    @Then("^(.*) is successfully registered on the demoblaze platform$")
    public void luz_is_successfully_registered_on_the_demoblaze_platform(String actor) {
        theActorCalled(actor).attemptsTo(Complete.theRegister());
    }
}
