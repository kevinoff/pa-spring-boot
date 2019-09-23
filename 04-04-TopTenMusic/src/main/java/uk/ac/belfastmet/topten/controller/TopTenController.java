package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.topten.domain.TopTen;
import uk.ac.belfastmet.topten.service.TopTenService;

@Controller
@RequestMapping()

public class TopTenController {

	Logger logger = LoggerFactory.getLogger(TopTenController.class);
	
	//get home page
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("pageTitle", "Home");
		logger.info("got home page");
		TopTen topten = new TopTen();
		logger.info(topten.toString());
				return "index";
	}
	
	/**
	 * @param model new variable topTenAlbums set by the return of get method in topTenService.java
	 * @return album.html
	 */
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
		
	//get genre page
	@RequestMapping(value = "/genre", method = RequestMethod.GET)
	public String genrePage(Model model) {
		model.addAttribute("pageTitle", "Genre");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("topTenGenre", topTenService.getTopTenGenre());
		return "genre";
	}
}