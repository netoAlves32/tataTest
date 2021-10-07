package co.com.tata.stepdefinitions;


import co.com.tata.tasks.Abrir;
import co.com.tata.tasks.Abriendo;
import co.com.tata.tasks.Filtro;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ConsultarGatoStepDefinition {



    @Dado("^Usuario abre la pagina web$")
    public void usuarioAbreLaPaginaWeb() {

        OnStage.theActorCalled("Usuario").wasAbleTo(Abriendo.home());
    }


    @Cuando("^Usuario quiera ver un gato$")
    public void usuarioQuieraVerUnGato() {
        OnStage.theActorInTheSpotlight().attemptsTo(Filtro.ver("gato"));
    }


    @Entonces("^se debe abrir la imagen del gato$")
    public void abrirImagenGato() {
        OnStage.theActorInTheSpotlight().attemptsTo(Abrir.imagen());
    }
}