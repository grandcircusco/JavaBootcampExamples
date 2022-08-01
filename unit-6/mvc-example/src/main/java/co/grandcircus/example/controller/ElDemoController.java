package co.grandcircus.example.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.example.model.Rectangle;

@Controller
public class ElDemoController {

	
	@RequestMapping("/el-demo")
	public String elDemo(Model model) {
		model.addAttribute("title", "Great Deal!");
		model.addAttribute("link", "/buy-now");
		
		model.addAttribute("room", "Kitchen");
		model.addAttribute("dimensions", new Rectangle(30, 25));
		
		int hourOfDay = LocalDateTime.now().getHour();
		boolean daytime = hourOfDay >= 7 && hourOfDay < 19;
		model.addAttribute("daytime", daytime);
		
		String[] pets = { "Bo", "Toto", "Dart" };
		model.addAttribute("pets", pets);
		
		List<String> bananas = Arrays.asList("One banana", "Two banana", "Three banana");
		model.addAttribute("bananas", bananas);
		
		return "el-demo";
	}
}
