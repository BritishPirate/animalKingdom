Feature: name the cat Dave
  AS AN owner
  I WANT TO name my cat Dave
  SO THAT comes when I call it Dave

  Scenario: Successfully named the cat Dave
    Given I have a cat
    And The cat does not have a name
    And I am the owner
    And The name I want to give it is Dave
    When I name the cat
    Then The cat is called Dave
    And it answers to it's name
