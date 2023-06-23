package co.com.cetificacion.gymsoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    public static final Target INPUT_USER = Target.the("Input del usuario").located(By.id("txtNombre"));

    public static final Target INPUT_PASSWORD = Target.the("input de la contraseña").located(By.id("txtClave"));

    public static final Target BTN_INGRESAR = Target.the("btn de ingresar").located(By.xpath("//button[@class = 'btn buttonFill notranslate']"));

    public static final Target LISTAS_DESPLEGABLES = Target.the("lista ").located(By.xpath("(//div[@class='filter-option'])[1]"));

    public static final Target SELECCIONES_LISTA = Target.the("Seleccionar").locatedBy("//span[contains(text(),'{0}')]");

}