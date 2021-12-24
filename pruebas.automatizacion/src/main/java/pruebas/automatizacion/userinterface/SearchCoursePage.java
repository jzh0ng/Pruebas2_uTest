package pruebas.automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UT = Target.the("Selecciona la Academia").located(By.xpath("//a[contains(text(),'Academy')]"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso").located(By.id("searchInput"));

    public static final Target SELECT_COURSE = Target.the("Da click para buscar el contenido del curso").located(By.xpath("//div[@class='feed-item-title']//a[@ng-click='$ctrl.tracking()'][contains(text(),'Introduction to Gambling Testing')]"));

    public static final Target NAME_CURSE =Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Introduction to Gambling Testing')]"));

}
