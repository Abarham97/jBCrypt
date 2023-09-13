# Spring Boot Web Application with BCrypt Password Encryption

This is a simple Spring Boot web application that demonstrates user registration and login functionality using BCrypt password encryption.

## Technologies Used

- Spring Boot
- Spring Data JPA
- BCrypt
- Thymeleaf (for frontend templates)

## Getting Started
- Access the application by opening a web browser and going to http://localhost:8080
- You can register a new user by clicking on the "Sign Up" link and providing a username and password.
- Passwords are securely hashed using BCrypt before being stored in the database.
- After registration, you can log in with your credentials.
- If the login is successful, you'll be redirected to the "App" page.

## Project Structure:
- UserRepository: include JPArepo and findbyUsername method.
- ApllController: redirect to the App.
- Home Controller : the start of the App to choos of login or signup.
- post model: is include the post Structure: ID, UserID,Text.
- UserSite model: include user Structure: ID ,username,password.
  - resources : include the HTML and css file :
  1- home.css.
  2-login.css
  - HTML:
  1-APP
  2-Home
  3-login
  4-signup