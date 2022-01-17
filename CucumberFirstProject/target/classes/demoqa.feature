Feature: In order to open the demo website, I want to see more detail this
  Scenario Outline: Open the demoqa wesite
    Given I navigate to the website <website>
    When I check the website
    Then I see about the website
    Examples:
    |website           |
    |http://demoqa.com/|