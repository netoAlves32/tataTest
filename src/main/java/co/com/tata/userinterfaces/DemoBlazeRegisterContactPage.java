package co.com.tata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeRegisterContactPage {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to the Register a contact form").located(By.xpath("//a[@data-target='exampleModal']"));
    public static final Target INPUT_ADRESS = Target.the("Where do we write the adress").located(By.xpath("//div[id()='recipient-email']"));
    public static final Target INPUT_CONTACT_NAME = Target.the("Where do we write the contact name").located(By.xpath("//div[id()='recipient-name']"));
    public static final Target INPUT_MESSAGE = Target.the("Where do we write the message").located(By.xpath("//div[id()='message-text']"));

}
