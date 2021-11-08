# Demo Spring Boot CommandLineRunner

# To run

Firstly, to open terminal and making sure JAVA_HOME is set to JDK11

then run below command in terminal

```
mvnw spring-boot:run
```

# code

## pom.xml
dependencies
- spring-boot-starter

## CliComponent1.java and CliComponent2.java
Both of them implements CommandLineRunner.

CommandLineRunner is a simple Spring Boot interface with a run method. 

SpringBoot will automatically call the run method of all beans implementing this interface after the application context has been loaded.

The calling is in order