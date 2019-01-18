package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting1")
    public String greetingForm(Model model) {
        /*Greeting g = new Greeting();
        g.setContent("Something");
        g.setId(999);
    	model.addAttribute("greeting", g);*/
    	model.addAttribute("greeting", new Greeting());
        return "greeting1";
    }

    @PostMapping("/greeting1")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        System.out.println(greeting.getContent());
    	return "result";
    }
}