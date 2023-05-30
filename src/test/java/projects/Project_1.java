package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Base;

import java.util.List;

public class Project_1 extends Base {

    @BeforeMethod
    public void setPage(){
        driver.get("https://techglobal-training.com/frontend/project-1");
    }


    /* Test Case 01 - Validate the Contact Us information
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate the heading is “Contact Us”
        Validate the address is “2860 S River Rd Suite 350, Des Plaines IL 60018”
        Validate the email is “info@techglobalschool.com"
        Validate the phone number is “(773) 257-3010”
     */

    @Test
    public void validateContactUsInformation(){
        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='is-size-2']")).isDisplayed()); //Checking if the locator is displayed (the locator has been created with a searching method as a separated class)
        Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='is-size-2']")).getText(), "Contact Us"); //Checking if the found locator is equal to what has to be by requirements
        Assert.assertTrue(driver.findElement(By.id("address")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.id("address")).getText(), "2860 S River Rd Suite 350, Des Plaines IL 60018");
        Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.id("email")).getText(), "info@techglobalschool.com");
        Assert.assertTrue(driver.findElement(By.id("phone-number")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.id("phone-number")).getText(), "(773) 257-3010");
    }


    /* Test Case 02 - Validate the Full name input box
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Full name input box is displayed
        Validate that the Full name input box is required
        Validate that the label of the Full name input box is “Full name”
        Validate that the placeholder of the Full name input box is “Enter your name”
     */

    @Test
    public void validateFullNameInputBox(){
        WebElement fullNameInputText = driver.findElement(By.xpath("//form/div[@class='field'][1]/div[@class='control']/input"));
        WebElement fullName = driver.findElement(By.cssSelector("label[for='name']"));
        Assert.assertTrue(fullName.isDisplayed());
        Assert.assertEquals(fullName.getText(),"Full name *");
        Assert.assertTrue(true,fullNameInputText.getAttribute("required"));
        Assert.assertEquals(fullNameInputText.getAttribute("placeholder"), "Enter your full name");
    }

    /* Test Case 03 - Validate the Gender radio button
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate the label is “Gender”
        Validate that the Gender is required
        Validate the options are “Female”, “Male” and “Prefer not to disclose”
        Validate the options are clickable and not selected
        Click on the “Male” option and validate it is selected while the others are not selected
        Click on the “Female” option and validate it is selected while the others are not selected
     */

    @Test
    public void validateGenderRadioButton(){
        WebElement genderLabel = driver.findElement(By.cssSelector("div.field:nth-child(2) label.label"));
        Assert.assertEquals(genderLabel.getText(), "Gender *");
        Assert.assertTrue(true,genderLabel.getAttribute("required"));
        List<WebElement> genderTypes = driver.findElements(By.cssSelector("div[class='field'] label.radio"));
        List<WebElement> genderInput = driver.findElements(By.cssSelector(".mr-1"));
        String[] requiredText = {"Male","Female", "Prefer not to disclose"};

        for (int i = 0; i < genderTypes.size(); i++) {
            Assert.assertEquals(genderTypes.get(i).getText(),requiredText[i]);
            Assert.assertTrue(genderInput.get(i).isDisplayed());
            Assert.assertTrue(genderInput.get(i).isEnabled());
            Assert.assertFalse(genderInput.get(i).isSelected());
        }

        for (int i = 0; i < genderInput.size(); i++) {
            if(i == 0) continue;
            Assert.assertFalse(genderInput.get(i).isSelected());
        }

        for (int i = 0; i < genderInput.size(); i++) {
            if(i == 1) continue;
            Assert.assertFalse(genderInput.get(i).isSelected());
        }

        /*
        IntStream.range(0, genderInput.size())
                .forEach(index -> {
                    Assert.assertTrue(genderInput.get(index).isDisplayed());
                    Assert.assertFalse(genderInput.get(index).isSelected());
                    Assert.assertTrue(genderInput.get(index).isEnabled());
                    Assert.assertEquals(requiredText[index], genderInput.get(index).getText()); // Compare the expected and actual texts based on the index
                });

         */


    }

    /* Test Case 04 - Validate the Address input box
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Address input box is displayed
        Validate that the Address input box is not required
        Validate that the label of the Address input box is “Address”
        Validate that the placeholder of the Address input box is “Enter your address*”
     */

    @Test
    public void validateAddressInputBox(){
        WebElement addressInputText = driver.findElement(By.xpath("//form/div[@class='field'][3]/div[@class='control']/input"));
        WebElement addressLabel = driver.findElement(By.cssSelector("div[class='field']:nth-child(3) label"));
        Assert.assertTrue(addressInputText.isDisplayed());
        Assert.assertFalse(false, addressInputText.getAttribute("required"));
        Assert.assertEquals(addressLabel.getText(),"Address");
        Assert.assertEquals(addressInputText.getAttribute("placeholder"), "Enter your address");
    }

    /* Test Case 05 - Validate the Email input box
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Email input box is displayed
        Validate that the Email input box is required
        Validate that the label of the Email input box is “Email”
        Validate that the placeholder of the Email input box is “Enter your email”
     */

    @Test
    public void validateEmailInputBox(){
        WebElement emailInput = driver.findElement(By.xpath("//form/div[@class='field'][4]/div[@class='control']/input"));
        WebElement emailLabel = driver.findElement(By.cssSelector("div[class='field']:nth-child(4) label"));

        Assert.assertTrue(emailInput.isDisplayed());
        Assert.assertTrue(true,emailInput.getAttribute("required"));
        Assert.assertEquals(emailLabel.getText(), "Email *");
        Assert.assertEquals(emailInput.getAttribute("placeholder"),"Enter your email");
    }

    /* Test Case 06 - Validate the Phone input box
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Phone input box is displayed
        Validate that the Phone input box is not required
        Validate that the label of the Phone input box is “Phone”
        Validate that the placeholder of the Address input box is “Enter your phone number”
     */
    @Test
    public void validatePhoneInputBox(){
        WebElement phoneInputPhone = driver.findElement(By.xpath("//form/div[@class='field'][5]/div[@class='control']/input"));
        WebElement phoneLabel = driver.findElement(By.xpath("//form/div[@class='field'][5]/label[@class='label']"));
        Assert.assertTrue(phoneInputPhone.isDisplayed());
        Assert.assertFalse(false,phoneInputPhone.getAttribute("required"));
        Assert.assertEquals(phoneLabel.getText(), "Phone");
        Assert.assertEquals(phoneInputPhone.getAttribute("placeholder"),"Enter your phone number");

    }

    /* Test Case 07 - Validate the Message text area
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Message text area is displayed
        Validate that the Message text area is not required
        Validate that the label of the Message text area is “Message”
        Validate that the placeholder of the Message text area is “Type your message here…”
     */

    @Test
    public void validateTheMessageTextArea(){
        WebElement messageTextArea = driver.findElement(By.className("textarea"));
        WebElement messageLabel = driver.findElement(By.cssSelector("div[class='field']:nth-child(6) label"));

        Assert.assertTrue(messageLabel.isDisplayed());
        Assert.assertTrue(true,messageTextArea.getAttribute("required"));
        Assert.assertEquals(messageLabel.getText(),"Message");
        Assert.assertEquals(messageTextArea.getAttribute("placeholder"),"Type your message here...");
    }

    /* Test Case 08 - Validate the Consent checkbox
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate the label is “I give my consent to be contacted.”
        Validate that the Consent checkbox is required
        Validate that the Consent checkbox is clickable
        Click on the “I give my consent to be contacted.” checkbox and validate it is selected
        Click on the “I give my consent to be contacted.” checkbox again and validate it is not selected
     */

    @Test
    public void validateCheckBox(){
        WebElement checkboxLabel = driver.findElement(By.xpath("//label[@class='checkbox']"));
        WebElement checkbox = driver.findElement(By.xpath("//label[@class='checkbox']/input"));

        Assert.assertEquals(checkboxLabel.getText(),"I give my consent to be contacted.");
        Assert.assertTrue(true,checkbox.getAttribute("required"));
        Assert.assertTrue(checkbox.isEnabled());
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());
        checkbox.click();
        Assert.assertFalse(checkbox.isSelected());
    }
    /* Test Case 09 - Validate the SUBMIT button
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate the “SUBMIT” button is displayed
        Validate the “SUBMIT” button is clickable
        Validate that the button text is “SUBMIT”
     */
    @Test
    public void validateSubmitButton(){
        WebElement submitButton = driver.findElement(By.cssSelector(".is-link"));

        Assert.assertTrue(submitButton.isDisplayed());
        Assert.assertTrue(submitButton.isEnabled());
        Assert.assertEquals(submitButton.getText(),"SUBMIT");
    }
    /* Test Case 10 - Validate the form submission
        Navigate to https://techglobal-training.com/frontend/project-1
        Enter a first name
        Select a gender
        Enter an address
        Enter an email
        Enter a phone number
        Enter a message
        Select the “I give my consent to be contacted.” checkbox
        Click on the “SUBMIT” button
        Validate the form message “Thanks for submitting!” is displayed under the “SUBMIT” button
     */
    @Test
    public void validateTheFormSubmission(){
        WebElement fullNameInputText = driver.findElement(By.xpath("//form/div[@class='field'][1]/div[@class='control']/input"));
        List<WebElement> genderInput = driver.findElements(By.cssSelector(".mr-1"));
        WebElement addressInputText = driver.findElement(By.xpath("//form/div[@class='field'][3]/div[@class='control']/input"));
        WebElement emailInput = driver.findElement(By.xpath("//form/div[@class='field'][4]/div[@class='control']/input"));
        WebElement phoneInputPhone = driver.findElement(By.xpath("//form/div[@class='field'][5]/div[@class='control']/input"));
        WebElement messageInput = driver.findElement(By.className("textarea"));
        WebElement checkbox = driver.findElement(By.xpath("//label[@class='checkbox']/input"));
        WebElement submitButton = driver.findElement(By.cssSelector(".is-link"));

        fullNameInputText.sendKeys("Anatolii Kamyshev");
        genderInput.get(0).click();
        addressInputText.sendKeys("3950 N Lake Shore Dr");
        emailInput.sendKeys("anatolikamyshev@gmail.com");
        phoneInputPhone.sendKeys("224-310-7716");
        messageInput.sendKeys("This one is the first selenium project");
        checkbox.click();
        submitButton.submit();
        WebElement thankMessage = driver.findElement(By.cssSelector(".mt-5"));

        Assert.assertTrue(thankMessage.isDisplayed());
        Assert.assertEquals(thankMessage.getText(),"Thanks for submitting!");
    }





}
