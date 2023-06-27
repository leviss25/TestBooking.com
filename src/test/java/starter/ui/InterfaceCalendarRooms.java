package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfaceCalendarRooms {
    public static Target day1 = Target.the("Check In")
            .located(AppiumBy.accessibilityId("29 June 2023"));
    public static Target day2 = Target.the("Check Out")
            .located(AppiumBy.accessibilityId("30 June 2023"));
    public static Target selectDateButton = Target.the("Button Select Date")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button"));
}
