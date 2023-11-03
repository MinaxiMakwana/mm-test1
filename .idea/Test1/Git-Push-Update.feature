Feature: NopCommerce Register test cases Homework week 3 Minaxi Makwana

  Background: User is on the NopCommerce Register page
    Given	  	User open "https://demo.nopcommerce.com/" on google chrome browser
    When		User click on the given link
    Then 		User navigate to the Register page

  Scenario Outline: User should not Register with invalid credentials
    Given	  	User is in Register page
    When		User enter "<First Name>" in First Name field
    And			User enter "<Last Name>" in Last Name field
    And			User enter "<email address>" in email field
    And			User enter "<Password>" in password field
    And			User enter "<Confirm Pasword>" in Confirm password field
    And			User click on Register button
    Then		User could not Register
    And			User can see "error message"

    Examples:
      |First Name| Last Name| Email address |  Password | Confirm Password |  Error message|
      |		     | Syam     | Abc@gmail.com |  123456   | 123456           |  Registration unsuccessful |
      | Ram      |          | Abc@gmail.com |  123456   | 123456           |  Registration unsuccessful |
      | Ram      | Syam     |               |  123456   | 123456           |  Registration unsuccessful |
      | Ram      | Syam     | Abc@gmail.com |           | 123456           |  Registration unsuccessful |
      | Ram      | Syam     | Abc@gmail.com |  123456   |                  |  Registration unsuccessful |
      |          |          |               |           |                  |  Registration unsuccessful |

  Scenario: 	User should not be able to click on both radio buttons
    Given	  	User is in Register page
    When		User click on "Male Radio button" on Male radio button
    And			User click on "Female Radio button" on Female radio button
    Then		User could not click on either of the radio button
    And			User Could not Register
