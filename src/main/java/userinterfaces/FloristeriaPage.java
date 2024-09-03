package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FloristeriaPage {

    public static final Target BTN_PRODUCTO = Target.the("Bton para ver los ramos disponibles")
            .located(By.xpath("(//img[@alt='rosa_inmortalizada'])[1]"));

    public static final Target BTN_AGREGAR_CANTIDAD_PRODUCTO = Target.the("Bton para aumentar la cantidad de productos deseados")
            .located(By.xpath("//input[@class = 'plus']"));

    public static final Target BTN_AGREGAR_AL_CARRITO = Target.the("Bton para agregar productos al carrito")
            .located(By.name("add-to-cart"));

    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Tarjeta que muestra nombre del producto y su cantidad")
            .located(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
}
