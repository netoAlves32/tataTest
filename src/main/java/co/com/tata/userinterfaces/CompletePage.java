package co.com.tata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletePage {
    public static final Target COMPLETE_BUTTON = Target.the("button that shows us the successful creation message").located(By.xpath("//div[contains(@class,'btn btn-primary')]"));

}
