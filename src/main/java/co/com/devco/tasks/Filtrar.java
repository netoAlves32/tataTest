package co.com.devco.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.text.MessageFormat;

public class Filtrar implements Task {
    private String filtro;

    public Filtrar(String filtro) {

        this.filtro = filtro;
    }

    public static Performable por(String filtro) {

        return Tasks.instrumented(Filtrar.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String xPath = "//*[contains(text(),\"{0}\")]";
        MessageFormat fmt = new MessageFormat(xPath);
        xPath = fmt.format(new String[]{this.filtro});
        Target boton = Target.the("Boton de filtro de todos").located(By.xpath(xPath));
        actor.attemptsTo(Click.on(boton));
    }
}
