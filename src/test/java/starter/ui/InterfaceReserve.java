package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfaceReserve {
    public static Target selectRoomButton = Target.the("Select Room")
            .located(By.id("com.booking:id/select_room_cta"));
    public static Target selectOptionRoomButton = Target.the("Select Option Room")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout"));
    public static Target reserveButton = Target.the("Reserve Button")
            .located(By.className("android.widget.Button"));
}
