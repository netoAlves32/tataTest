package co.com.tata.tasks;

import co.com.tata.userinterfaces.PetbookHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abriendo implements Task {

    private PetbookHome petbookHome;
    public static Abriendo home() {

        return Tasks.instrumented(Abriendo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(petbookHome));

    }

}
