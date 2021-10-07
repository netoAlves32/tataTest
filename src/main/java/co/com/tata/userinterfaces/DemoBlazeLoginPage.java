package co.com.tata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeLoginPage {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to the Login").located(By.xpath("//a[@id='login2']"));
    public static final Target INPUT_USER_NAME = Target.the("Where do we write the user name").located(By.xpath("//div[type()='text']"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.xpath("//div[type()='password']"));

}
