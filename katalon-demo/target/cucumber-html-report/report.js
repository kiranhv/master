$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\KatalonBookApp.feature");
formatter.feature({
  "line": 1,
  "name": "Book Appointment",
  "description": "",
  "id": "book-appointment",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Book Appointment",
  "description": "",
  "id": "book-appointment;book-appointment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Access webpage and click on make appointment button and Enter vaild user name and password",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Complete the Make appointment page and click on Book appointment button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Go Back to Home page and Click on Logout",
  "keyword": "Then "
});
formatter.match({
  "location": "KatalonBookApp.access_webpage_and_click_on_make_appointment_button_and_Enter_vaild_user_name_and_password()"
});
formatter.result({
  "duration": 1117692200,
  "status": "passed"
});
formatter.match({
  "location": "KatalonBookApp.click_on_Login_button()"
});
formatter.result({
  "duration": 774658100,
  "status": "passed"
});
formatter.match({
  "location": "KatalonBookApp.complete_the_Make_appointment_page_and_click_on_Book_appointment_button()"
});
formatter.result({
  "duration": 1370827800,
  "status": "passed"
});
formatter.match({
  "location": "KatalonBookApp.go_Back_to_Home_page_and_Click_on_Logout()"
});
formatter.result({
  "duration": 5591160400,
  "status": "passed"
});
});