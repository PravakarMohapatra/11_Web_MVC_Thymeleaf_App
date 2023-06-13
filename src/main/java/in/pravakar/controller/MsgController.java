package in.pravakar.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to Thymeleaf Pages");
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		model.addAttribute("msg", "Good Evening....!!");
		return "index";
	}

}
