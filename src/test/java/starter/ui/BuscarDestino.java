package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarDestino {
    public static Target destino = Target.the("destino")
            .located(By.id("com.booking:id/facet_search_box_accommodation_destination"));
    public static Target fechas = Target.the("fechas")
            .located(By.id("com.booking:id/facet_search_box_accommodation_dates"));
    public static Target personalizar = Target.the("personalizar")
            .located(By.id("com.booking:id/facet_search_box_accommodation_occupancy"));
    public static Target botonBuscar = Target.the("Botón Buscar")
            .located(By.id("com.booking:id/facet_search_box_cta"));
}
