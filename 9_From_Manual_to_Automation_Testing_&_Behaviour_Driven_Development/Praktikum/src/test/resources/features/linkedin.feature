Feature: LinkedIn Home

  @CreatePost @NormalPositive
    Scenario: Create new post
      Given user is on landing page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user input post
      And user input text in post field section
      And user click send post
      Then user see their post in their feed

  @CreatePost @NormalPositive
    Scenario: Create post with tagging connection
      Given user is on landing page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user input in the text box 'Hello, @Yari'
      And user click send post
      Then user see their post in their feed with tagged connection

  @CreatePost @NormalPositive
    Scenario: Create post with hashtags
      Given user is on landing page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user input in the text box 'Hello, #linkedin #Alterra'
      And user click send post
      Then user see their post in their feed with hashtags

  @CreatePost @NormalNegative
    Scenario: Create Post with an empty post
      Given user is on landing page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user dont input any text on post field
      And user click post button
      Then user see error message

  @CreatePost @NormalNegative
    Scenario: Create Post with exceeding character limit
      Given user is on landing page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user input that exceeds character limit
      And user click post button
      Then user see error message

  @CommentPost @NormalPositive
    Scenario: Comment on our own post
      Given user is on landing page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user click post
      And user input comment on comment field
      And user click send
      Then user see their comment in the commend section below post

  @ScrollFeed @NormalPositive
    Scenario: Scrolling Feed on homepage
      Given user is on landing page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user click and push scroll button
      And user drag scroll button
      Then user see other people feed