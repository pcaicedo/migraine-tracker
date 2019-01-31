package hello;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DairyController {
	
	@GetMapping("/headachediary")
	public String dairyForm(Model model) {
		Diary diary = new Diary();
		HashMap<String, String> stable = new HashMap<String, String>();
		HashMap<String, String> newmed = new HashMap<String, String>();
		List<String> months = new ArrayList<String>(); 
		
		stable.put("med1", "5 ml");
		stable.put("med2", "10 ml");
		stable.put("med3", "2 ml");

		newmed.put("med4", "6 mg");
		newmed.put("med5", "2 mg");
				
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("Jun");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		diary.setStableprev(stable);
		diary.setNewprev(newmed);
		diary.setMonth(months);
	
		model.addAttribute("diaryform", diary);
		
		return "headachediary";
	}
	
	@PostMapping("/headachediary")
	public String diaryformSubmit(@ModelAttribute Diary diary)
	{
		System.out.println(diary.getMonth());
		return "sendform";
	}
}
