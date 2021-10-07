package co.com.tata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookDir {
    public static final String URL = "http://localhost:4200/";
    public static final Target IMAGEN = Target.the("Imagen grande").located(By.xpath("//*[@id=\"root-component\"]/ng-component/div/div/div"));
    public static final Target PERROBTN = Target.the("Boton Perro").located(By.xpath("//*[contains(text(),'Perro')]"));
    public static final Target GATOBTN = Target.the("Boton Gato").located(By.xpath("//*[contains(text(),'Gato')]"));
    public static final Target IMAGENGATO = Target.the("Imagen de los gatos").located(By.xpath("//a[@href='/image/3' or @href='/image/4']"));
    public static final Target IMAGENPERRO = Target.the("Imagen de los perros").located(By.xpath("//a[@href='/image/1' or @href='/image/2' or @href='/image/5']"));

}
