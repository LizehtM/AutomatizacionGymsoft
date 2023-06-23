package co.com.cetificacion.gymsoft.tasks;

import static co.com.cetificacion.gymsoft.userinterfaces.PaginaPrincipal.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
public class SeleccionarCiudadYSucursal implements Task {
    private String ciudad;
    private String sucursal;
    public SeleccionarCiudadYSucursal(String ciudad, String sucursal) {
        this.ciudad = ciudad;
        this.sucursal = sucursal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(LISTAS_DESPLEGABLES, WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(LISTAS_DESPLEGABLES));
        actor.attemptsTo(Click.on(SELECCIONES_LISTA.of(ciudad)));


                //WaitUntil.the(LISTAS_DESPLEGABLES, WebElementStateMatchers.isVisible()).forNoMoreThan(5).
                //      seconds(), Click.on(LISTAS_DESPLEGABLES),
                //    Click.on(LISTAS_DESPLEGABLES.of(sucursal).resolveFor(actor))
                 //);
    }
    public static SeleccionarCiudadYSucursal seleccionarCiudadYSucursal(String ciudad, String sucursal){

        return Tasks.instrumented(SeleccionarCiudadYSucursal.class, ciudad, sucursal);
    }
}
