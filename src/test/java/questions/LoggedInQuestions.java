package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionSubject;
import starter.ui.LogginAreaBooking;

public class LoggedInQuestions implements Question {
    @Override
    public String answeredBy(Actor actor) {
                return LogginAreaBooking.logginText.resolveFor(actor).getText();
    }
    public static Question<String> value(){
        return new LoggedInQuestions();
    }
}
