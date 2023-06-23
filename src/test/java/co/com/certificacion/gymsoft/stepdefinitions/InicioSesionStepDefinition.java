package co.com.certificacion.gymsoft.stepdefinitions;

import co.com.cetificacion.gymsoft.models.Credenciales;
import co.com.cetificacion.gymsoft.tasks.InicioSesion;
import static co.com.cetificacion.gymsoft.tasks.SeleccionarCiudadYSucursal.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.cetificacion.gymsoft.tasks.InicioSesion.inicioSesion;
import static co.com.cetificacion.gymsoft.utils.constants.Urls.gymsoft;

public class InicioSesionStepDefinition {

    @Before
    public void configuracionInicial(){
        WebDriverManager.chromedriver().setup(); // nueva configuracion del chrome
        OnStage.setTheStage(new OnlineCast()); //preparando el scenario  para las pruebas
        OnStage.theActorCalled("Lizet");
    }
    @Given("el usuario ingresa a la pagina de gymsoft")
    public void elUsuarioIngresaALaPaginaDeGymsoft() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(gymsoft));
    }
    @When("el usuario ingresa las credenciales")
    public void elUsuarioIngresaLasCredenciales(DataTable credeciales) {

        OnStage.theActorInTheSpotlight().attemptsTo(inicioSesion(new Credenciales(credeciales)));

    }

    @And("el usuario selecciona ciudad {string} y sucursal {string}")
    public void elUsuarioSeleccionaLaCiudadYSucursal( String ciudad, String suscursal){

        OnStage.theActorInTheSpotlight().attemptsTo(seleccionarCiudadYSucursal(ciudad, suscursal));

    }
    @Then("el usuario se encuentra en la pagina de inicio")
    public void elUsuarioSeEncuentraEnLaPaginaDeInicio() {

    }

}
