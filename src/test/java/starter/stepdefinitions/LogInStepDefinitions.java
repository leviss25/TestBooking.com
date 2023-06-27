package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.LoggedInQuestions;
import questions.NavigatedToBooking;
import questions.NavigatedToResultsInterface;
import starter.task.CloseLoginView;
import starter.task.NavigateTo;
import starter.task.NavigateToDestinationInterface;
import starter.task.SelectDatesRooms;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LogInStepDefinitions {
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    //CUANDO SE ABRE LA APP, SE ABRE LA INTERFAZ DE LOGIN, PRIMERO DEBEMOS CERRARLA
    @Given("I am in login view")//Verificamos si estamos en la interfaz de login
    public void iMinLoginView() {
        String expectedLoginText = "Sign in or create an account";
        theActorCalled("Carl").should(
                seeThat("the login text", LoggedInQuestions.value(),equalTo(expectedLoginText))
        );
    }
    @When("I close this view")//Cerramos la interfaz de login
    public void closeLoginView(){
        theActorInTheSpotlight().attemptsTo(
                new CloseLoginView()
        );
    }
    @Then("I am in booking View")//Verificamos que estamos en la interfaz de reservas
    public void iMinBookingView(){
        String expectedTextBooking = "Enter your destination";
        theActorInTheSpotlight().should(
                seeThat("the booking text", NavigatedToBooking.value(),equalTo(expectedTextBooking))
        );
    }
    @Given("I navigate to booking View")//Vamos hacia la interfaz booking
    public void navigateToBookingView(){
        theActorInTheSpotlight().attemptsTo();
    }
    @When("I enter search button")//tap al boton de buscar para ubicarno en la interfaz de booking
    public void enterSearchButton(){
        theActorInTheSpotlight().attemptsTo(
                new NavigateTo()
        );
    }

    @Given("Im in Booking interface")//Verificamos que estamos en la interfaz de booking
    public void ImBookingInterface(){
        String expectedTextBooking = "Enter your destination";//texto para comparar con el texto del textbox deberúa decir Enter your destination porque aún no hemos realizado la busqueda del destino
        theActorInTheSpotlight().should(
                seeThat("the booking text", NavigatedToBooking.value(),equalTo(expectedTextBooking))
        );
    }
    @When("I enter criteria on destination")//
    public void EnterCriteriaDestination() {
        theActorInTheSpotlight().attemptsTo(
                new NavigateToDestinationInterface()
        );
    }
    @And("I select dates and persons")
    public void selectDateRoomsPersons(){
        theActorInTheSpotlight().attemptsTo(
                new SelectDatesRooms()
        );
    }
    @Then("I am in results interface")
    public void iMResultsInterface(){
        String expectedTextSort = "Sort";
        theActorInTheSpotlight().should(
                seeThat("Results Interface", NavigatedToResultsInterface.value(),equalTo(expectedTextSort))
        );
    }

    @When("I chose 2nd option")
    public void choose2Option(){

    }
}
