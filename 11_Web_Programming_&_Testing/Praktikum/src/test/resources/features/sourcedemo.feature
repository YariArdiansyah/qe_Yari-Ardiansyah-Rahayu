Feature:SauceDemoLogin

  Scenario:login success
    Given user on saucedemo login page
    When user input valid credentials
    And user click on login button
    Then user should redirected to saucedemo homepage

  Scenario:user logout account
    Given user on saucedemo homepage
    And user click on menu button
    And user click on logout button
    Then user should redirected to saucedemo login page

  Scenario:user add product to cart
    Given user on saucedemo homepage
    And user click on add cart
    And user click on cart button
    Then user should redirected to saucedemo cart page