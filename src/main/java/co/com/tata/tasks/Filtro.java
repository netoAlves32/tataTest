package co.com.tata.tasks;

import co.com.tata.userinterfaces.PetbookDir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Filtro implements Task {

    private String filtro;

    public Filtro(String filtro) {

        this.filtro = filtro;
    }

    public static Performable ver(String filtro) {

        return Tasks.instrumented(Filtro.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(filtro == "perro") {
            actor.attemptsTo(Click.on(PetbookDir.PERROBTN));
        }else
            if(filtro == "gato"){
            actor.attemptsTo(Click.on(PetbookDir.GATOBTN));
        }

    }
}
