Feature: Login Mobile App

  Scenario Outline: Verify the app opens correctly
    Given the TALENTx app is launched
    When enter the value "<phoneNumber>"
    When click Terms and Agreement
    Then click Send Code
    When click Captcha Box


    Examples:
      | phoneNumber |
      | phoneNumber |

