package co.grandcircus.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserProfileController {
	
	@RequestMapping("/user-profile")
	public String fruitOfTheDay(Model model) {
		model.addAttribute("name", "Boblo");
		model.addAttribute("state", "MI");
		return "profile";
	}

}
