Feature: Cart Service Fake Store API

  @FakeStoreAPI @CartFakeStore @GetAllCarts
    Scenario: User get all carts
      Given User call an api "/carts" with method "GET"
      Then User verify response is match with json schema "allcarts.json"

  @FakeStoreAPI @CartFakeStore @GetSingleCarts
    Scenario: User get single carts
      Given User call an api "/carts/5" with method "GET"
      Then User verify response is match with json schema "singlecarts.json"

  @FakeStoreAPI @CartFakeStore @GetSortCarts
    Scenario: User get sort carts
      Given User call an api "/carts?sort=desc" with method "GET"
      Then User verify response is match with json schema "sortcarts.json"

  @FakeStoreAPI @CartFakeStore @GetLimitResultCarts
    Scenario: User get limit result carts
      Given User call an api "/carts?limit=5" with method "GET"
      Then User verify response is match with json schema "limitcarts.json"

  @FakeStoreAPI @CartFakeStore @GetDateRangeCarts
    Scenario: User Get carts in a date range
      Given User call an api "/carts?startdate=2019-12-10&enddate=2020-10-10" with method "GET"
      Then User verify response is match with json schema "datarangecarts.json"

  @FakeStoreAPI @CartFakeStore @DeleteCarts
  Scenario: User delete carts
    Given User call an api "/carts/6" with method "DELETE"
    Then User verify response is match with json schema "deletecarts.json"

  @FakeStoreAPI @CartFakeStore @UpdateCarts
  Scenario: User update carts
    Given User call an api "/carts/7" with method "PUT" with payload below
    | userId | date | productId | quantity |
    | 3      | 2019-12-10 | 1   | 3 |
    Then User verify response is match with json schema "updatecarts.json"

  @FakeStoreAPI @CartFakeStore @AddCarts
  Scenario: User add new carts
    Given User call an api "/carts" with method "POST" with payload below
      | id | userId | date | productId | quantity |
      | 7  | 5      | 2020-02-03 | 1   | 5 |
    Then User verify response is match with json schema "updatecarts.json"