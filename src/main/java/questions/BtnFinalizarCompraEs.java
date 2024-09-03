package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.FloristeriaPage.BTN_FINALIZAR_COMPRA;

public class BtnFinalizarCompraEs implements Question<Boolean> {

    public static BtnFinalizarCompraEs visible(){
        return new BtnFinalizarCompraEs();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean BtnFinzalizarCompra = BTN_FINALIZAR_COMPRA.resolveFor(actor).isVisible();
        return BtnFinzalizarCompra;
    }
}
