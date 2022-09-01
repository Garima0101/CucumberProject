@Regression
Feature: Techfios Home Page
@Test1
Scenario:Sky Blue Background and White Background
Given User enter url"https://techfios.com/test/101/" 
And Set SkyBlue Background button exists
And Set SkyWhite Background button exists
When  I click on Set Sky Blue Background button
Then the background color will change to sky blue
When I click on Set White Background button
Then the background color will change to white



