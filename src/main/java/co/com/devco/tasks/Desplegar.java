package co.com.devco.tasks;

import co.com.devco.userinterfaces.PetbookDir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Desplegar implements Task
{
    public static Desplegar imagen() {

        return Tasks.instrumented(Desplegar.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PetbookDir.IMAGENPERRO));
    }
}
