package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogginAreaBooking {
    public static Target logginText = Target
            .the("Sign in or create an account")
            .located(By.id("com.booking:id/identity_header_title"));
    public static Target closeButton = Target
            .the("Close Button")
            .located(AppiumBy.accessibilityId("Navigate up"));
}
