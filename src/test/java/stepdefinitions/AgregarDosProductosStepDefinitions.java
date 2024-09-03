package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.BtnFinalizarCompraEs;
import task.AgregarDos;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static utils.FloristeriaConstants.AVISO_DOS_CANTIDADES;

public class AgregarDosProductosStepDefinitions {

    @Before
    public void setUp() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Un cliente ingresa a la pagina floristearia mundo flor$")
    public void un_cliente_ingresa_a_la_pagina_floristearia_mundo_flor() {
        theActorCalled("user").attemptsTo(Open.url("https://www.floristeriamundoflor.com/"));
    }

    @Cuando("^Seleccione el producto y agregue una cantidad de dos para un producto$")
    public void seleccione_el_producto_y_agregue_una_cantidad_de_dos_para_un_producto() {
        withCurrentActor(AgregarDos.productos());
    }

    @Entonces("^podra visualizar el mensaje con nombre del producto y su cantidad$")
    public void podra_visualizar_el_mensaje_con_nombre_del_producto_y_su_cantidad() {
        OnStage.theActorInTheSpotlight().should(seeThat(BtnFinalizarCompraEs.visible()));
    }

}
