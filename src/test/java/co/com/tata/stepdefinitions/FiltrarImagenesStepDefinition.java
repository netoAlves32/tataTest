package co.com.tata.stepdefinitions;

import co.com.tata.questions.Imagenes;
import co.com.tata.tasks.Abriendo;
import co.com.tata.tasks.Filtrar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarImagenesStepDefinition {

    @Before
    public void prepareTests() {
        OnStage.setTheStage(new OnlineCast());

    }

    @Dado("^Usuario despliega pagina web$")
    public void usuarioDespliegaPaginaWeb() {

        OnStage.theActorCalled("Usuario").wasAbleTo(Abriendo.home());
    }


    @Cuando("^(.*) filtra por (.*) en petbook$")
    public void usuarioFiltraPorAlgoEnPetbook(String actor, String algo) {
        theActorCalled(actor).attemptsTo(Filtrar.por(algo));
    }

    @Entonces("^debe ver solo fotos de (.*)")
    public void debeVerSoloFotosDeAlgo(String algo) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Imagenes.son(algo)));
    }

}
