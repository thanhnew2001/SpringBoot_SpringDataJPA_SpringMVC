package rmit.rmitsb.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello MVC";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello(@RequestParam String person){
        return "Hi " + person;
    }

    @RequestMapping(value = "/hi/{person}", method = RequestMethod.GET)
    public String hello2(@PathVariable String person){
        return "Hi " + person;
    }
}


