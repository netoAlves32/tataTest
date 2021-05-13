package co.com.devco.stepdefinitions;

import co.com.devco.tasks.Abriendo;
import co.com.devco.tasks.Abrir;
import co.com.devco.tasks.Desplegar;
import co.com.devco.tasks.Filtro;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class ConsultarPerroStepDefinition {

    @Dado("^Usuario abre pagina web$")
    public void usuarioAbrePaginaWeb() {

        OnStage.theActorCalled("Usuario").wasAbleTo(Abriendo.home());
    }


    @Cuando("^Usuario quiera ver un perro$")
    public void usuarioQuieraVerUnPerro() {
        OnStage.theActorInTheSpotlight().attemptsTo(Filtro.ver("perro"));
    }


    @Entonces("^se debe desplegar la imagen del perro$")
    public void desplegarImagenPerro() {
        OnStage.theActorInTheSpotlight().attemptsTo(Desplegar.imagen());
    }
}