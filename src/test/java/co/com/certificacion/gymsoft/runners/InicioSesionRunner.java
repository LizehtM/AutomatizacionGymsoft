package co.com.certificacion.gymsoft.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
                glue = "co.com.certificacion.gymsoft.stepdefinitions",
                snippets = CucumberOptions.SnippetType.CAMELCASE)
public class InicioSesionRunner {


}
