package locators_from_techglobal_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Base;

public class LocatorsForProject01 extends Base {
    public static WebElement ContactUsHeading = driver.findElement(By.xpath("//h1[@class='is-size-2']")); //found by xpath at the class because there are other h1, so it's not a unique
    public static WebElement AddressParagraph = driver.findElement(By.id("address")); //found by id (unique)

    public static WebElement EmailParagraph = driver.findElement(By.id("email")); //found by id (unique)

    public static WebElement PhoneNumber = driver.findElement(By.id("phone-number")); //found by id (unique)
}
