package co.com.tata.stepdefinitions;

import co.com.tata.tasks.OpenUp;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegistrerUserStepDefinition {

    @Given("^than Luz wants be a user of the web page$")
    public void thanLuzWantsBeAUserOfTheWebPage() {
        OnStage.theActorCalled("Luz").wasAbleTo(OpenUp.thePage());
        throw new PendingException();
    }

    @When("^Luz Diligence the differents registration forms on demoblaze web page$")
    public void LuzDiligenceTheDifferentsRegistrationFormsOnDemoblazeWebPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligencePerson.onTheForm(), DiligenceAdress.onTheForm(), DiligenceDevices.onTheForm(), DiligencePassword.onTheForm());
        throw new PendingException();
    }

    @Then("^Luz is successfully registered on the demoblaze platform$")
    public void LuzIsSuccessfullyRegisteredOnTheDemoblazePlatform() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
