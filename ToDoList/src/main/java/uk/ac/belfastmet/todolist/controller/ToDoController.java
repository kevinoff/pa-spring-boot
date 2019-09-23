package uk.ac.belfastmet.todolist.controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todolist.service.ToDoService;

@RequestMapping()
@Controller

public class ToDoController {
	
	Logger logger = LoggerFactory.getLogger(ToDoController.class);
	ToDoService todoservice = new ToDoService();
	
	//return home page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		
		model.addAttribute("toDoList", todoservice.getToDoList());
		
		logger.info("exit homePage");
		return "index";
	}
	
	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	public String completePage(Model model) {
		
		model.addAttribute("completedList", todoservice.getCompletedList());
		
		logger.info("exit completed page");
		return "completed";
	}
	
	@RequestMapping(value = "/incomplete", method = RequestMethod.GET)
	public String incompletePage(Model model) {
		
		model.addAttribute("incompleteList", todoservice.getIncompleteList());
		
		logger.info("exit incomplete page");
		return "incomplete";
	}

}