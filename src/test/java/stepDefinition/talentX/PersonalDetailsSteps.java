package stepDefinition.talentX;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import pages.LoginUI;
import pages.Personal;
import utils.Excelutil;
import utils.extent.Commonmethods;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.List;


public class PersonalDetailsSteps extends Personal{
    private String generatedEmail;

        public PersonalDetailsSteps() throws MalformedURLException {
            super();
        }
    @Given("The Personal page is visible")
    public void the_personal_page_is_visible() {

    }
    @Then("Click Nationality")
    public void click_nationality() {
            ClickNationality();

    }
    @Then("CLick Indian")
    public void click_indian() {
            ClickIndian();

    }
    @When("Enter Blood Group {string}")
    public void enter_blood_group(String BloodGroup) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
            Excelutil reader = new Excelutil();
            List<String> columnData = reader.getColumnData("input/PersonalDetails.xlsx", "PersonalDetails",BloodGroup);

            for (String value : columnData) {
                System.out.println("Value New Method: " + value);
                // Example action for each value
                EnterBloodGroup(value);
            }


    }
    @When("Enter Father's Name {string}")
    public void enter_father_s_name(String Fathername)throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        Excelutil reader = new Excelutil();
        List<String> columnData = reader.getColumnData("input/PersonalDetails.xlsx", "PersonalDetails",Fathername);

        for (String value : columnData) {
            System.out.println("Value New Method: " + value);
            // Example action for each value
            EnterFathername(value);
        }
    }
    @Then("CLick Email")
    public void click_email() {
        ClickEmail();

    }



    @When("Enter Email {string}")
    public void enter_email() {
            generatedEmail = Commonmethods.generateRandomEmail();
        // Enter the generatedEmail into the email field on the page
        System.out.println("Generated Email: " + generatedEmail);
    }


    @When("Enter Address Line {string}")
    public void enter_address_line(String Address) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        Excelutil reader = new Excelutil();
        List<String> columnData = reader.getColumnData("input/PersonalDetails.xlsx", "PersonalDetails",Address);

        for (String value : columnData) {
            System.out.println("Value New Method: " + value);
            // Example action for each value
            EnterAddressLine1(value);
        }
    }
    @Then("Click City")
    public void click_city() {
            ClickCity();


    }
    @When("Enter the City name {string}")
    public void enter_the_city_name(String City) throws InvalidFormatException, IOException,org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        Excelutil reader = new Excelutil();
        List<String> columnData = reader.getColumnData("input/PersonalDetails.xlsx", "PersonalDetails",City);

        for (String value : columnData) {
            System.out.println("Value New Method: " + value);
            // Example action for each value
            EnterCity(value);
        }
    }

    @When("Enter the PinCode {string}")
    public void enter_the_pin_code(String Pincode)throws IOException,org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        Excelutil reader = new Excelutil();
        List<String> columnData = reader.getColumnData("input/PersonalDetails.xlsx", "PersonalDetails", Pincode);

        for (String value : columnData) {
            System.out.println("Value New Method: " + value);
            // Example action for each value
            EnterPincode(value);
        }
    }
    @Then("Click Update Button")
    public void click_update_button() {
            ClickUpdateButton();

    }
    @When("Upload the Profile image {string}")
    public void upload_the_profile_image(String userName) throws IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        Excelutil reader = new Excelutil();
        String imagePath = reader.getImagePathFromExcel("input/PersonalDetails.xlsx", "PersonalDetails", "Image");
            UploadImage(imagePath);

    }

    @Then("The Profile page should display")
    public void the_profile_page_should_display() {

    }

}