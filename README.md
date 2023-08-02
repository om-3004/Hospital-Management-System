# Hospital-Management-System
The Hospital Management System is created in Java and it is based on MVC (Model-View-Controller) architecture.

=> For front-end of the project, I have used Java Server Pages(JSP) (which acts as the View of the project in the MVC architecture) and also used Bootstrap for designing the Navigation bar and the Footer.

=> The server side programming is done using Servlet which acts as the Controller in the MVC architecture.

=> I have used MySQL database and used the JDBC driver mysql-connector to connect to the database and perform the CRUD(Create, Read, Update & Delete) operations in the com.db package and the queries for the same has been written in com.dao package and both these packages acts as a Model for the project in the MVC architecture.

=> All the dependies are included in the pom.xml file in the root folder.

Structure of the project:
-> There are 6 different packages used to seperate the code based on the MVC architecture. 
i) admin/servlet - It provides the logic for Adding the Doctor, Adding the Specialist, Admin Login, Admin Logout, Delete the Doctor and Update the details about the Doctor.
ii) doctor/servlet - It provides the logic for Doctor Login, Doctor Logout, Changing the Password, Edit his/her profile, Update the Status regarding to a particular patient.
iii) user/servlet - It provides the logic for taking the Appointment under a particular Doctor, User Login, User Logout, User Register, Change Password.
iv) entity - The contructor and various getter/setter methods are defined in the entity package under the specific entity.
v) db - It contains the DBConnect file in which the logic for connecting the application to the database is written.
vi) dao - All the queries required for the CRUD operation is written in the dao package under the specific entity.

# Screenshots

![hospital_ss](https://github.com/om-3004/Hospital-Management-System/assets/76418145/a5de700e-3c4c-4fc9-8370-2e32727d7493)
