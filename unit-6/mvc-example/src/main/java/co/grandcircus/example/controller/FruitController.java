package co.grandcircus.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruitController {
	
	@RequestMapping("/fotd")
	public String fruitOfTheDay(Model model) {
		model.addAttribute("daily", "Cherry");
		return "fruit";
	}

}
