package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfazDestino {
    public static Target textboxDestino = Target.the("Textbox Destino")
            .located(By.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content"));
    public static Target primeraOpcion = Target.the("Primera opción")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
}
