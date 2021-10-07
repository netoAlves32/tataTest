package co.com.tata.tasks;



import co.com.tata.userinterfaces.DemoBlazeRegisterContactPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenceDataContact implements Task {

    public static DiligenceDataContact onTheForm() {
        return Tasks.instrumented(DiligenceDataContact.class);
    }

    DemoBlazeRegisterContactPage dr;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(dr.JOIN_BUTTON),
                Enter.theValue("Luz@gmail.com").into(dr.INPUT_ADRESS),
                Enter.theValue("Luz").into(dr.INPUT_CONTACT_NAME),
                Enter.theValue("Excelente página").into(dr.INPUT_MESSAGE)
                );
    }
}
