package co.com.tata.stepdefinitions;

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

    @When("^she Diligence the differents registration forms on demoblaze web page$")
    public void sheDiligenceTheDifferentsRegistrationFormsOnDemoblazeWebPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^she is successfully registered on the demoblaze platform$")
    public void sheIsSuccessfullyRegisteredOnTheDemoblazePlatform() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
