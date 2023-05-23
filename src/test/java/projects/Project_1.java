package projects;

import locators_from_techglobal_training.LocatorsForProject01;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Base;

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
        Assert.assertTrue(LocatorsForProject01.findContactUsHeading.isDisplayed()); //Checking if the locator is displayed (the locator has been created with a searching method as a separated class)
        Assert.assertEquals(LocatorsForProject01.findContactUsHeading.getText(), "Contact Us"); //Checking if the found locator is equal to what has to be by requirements
        Assert.assertTrue(LocatorsForProject01.findAddressParagraph.isDisplayed());
        Assert.assertEquals(LocatorsForProject01.findAddressParagraph.getText(), "2860 S River Rd Suite 350, Des Plaines IL 60018");
        Assert.assertTrue(LocatorsForProject01.findEmailParagraph.isDisplayed());
        Assert.assertEquals(LocatorsForProject01.findEmailParagraph.getText(), "info@techglobalschool.com");
        Assert.assertTrue(LocatorsForProject01.findPhoneNumber.isDisplayed());
        Assert.assertEquals(LocatorsForProject01.findPhoneNumber.getText(), "(773) 257-3010");
    }


    /* Test Case 02 - Validate the Full name input box
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Full name input box is displayed
        Validate that the Full name input box is required
        Validate that the label of the Full name input box is “Full name”
        Validate that the placeholder of the Full name input box is “Enter your name”
     */

    /* Test Case 03 - Validate the Gender radio button
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate the label is “Gender”
        Validate that the Gender is required
        Validate the options are “Female”, “Male” and “Prefer not to disclose”
        Validate the options are clickable and not selected
        Click on the “Male” option and validate it is selected while the others are not selected
        Click on the “Female” option and validate it is selected while the others are not selected
     */

    /* Test Case 04 - Validate the Address input box
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Address input box is displayed
        Validate that the Address input box is not required
        Validate that the label of the Address input box is “Address”
        Validate that the placeholder of the Address input box is “Enter your address*”
     */

    /* Test Case 05 - Validate the Email input box
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Email input box is displayed
        Validate that the Email input box is required
        Validate that the label of the Email input box is “Email”
        Validate that the placeholder of the Email input box is “Enter your email”
     */

    /* Test Case 06 - Validate the Phone input box
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Phone input box is displayed
        Validate that the Phone input box is not required
        Validate that the label of the Phone input box is “Phone”
        Validate that the placeholder of the Address input box is “Enter your phone number”
     */

    /* Test Case 07 - Validate the Message text area
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate that the Message text area is displayed
        Validate that the Message text area is not required
        Validate that the label of the Message text area is “Message”
        Validate that the placeholder of the Message text area is “Type your message here…”
     */

    /* Test Case 08 - Validate the Consent checkbox
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate the label is “I give my consent to be contacted.”
        Validate that the Consent checkbox is required
        Validate that the Consent checkbox is clickable
        Click on the “I give my consent to be contacted.” checkbox and validate it is selected
        Click on the “I give my consent to be contacted.” checkbox again and validate it is not selected
     */

    /* Test Case 09 - Validate the SUBMIT button
        Navigate to https://techglobal-training.com/frontend/project-1
        Validate the “SUBMIT” button is displayed
        Validate the “SUBMIT” button is clickable
        Validate that the button text is “SUBMIT”
     */

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




}
