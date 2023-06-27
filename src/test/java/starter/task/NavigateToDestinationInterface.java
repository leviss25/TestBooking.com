package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.BuscarDestino;
import starter.ui.InterfazDestino;

public class NavigateToDestinationInterface implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BuscarDestino.destino),
                SendKeys.of("Cusco").into(InterfazDestino.textboxDestino),
                Click.on(InterfazDestino.primeraOpcion)
        );
    }
}
