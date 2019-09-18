package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.topten.service.TopTenService;

@Controller
@RequestMapping

public class TopTenController {

	@GetMapping("")
	public String homePage(Model model) {
		model.addAttribute("pageTitle", "Home");
				return "index";
	}
	
	@GetMapping("/albums")
	public String albumsPage(Model model) {
		model.addAttribute("pageTitle", "Albums");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("topTenAlbums", topTenService.getTopTenAlbums());
		return "albums";
	}
	
	@GetMapping("/singles")
	public String singlesPage(Model model) {
		model.addAttribute("pageTitle", "Singles");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("topTenSingles", topTenService.getTopTenSingles());
		return "singles";
	}
	
}