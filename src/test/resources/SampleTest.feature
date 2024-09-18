Feature: Sample Mobile Test

  Scenario Outline: Verify the app opens correctly
    Given the app is launched
    When enter the value "<sheetname>" and <rownumber>
    Then the app should open successfully
    Examples:
      | sheetname | rownumber |
      |sample     |0          |

