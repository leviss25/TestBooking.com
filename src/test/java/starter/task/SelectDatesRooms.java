package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.BuscarDestino;
import starter.ui.InterfaceCalendarRooms;
import starter.ui.InterfaceRooms;

public class SelectDatesRooms implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InterfaceCalendarRooms.day1),
                Click.on(InterfaceCalendarRooms.day2),
                Click.on(InterfaceCalendarRooms.selectDateButton),
                SendKeys.of("1").into(InterfaceRooms.numberRooms),
                SendKeys.of("2").into(InterfaceRooms.numberAdults),
                //SendKeys.of("1").into(InterfaceRooms.numberRooms),
                Click.on(InterfaceRooms.applyButton),
                Click.on(BuscarDestino.botonBuscar)
        );
    }
}
