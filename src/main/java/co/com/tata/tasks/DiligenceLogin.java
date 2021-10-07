package co.com.tata.tasks;



import co.com.tata.userinterfaces.DemoBlazeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenceLogin implements Task {

    public static DiligenceLogin onTheForm() {
        return Tasks.instrumented(DiligenceLogin.class);
    }

    DemoBlazeLoginPage dr;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(dr.JOIN_BUTTON),
                Enter.theValue("neto").into(dr.INPUT_USER_NAME),
                Enter.theValue("1234").into(dr.INPUT_PASSWORD)
                );
    }
}
