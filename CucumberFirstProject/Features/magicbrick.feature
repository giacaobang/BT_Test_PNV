Feature: In order to search function which return to correct result.
  Scenario Outline: Open the magicbricks.com website and do search
    Given I open the website <website>
    Then I check the correct website
    When I search <keyword>
    Then I check data returns <records>
    Examples:
    |website                |keyword  | records |
    |http://magicbricks.com | ssssss  | 0       |
    |http://magicbricks.com | ssss    | 2      |
    |http://magicbricks.com | ss      | 9      |


