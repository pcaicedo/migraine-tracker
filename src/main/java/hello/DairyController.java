package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DairyController {
	
	@GetMapping("/headachediary")
	public String dairyForm(Model model) {
		model.addAttribute("diary", new Diary());
	
		return "headachediary";
	}
}
