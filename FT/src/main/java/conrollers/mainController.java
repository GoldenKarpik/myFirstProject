package conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "myname");
        return "home";
    }

}