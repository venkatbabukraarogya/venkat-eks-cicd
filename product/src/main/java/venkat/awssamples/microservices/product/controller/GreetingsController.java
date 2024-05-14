package venkat.awssamples.microservices.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/greet")
public class GreetingsController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String sayHello() {
        return "Hello from Product Service";
    }

}
