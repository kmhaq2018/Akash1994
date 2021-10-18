@Smoke
Feature: User able to login with valid username & password

Description: "User login zoopla website & search the property &"
        "select  the  property as well as verify the property price." 
                                                  
Scenario: User login with valid username & verify the page title
Given User can open any browser
And User able to enter "https://www.zoopla.co.uk/" url
When User able to click on the login button
And  User enter the userName "kmhaq2018@gmail.com" and password "Akash2018"
And User click on the signing button
Then User able to verify successfully login & verify the homepage title
