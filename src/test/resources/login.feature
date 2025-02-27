Feature: User Login

  I want to login to my Tokopedia account

  Background:
    Given I go to '/login'
    And the field 'email' is empty
    And the field 'password' is empty

  Scenario: Error on empty fields
    When I click on 'Login'
    Then field 'email' should be with error 'Email is required'
    And field 'password' should be with error 'Password is required'

  Scenario: User logs in with valid credentials
    Given I have users:
      | name           | email             | password    |
      | Windiany Yani  | user@example.com  | password123 |
    When I type 'user@example.com' in 'email'
    And I type 'password123' in 'password'
    And I click on 'Login'
    Then I shouldn't see 'Access your account'
    And I should be redirected to the homepage
    And I should see my account name on the top right corner

  Scenario: User enters incorrect password
    Given I have users:
      | name           | email             | password    |
      | Windiany Yani  | user@example.com  | password123 |
    When I type 'user@example.com' in 'email'
    And I type 'wrongpassword' in 'password'
    And I click on 'Login'
    Then I should see 'Password incorrect'

  Scenario: User enters an unregistered email
    When I type 'unknown@example.com' in 'email'
    And I type 'randompass' in 'password'
    And I click on 'Login'
    Then I should see 'Email is not registered'

  Scenario: User enters an invalid email format
    When I type 'invalid-email' in 'email'
    And I type 'password123' in 'password'
    And I click on 'Login'
    Then I should see 'Please enter a valid email address'

  Scenario: User tries to login with an inactive account
    Given I have users:
      | name           | email             | password    | status   |
      | Windiany Yani  | inactive@example.com  | password123 | inactive |
    When I type 'inactive@example.com' in 'email'
    And I type 'password123' in 'password'
    And I click on 'Login'
    Then I should see 'Your account is inactive. Please contact support'
