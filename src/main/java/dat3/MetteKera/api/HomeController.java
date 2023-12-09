@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // return the name of the view (HTML or template file)
        return "index"; 
    }
}
