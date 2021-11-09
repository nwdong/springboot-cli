# Demo Spring Boot CommandLineRunner

# To run

Firstly, to open terminal and making sure JAVA_HOME is set to JDK11

then run below command in terminal

```
// w/o parameters
mvnw spring-boot:run

// w/ paramters
mvnw spring-boot:run -Dspring-boot.run.arguments="arg1,arg2"
```

# code

## pom.xml
dependencies
- spring-boot-starter

## CommandLineRunner interface

Both CliComponent1.java and CliComponent2.java implement CommandLineRunner.

CommandLineRunner is a simple Spring Boot interface with a run method. 

SpringBoot will automatically call the run method of all beans implementing this interface after the application context has been loaded.

The calling is in order

## args

In CliComponent1.java, args passed in will be printed out

```
// per below command, args[0] is "arg1,arg2"
mvnw spring-boot:run -Dspring-boot.run.arguments="arg1,arg2"
```
