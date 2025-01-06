package hello.springboot.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevelopController {
	
	@GetMapping("/develop")
	public String develop() {
		
		return "hello, develop!!";
	}
	
}
