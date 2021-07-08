# InternationalPhoneNumbersValidation

Spring boot web application used to validate international Phone numbers.

Used:
 1- object orentined programming(Encapsulation, Abstraction, interface).
 2- spring boot.
 3- Thymleaf.
 4- MVc
 5- maven.
 6- Jpa
 7-Hibernate.
 8-Junit
 


• Build the Project form the parent(phone-num-validation) 
mvn clean package

• Boot the application from (phone-num-validation-rest project)
mvn exec:java -Dexec.mainClass=com.test.phone.num.validation.rest.Main

note: starts on port '8282'

• Run unit Test mvn test

Access the pages using the URLs:

• http://localhost:8282/ 
• http://localhost:8282/customerDetails

The first URL is the home page of the application. The home page has link to the second page.


