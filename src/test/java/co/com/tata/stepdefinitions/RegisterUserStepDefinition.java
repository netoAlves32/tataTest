package co.com.tata.stepdefinitions;

import co.com.tata.tasks.DiligenceData;
import co.com.tata.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegisterUserStepDefinition {

    @Given("^than Luz wants be a user of the web page$")
    public void thanLuzWantsBeAUserOfTheWebPage() {
        OnStage.theActorCalled("Luz").wasAbleTo(OpenUp.thePage());
    }

    @When("^Luz Diligence the differents registration forms on demoblaze web page$")
    public void LuzDiligenceTheDifferentsRegistrationFormsOnDemoblazeWebPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenceData.onTheForm());
    }

    @Then("^Luz is successfully registered on the demoblaze platform$")
    public void LuzIsSuccessfullyRegisteredOnTheDemoblazePlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Complete.theRegister());
    }
}
