Feature: SepulsaFitur

  Scenario: Login Valid
    Given user on sepulsa home page
    And user click on masuk button
    When user input corrected credentials
    And user click on masuk button at login page
    Then user should go to sepulsa homepage


  Scenario: Logging Out
    Given user on sepulsa homepage
    And user click on akun button
    And user click on keluar button
    Then user should go to sepulsa login page

  Scenario: Register Account
    Given user on sepulsa login page
    And user click on daftar button
    And user input form register
    And user click on daftar button at register page
    Then user should go to verification page