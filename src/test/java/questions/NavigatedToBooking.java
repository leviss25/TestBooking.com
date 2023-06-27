package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.InterfaceBooking;

public class NavigatedToBooking implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return InterfaceBooking.bookingText.resolveFor(actor).getText();
    }
    public static Question<String> value(){
        return new NavigatedToBooking();
    }
}
