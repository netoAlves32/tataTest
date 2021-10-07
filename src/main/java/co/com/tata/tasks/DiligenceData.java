package co.com.tata.tasks;



import co.com.tata.userinterfaces.DemoBlazeRegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenceData implements Task {

    public static DiligenceData onTheForm() {
        return Tasks.instrumented(DiligenceData.class);
    }

    DemoBlazeRegisterUserPage dr;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(dr.JOIN_BUTTON),
                Enter.theValue("Luz").into(dr.INPUT_USER_NAME),
                Enter.theValue("12345").into(dr.INPUT_PASSWORD)
                );
    }
}
