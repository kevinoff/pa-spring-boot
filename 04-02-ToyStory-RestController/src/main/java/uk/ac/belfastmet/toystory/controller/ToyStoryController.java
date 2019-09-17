package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystory")

public class ToyStoryController {

	
	@GetMapping("")
	public String home() {
		return "Toy Story movie characters home page";
	}
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by Tom Hanks";
	}
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz was played by Tim Allen";
	}
}
