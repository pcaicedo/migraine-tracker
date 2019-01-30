package hello;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DairyController {
	
	@GetMapping("/headachediary")
	public String dairyForm(Model model) {
		HashMap<String, String> stable = new HashMap<String, String>();
		stable.put("med1", "5 ml");
		stable.put("med2", "10 ml");
		stable.put("med3", "2 ml");
		Diary history = new Diary();
		history.setStableprev(stable);
		model.addAttribute("diary", history);
		
		return "headachediary";
	}
}
