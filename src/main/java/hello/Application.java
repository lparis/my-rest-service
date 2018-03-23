// Application class creates a standalone application in an executable JAR file with Java main() method.

package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation that embeds Tomcat servlet container as the HTTP runtime.
@SpringBootApplication
public class Application {

    // The main() method uses SpringApplication.run() method to launch the web app.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}