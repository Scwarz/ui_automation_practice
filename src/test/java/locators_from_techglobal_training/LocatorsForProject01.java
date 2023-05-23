package locators_from_techglobal_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Base;

public class LocatorsForProject01 extends Base {
    public static WebElement contactUsHeading = driver.findElement(By.xpath("//h1[@class='is-size-2']")); //found by xpath at the class because there are other h1, so it's not a unique

    public static WebElement addressParagraph = driver.findElement(By.id("address")); //found by id (unique)

    public static WebElement emailParagraph = driver.findElement(By.id("email")); //found by id (unique)

    public static WebElement phoneNumber = driver.findElement(By.id("phone-number")); //found by id (unique)

    public static WebElement fullNameInputText = driver.findElement(By.xpath("//form/div[@class='field'][1]/div[@class='control']/input"));

    public static WebElement genderMaleInputRadio = driver.findElement(By.xpath("//form/div[@class='field'][2]/div[@class='control']/label[@class='radio'][1]/input"));

    public static WebElement genderFemaleInputRadio = driver.findElement(By.xpath("//form/div[@class='field'][2]/div[@class='control']/label[@class='radio ml-0'][1]/input"));

    public static WebElement genderNotAnswerInputRadio = driver.findElement(By.xpath("//form/div[@class='field'][2]/div[@class='control']/label[@class='radio ml-0'][2]/input"));

    public static WebElement addressInputText = driver.findElement(By.xpath("//form/div[@class='field'][3]/div[@class='control']/input"));

    public static WebElement emailInputEmail = driver.findElement(By.xpath("//form/div[@class='field'][4]/div[@class='control']/input"));

    public static WebElement phoneInputPhone = driver.findElement(By.xpath("//form/div[@class='field'][5]/div[@class='control']/input"));

    public static WebElement messageTextarea = driver.findElement(By.className("textarea"));

    public static WebElement checkbox = driver.findElement(By.xpath("//label[@class='checkbox']/input"));

    public static WebElement submitButton = driver.findElement(By.cssSelector("button[class='button is-link']"));
}
