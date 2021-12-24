package pruebas.automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button para el login")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__link'][contains(text(),'Log In')]"));
    public static final Target INPUT_EMAIL = Target.the("escribir su correo")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("escribir su contraseña")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button de ingresar")
            .located(By.xpath("//button[contains(@class,'btn')]"));
}
