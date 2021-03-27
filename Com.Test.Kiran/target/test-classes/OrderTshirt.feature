Feature: Order T-shirt

  @Smoke
  Scenario: Order T-shirt and verify inorder history
    Given Access webpage and click sign in button and Enter vaild user name & password
    Then Click on Signin button
    And Goto Tshirt page and select	Tshirt and add to cart and proceed checkout and confirm order and verify order
