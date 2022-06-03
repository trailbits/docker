package io.getarrays.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/")
	public String fun() {
		return "Welcome Deepak Atmaprakash";
	}
}


