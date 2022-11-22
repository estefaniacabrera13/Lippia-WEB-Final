@Smoke @Shop
Feature: Shop

  Background:
    Given The user is placed in the practice page
    And Click on Shop Menu

  @ViewBasket
  Scenario Outline: Shop Add to Basket - View Basket through Item link
    When Click on the Add To Basket button in the Book
    And Click on Item link that contains the price in the Menu
    And In the checkout page verifies the total always is higher than subtotal
    And Click on Proceed to Check out button
    And User can view Billing Details,Order Details,Additional details and Payment gateway details
    And User can fill his details <details> in billing details and select payment method <method>
    And Click on Place Order button to complete process
    Then Navigates to Order confirmation page with order details,bank details,customer details and billing details
    Examples:
      | details                                                                                                                                                                                                                             | method         |
      | FirstName:Estefania,LastName:Cabrera,CompanyName:Crowdar,EmailAddress:estefania.cabrera@crowdaronline.com,Phone:12345678,Country:Argentina,Address:Emilio Mitre 1365,Apartment:2,Town:Buenos Aires,State:Buenos Aires,Postcode:1216 | Check Payments |

  @ValidateTax
  Scenario Outline: Shop Add to Basket - View Basket tax funcionality
    When Click on Home menu button
    Then Verifies that the Home page contains only three Arrivals
    And Click the image <image> in the Arrivals and navigate to next page
    And Click on the Add To Basket button
    And Click on Item link that contains the price in the Menu
    And In the checkout page verifies the total always is higher than subtotal
    Then Validates Tax rate for indian should be 2 percent and for abroad it should be 5 percent
    Examples:
      | image         |
      | Selenium Ruby |
