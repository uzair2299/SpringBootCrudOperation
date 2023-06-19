This project is a simple example of a CRUD (Create, Read, Update, Delete) operation using Spring Boot, Spring Data JPA, and SQL Server. The project is built using Maven.

<h1>Getting Started</h1>

To run this project, you need to have the following prerequisites installed on your system:

1. JDK 1.8 or later
2. Maven 3 or later
3. Microsoft SQL Server

<h1>Database Setup</h1>
1. Create a new database in SQL Server.
2. Execute the create-tables.sql script located in the src/main/resources directory to create the necessary tables.
3. Update the application.properties file located in the src/main/resources directory with your SQL Server connection details:


```
spring.datasource.url= jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=db_name
spring.datasource.username= sa
spring.datasource.password= 123456
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.SQLServerDialect
spring.jpa.hibernate.ddl-auto= update
spring.jpa.properties.hibernate.globally_quoted_identifiers=true
```

<h1>Creating executable JAR</h1>

1. Open a terminal or command prompt
2. Navigate to the directory where your Maven project is located
3. Run the following command to clean the project


`mvn clean -x` This command will remove all the files generated by the previous build and start with a clean slate.

4. Run the following command to package the project:

`mvn package` This command will compile your source code, run your tests, and package your application into a single, executable JAR file.

Once the build is complete, you should see a message in the terminal indicating that the build was successful, and the packaged JAR file will be located in the target/ directory of your project.

<h1>Running a JAR File</h1>

1. Open a terminal or command prompt.
2. Navigate to the directory where the JAR file is located.
3. Enter the following command: `java -jar <filename>.jar` 
4. Replace '<filename>' with the name of the JAR file you want to run, including the .jar extension.

    
<h1>Running a JAR with profile</h1>
To run a Spring Boot JAR with a specific profile, you can use the following command: 
    
`java -jar "-Dspring.profiles.active=profile" filename.jar`

Replace <profile> with the name of the profile you want to use, and <filename> with the name of your JAR file, including the .jar extension.

<h1>API Endpoints</h1>

The following endpoints are available for this application:
| Command  | Operation |
| ------------- | ------------- |
| `api/v1/users`  | Get  |
| `api/v1/users`  | Post  |
| `api/v1/users/{id}`  | Get  |
| `api/v1/users/{id}`  | Put  |
| `api/v1/users/{id}`  | Delete  |
<h2>Create a new User</h2>
/api/v1/users

Example request body:

```
{
    "id": "100",
    "name": "Doe",
}
```

# Annotations
## A
## B
## C
`@Column`
`@Component` In the context of Spring Boot, a component is a class that is managed by the Spring framework and plays a role in the application's business logic.
`@Controller` This annotation is used to mark a class as a controller component. Controller components handle HTTP requests and define the behavior of different endpoints in a web application. They often receive requests, process them, and return responses to the client.
## D
## E
`@Entity`
## F
## G
`@GeneratedValue`
## H
## I
`@Id :`  used to mark a field or property as primary key.
## J
`@JoinColumn`
## K
## L
## M
`@ManyToOne`
## N
## O
## P
## Q
## R
`@Repository` This annotation is used to mark a class as a repository component. Repository components are responsible for interacting with databases or other data sources, providing data access operations such as storing, retrieving, and querying data.
## S
## T
`@Table`
## U
## V
## W
## X
## Y
## Z

