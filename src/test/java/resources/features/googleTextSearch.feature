Feature: Google text search

  Scenario: user can search word

    Given an open browser with google.com
    When a word Java is entered in input field
    Then the first one should contain  Java is a computer programming language

  Scenario: user can search word in another languages

    Given an open browser with google.com
    When a word "офмф" is entered in input field
    Then the first one should contain Java is a computer programming language