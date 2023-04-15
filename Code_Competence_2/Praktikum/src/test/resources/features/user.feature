Feature: User Service Fake Store API

  @FakeStoreAPI @UserFakeStore @GetAllUsers
  Scenario: User get all user
    Given User call an api "/users" with method "GET"
    Then User verify response is match with json schema "allusers.json"

  @FakeStoreAPI @UserFakeStore @GetSingleUsers
  Scenario: User get single user
    Given User call an api "/users/1" with method "GET"
    Then User verify response is match with json schema "singleusers.json"

  @FakeStoreAPI @UserFakeStore @GetLimitResultUsers
  Scenario: User get limit result
    Given User call an api "/users?limit=5" with method "GET"
    Then User verify response is match with json schema "limitusers.json"

  @FakeStoreAPI @UserFakeStore @GetSortUsers
  Scenario: User get sort
    Given User call an api "/users?sort=desc" with method "GET"
    Then User verify response is match with json schema "sortusers.json"

  @FakeStoreAPI @UserFakeStore @PostAddUsers
  Scenario: User add new users
    Given User call an api "/users" with method "POST" with payload below
      | email | username | password | first name | last name | city | street | number | zipcode | latitude | longitude | phone |
      | John@gmail.com | johnd | m38rmF$ | John  | Doe       | kilcoole | 7835 new road | 3 | 12926-3874 | -37.3159 | 81.1496 | 1-570-236-7033 |
    Then User verify status code is 200
    Then User verify response is match with json schema "addnewusers.json"

  @FakeStoreAPI @UserFakeStore @PutUpdateUsers
  Scenario: User update user with given id
    Given User call an api "/users/7" with method "PUT" with payload below
      | email | username | password | first name | last name | city | street | number | zipcode | latitude | longitude | phone |
      | John@gmail.com | johnd | m38rmF$ | John  | Doe       | kilcoole | 7835 new road | 3 | 12926-3874 | -37.3159 | 81.1496 | 1-570-236-7033 |
    Then User verify status code is 200
    Then User verify response is match with json schema "addnewusers.json"

  @FakeStoreAPI @UserFakeStore @DeleteUsers
  Scenario: User delete users
    Given User call an api "/users/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "deleteusers.json"
