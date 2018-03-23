// GreetingController handles incomding HTTP requests and repsponds with greetings.
// GreetingController handles GET requests for /greeting by returning a new instance of the Greeting class.

package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController annotation identifies the controller component.
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method
    // @RequestMapping(method=GET)
    @RequestMapping("/greeting")
    // @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method. 
    // This query string parameter is optional; if absent in the request, the defaultValue "World" is used.
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}