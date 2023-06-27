package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.InterfaceReserve;
import starter.ui.InterfaceResults;

public class NavigateToReserve implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InterfaceResults.item2),
                Click.on(InterfaceReserve.selectRoomButton),
                Click.on(InterfaceReserve.selectOptionRoomButton),
                Click.on(InterfaceReserve.reserveButton)
        );
    }
}
