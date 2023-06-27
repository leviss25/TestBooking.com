package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.InterfazDestino;

public class searchDestination implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Cuzco").into(InterfazDestino.textboxDestino),
                Click.on(InterfazDestino.primeraOpcion)
        );
    }
}
