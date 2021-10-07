package co.com.tata.tasks;

import co.com.tata.userinterfaces.PetbookDir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Abrir implements Task {

    public static Abrir imagen() {

        return Tasks.instrumented(Abrir.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(PetbookDir.IMAGENGATO));
    }
}
