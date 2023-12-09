package dat3.MetteKera.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        // return a simple message or data
        return "Alexander's backend";
    }
}
