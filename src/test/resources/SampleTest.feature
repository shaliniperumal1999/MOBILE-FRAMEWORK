Feature: Sample Mobile Test

  Scenario Outline: Verify the app opens correctly
    Given the app is launched
    Then the app should open successfully "<sheetname>" and <rownumber>
    Examples:
      | sheetname | rownumber |
      |sample     |0          |

