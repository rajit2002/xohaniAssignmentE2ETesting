End-to-End Testing of Tutorial Ninja

Overview

This project automates the end-to-end testing of the Tutorial Ninja demo website using Selenium WebDriver with TestNG. The script covers key functionalities like user registration, login, product search, add to cart, and checkout.

Technologies Used

1.Java (Programming Language)

2.Selenium WebDriver (Browser Automation)

3.TestNG (Test Framework)

4.WebDriverWait (Explicit Wait Handling)

5.Maven (Dependency Management)

6.ChromeDriver (WebDriver for Chrome)

Test Scenarios Covered

1. User Registration

i. Clicks on My Account > Register

ii. Fills out registration details (First Name, Last Name, Email, Phone, 
  Password, Subscribe)

iii. Accepts the Privacy Policy

iv. Submits the registration form

v. Verifies successful account creation

vi. Logs out

User Login

2. Clicks on My Account > Login

i.Enters registered email and password

ii.Submits the login form

iii.Product Search and Add to Cart

3.Searches for a product ("Phone")

i.Selects a product from the search results

ii.Views product images

iii.Adds the product to the cart

iv.Views the cart and verifies product details

Checkout Process

Proceeds to checkout



