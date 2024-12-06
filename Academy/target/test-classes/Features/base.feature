Feature: Product feature

 Scenario Outline : Validate user is able to launch application
    Given i navigate to academy page
    And i search "<product>" in searchbar
    Then i able to see search related product
    Then i close and quit the browser
   Examples:
     | product |
     | Bags |
     | Pants |
