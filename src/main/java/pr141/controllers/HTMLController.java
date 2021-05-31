package pr141.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HTMLController {
    @GetMapping("/home")
    public String getHtml(){
        return "home";
    }
}
