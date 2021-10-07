package co.com.tata.stepdefinitions;

import co.com.tata.tasks.Complete;
import co.com.tata.tasks.DiligenceData;
import co.com.tata.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginUserStepDefinition {

    @Given("^than Luz wants login on the web page$")
    public void than_Luz_wants_login_on_the_web_page() {
        theActorCalled("Luz").wasAbleTo(OpenUp.thePage());
    }

    @When("^(.*)Diligence the form on demoblaze web page$")
    public void luz_Diligence_the_form_on_demoblaze_web_page(String actor) {
        theActorCalled(actor).attemptsTo(DiligenceData.onTheForm());
    }

    @Then("^(.*) have a successfully login on the demoblaze platform$")
    public void luz_have_a_successfully_login_on_the_demoblaze_platform(String actor) {
        theActorCalled(actor).attemptsTo(Complete.theRegister());
    }
}
