Feature: Profile Details


  Scenario: Profile Details
    Given the dashboard is visible
    Then click myaccount
    When enter the value "<phoneNumber>"
    When click Terms and Agreement
    Then click Send Code
    Then enter otp
    Then click verify