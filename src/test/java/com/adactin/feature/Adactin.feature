Feature: Hotel Adactin Booking Site

Scenario: User Login To The Adactin Website
Given user Opening Adactin Application By Weblaunch 
When user Login By Using The User Details In Userid Field
And user Proviede Necessary Password In Password Field
Then user Click The Login Button

Scenario: User Navigate To Adactin Search Hotel Page
Given user Move On To The Search Hotel By Login
When select Location By Dropdown
And select Hotel By Dropdown
And select Room Type By Dropdown
And type Number Of Rooms By Dropdown
And type Checkin Date 
And type Check Out Date 
And type Adults Per Room
And type Childrens Per Room
Then sarch By Buutton


Scenario: User Navigates To Select Hotel Page
When user Opends The Select Hotel Page
And select The Hotel Name Location and all
Then click Continue

Scenario: Navigate To Next Page By Continue
When type Required Credentials in Book Hotel Page
And type Hote Name
And type Location
And select room Type
And type First Name
And type Billing
And type card Details
Then select Book Now Button

Scenario: Navigates To The Booking Confirmation Page
When type The Hotel Name
And type The Location
And type The Room Type
And type The Order Number
Then select The Logout Button