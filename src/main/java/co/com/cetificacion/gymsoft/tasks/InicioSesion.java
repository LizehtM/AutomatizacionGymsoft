package co.com.cetificacion.gymsoft.tasks;

import co.com.cetificacion.gymsoft.models.Credenciales;
import co.com.cetificacion.gymsoft.userinterfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.cetificacion.gymsoft.userinterfaces.PaginaPrincipal.*;


public class InicioSesion implements Task {

    private Credenciales credenciales;

    public InicioSesion(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credenciales.getUser()).into(INPUT_USER));
        //el actor intenta ingresar en valor credenciales.getUser()) en el xpath user

        actor.attemptsTo(Enter.theValue(credenciales.getPassword()).into(INPUT_PASSWORD));

        actor.attemptsTo(Click.on(BTN_INGRESAR));
    }

    public static InicioSesion inicioSesion (Credenciales credenciales){

        return Tasks.instrumented(InicioSesion.class, credenciales);
    }
}
