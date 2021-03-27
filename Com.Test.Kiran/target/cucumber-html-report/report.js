$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\OrderTshirt.feature");
formatter.feature({
  "line": 1,
  "name": "Order T-shirt",
  "description": "",
  "id": "order-t-shirt",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Order T-shirt and verify inorder history",
  "description": "",
  "id": "order-t-shirt;order-t-shirt-and-verify-inorder-history",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Access webpage and click sign in button and Enter vaild user name \u0026 password",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Goto Tshirt page and select\tTshirt and add to cart and proceed checkout and confirm order and verify order",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsite.access_webpage_and_click_sign_in_button_and_Enter_vaild_user_name_password()"
});
formatter.result({
  "duration": 2647055200,
  "status": "passed"
});
formatter.match({
  "location": "RetailWebsite.click_on_Signin_button()"
});
formatter.result({
  "duration": 1890961500,
  "status": "passed"
});
formatter.match({
  "location": "RetailWebsite.goto_Tshirt_page_and_select_Tshirt_and_add_to_cart_and_proceed_checkout_and_confirm_order_and_verify_order()"
});
formatter.result({
  "duration": 15780807900,
  "status": "passed"
});
});