Feature: MeghanaTravels book a ticket

  Scenario Outline: Book a ticket
    Given user able to open any browser
    Then user able to enter url
    Then user able to enter userName as "<username>"
    And user able to enter password as "<password>"
    Then user able to click login button
    Then user able to check the status "<status>"

    Examples: 
      | username | password | status |
      | Admin    | Admin123 | pass   |
      | Admin    | Guru123 |  fail  |
