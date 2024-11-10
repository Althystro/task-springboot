package greetTask;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class GreatController {
    @GetMapping("/hello")
    String hello() {
        return "hello world boot hehehehehehhehehehhehe";
    }

    @GetMapping("/")
    String howdy() {
        return "howdy world boot ";
    }

    @GetMapping("/greet")
    @ResponseBody
    public String getName(@RequestParam String name) {
        return "Name: " + name;
    }


    @PostMapping("/farewell")
    public String farewell(@RequestBody Person person) {
        return "Goodbye, " + person.name + "\n Id: " + person.id;
    }

}



