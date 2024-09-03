package task;

import interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterfaces.FloristeriaPage.*;

public class AgregarDos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_PRODUCTO),
                Scroll.to(BTN_PRODUCTO),
                JavaScriptClick.on(BTN_PRODUCTO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_AGREGAR_CANTIDAD_PRODUCTO),
                Click.on(BTN_AGREGAR_CANTIDAD_PRODUCTO),
                WaitInteractions.untilBeEnable(BTN_AGREGAR_AL_CARRITO),
                Click.on(BTN_AGREGAR_AL_CARRITO)
        );
    }

    public static AgregarDos productos(){
        return Tasks.instrumented(AgregarDos.class);
    }
}
