package uk.ac.belfastmet.todolist.controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.belfastmet.todolist.service.ToDoService;

/**
 * Location of all controllers, commented with separate java docs
 * @author off12066827
 */

@RequestMapping()
@Controller

//Class start
public class ToDoController {
	
	@Autowired
	private ToDoService wiredToDoService;
	
	Logger logger = LoggerFactory.getLogger(ToDoController.class);
		
	/**
	 * Controller to populate and return index.html
	 * @return index.html
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		
		model.addAttribute("toDoList", wiredToDoService.getToDoList());
		//wiredToDoService.getNumberOfTasks();
		
		logger.info("exit homePage");
		return "index";
	}
	
	/**
	 * Controller to populate and return complete.html
	 * @return complete.html
	 */
	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	public String completePage(Model model) {
		
		model.addAttribute("completedList", wiredToDoService.getCompletedList());
		
		logger.info("exit completed page");
		return "completed";
	}
	
	/**
	 * Controller to populate and return incomplete.html
	 * @return incomplete.html
	 */
	@RequestMapping(value = "/incomplete", method = RequestMethod.GET)
	public String incompletePage(Model model) {
		
		model.addAttribute("incompleteList", wiredToDoService.getIncompleteList());
		
		logger.info("exit incomplete page");
		return "incomplete";
	}
}