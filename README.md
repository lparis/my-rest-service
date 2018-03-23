# my-rest-service


Basic Spring-based REST service for testing stuff.

Build: `mvn clean package`

Run: `java -jar  target/my-rest-service-0.1.0.jar`

Test: `http://localhost:8080/greeting`

Result: `"Hello, World!"`

Source: https://spring.io/guides/gs/rest-service/

## Description

This is a simple REST web service that will accept HTTP GET requests at:

	http://localhost:8080/greeting

and respond with a JSON representation of a greeting:

	{"id":1,"content":"Hello, World!"}

The `id` field is a unique identifier for the greeting, and `content` is the textual representation of the greeting.

You can customize the greeting with an optional `name` parameter in the query string:

	http://localhost:8080/greeting?name=User

The name parameter value overrides the default value of "World" and is reflected in the response:

	{"id":1,"content":"Hello, User!"}

### Greeting.java

POJO that defineds the Greeting class which models the greeting representation. Greeting class has fields, constructors, and accessors for `id` and content data.

