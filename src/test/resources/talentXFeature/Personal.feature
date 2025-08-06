Feature: Personal Details


  Scenario Outline: Personal Details
    Given The Personal page is visible
    Then Click Nationality
    Then CLick Indian
    When Enter Blood Group "<BloodGroup>"
    When Enter Father's Name "<Father's Name>"
    Then CLick Email
    When Enter Email
    When Enter Address Line 1 "<Address Line1>"
    Then Click City
    When Enter the City name "<City>"
    When Enter the PinCode "<Pincode>"
    Then Click Update Button
    When Upload the Profile image "<Profile Image>"
    Then The Profile page should display



    Examples:
      | BloodGroup | | Father's Name | | Address Line1 | | City | | Pincode | | Profile Image |
      | BloodGroup | | Father's Name | | Address Line1 | | City | | Pincode | | Profile Image |
