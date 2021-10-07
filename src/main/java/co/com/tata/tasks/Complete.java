package co.com.tata.tasks;


import co.com.tata.userinterfaces.CompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Complete implements Task {
    public static Complete theRegister() {
        return Tasks.instrumented(Complete.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompletePage.COMPLETE_BUTTON)
        );

    }
}
