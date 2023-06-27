package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.InterfaceResults;

public class NavigatedToResultsInterface implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return InterfaceResults.sortText.resolveFor(actor).getText();
    }
    public static Question<String> value() {
        return new NavigatedToResultsInterface();
    }
}
