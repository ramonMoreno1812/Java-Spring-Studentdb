# Java-Spring-Studentdb

This project is created with the Spring framework and allows the user to enter a students name, date of birth and email.
The User, through a form template (thymeleaf), then can return the main page (index.html) and see the list of students she/he has entered.
The user has the option to update and delete a students information.

The backend database (mysql) stores the information, and the Java code creates the Student object and through the use of the MVC model (model, View, Control) 
apporiatly handels the info passed through the UI. 

in order to run this project the mysql database must first be created 
CREATE DATABASE studentdata; code must be entered in Mysql Workbench 
Localhost is used to run and test this project as noted in my applications file.

