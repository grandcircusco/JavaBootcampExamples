package co.grandcircus.example.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddDemoController {
	
	@RequestMapping("/time")
	public String showTime(Model model) {
		String currentTime = new SimpleDateFormat("h:mm aa")
.format(new Date());
		
		model.addAttribute("time", currentTime);
		return "time";
	}
	
	@RequestMapping("/add-form")
	public String showAddForm() {
		return "addition-form";
	}
	
	@RequestMapping("/add-result")
	public String showAddResult(
@RequestParam("num1") int num1,
@RequestParam("num2") int num2,
Model model) {
		int result = num1 + num2;
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("result", result);
		return "addition-result";
	}
}
