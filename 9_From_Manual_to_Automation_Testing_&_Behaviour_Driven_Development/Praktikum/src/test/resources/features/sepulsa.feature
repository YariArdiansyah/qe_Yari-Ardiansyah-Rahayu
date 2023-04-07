Feature : SepulsaLogin

  @Login @NormalPositive
    Scenario: user can login with correct username dan correct password
      Given user is on login page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage

Feature: Choose Product

  @ChooseProduct @NormalPositive
    Scenario: user buy product with correct step
      Given user is on homepage
      When user click on menu product
      And user choose provider 'Simpati'
      And user choose credit amount 'Rp.10.000'
      And user input phone number '081914062710'
      Then user click 'Beli'

Feature: PaymentMethod

  @PaymentMethod @NormalPositive
    Scenario: user choose bank transfer method
      Given user is on homepage
      When user choose product with credit amount
      And user choose bank transfer method
      Then user click buy

  @PaymentMethod @NormalPositive
    Scenario: user choose E-wallet transfer method
      Given user is on homepage
      When user choose product with credit amount
      And user choose E-wallet method
      Then user click buy