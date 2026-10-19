Feature:Login functionality

Scenario:valid Login inputs

Given user is on the login page
When user enters userName "standard_user"
When user enters password "secret_sauce"
And user click login button
Then user is moved to DashBoard

