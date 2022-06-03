package io.getarrays.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("/")
	public String run() {
		return "SpringBoot is running succesfully DAP"; 
	}
}
