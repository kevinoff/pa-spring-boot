package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.topten.service.TopTenService;

@Controller
@RequestMapping()

public class TopTenController {

	//get home page
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("pageTitle", "Home");
				return "index";
	}
	
	//get albums page
	@RequestMapping(value = "/albums", method = RequestMethod.GET)
	public String albumsPage(Model model) {
		model.addAttribute("pageTitle", "Albums");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("topTenAlbums", topTenService.getTopTenAlbums());
		return "albums";
	}
	
	//get singles page
	@RequestMapping(value = "/singles", method = RequestMethod.GET)
	public String singlesPage(Model model) {
		model.addAttribute("pageTitle", "Singles");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("topTenSingles", topTenService.getTopTenSingles());
		return "singles";
	}
}