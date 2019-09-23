package uk.ac.belfastmet.todolist.service;

import java.util.ArrayList;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.todolist.domain.ToDo;

public class ToDoService {
	
	Logger logger = LoggerFactory.getLogger(ToDoService.class);
	
	ToDo todo = new ToDo();
	private ArrayList<ToDo> toDoList;
	private ArrayList<ToDo> completedList;
	private ArrayList<ToDo> incompleteList;
	
	public ArrayList<ToDo> getToDoList(){
		logger.info("enter getToDoList");
		
		this.toDoList = new ArrayList<ToDo>();
		
		//this.toDoList = (new ToDo(priority, "nameOfTask", "descOfTask", "taskEndDate", taskStatusBool, "ownership"));
		//this.toDoList = (new ToDo(int, String, String String, Boolean, String));
		this.toDoList.add(new ToDo(2, "Design", "design doc for client", "2019-09-25", false, "Kevin"));
		this.toDoList.add(new ToDo(1, "Requirements", "gather requirements from client", "2019-09-24", true, "Kevin"));
		this.toDoList.add(new ToDo(3, "Develop", "development process", "2019-09-30", false, "Kevin"));
		this.toDoList.add(new ToDo(4, "Testing", "testing prototype", "2019-10-02", false, "Kevin"));
		this.toDoList.add(new ToDo(5, "Release", "first release", "2019-10-05", false, "Kevin"));
		
		//sort ascending before return
		Collections.sort(this.toDoList, ToDo.sortByPriority);
		
		logger.info("exit getToDoList");
		return this.toDoList;		
	}
	
	//return objects from toDoList with Status set to true
	public ArrayList<ToDo> getCompletedList(){
		logger.info("enter getCompletedList");
		getToDoList();
		this.completedList = new ArrayList<ToDo>();
		
		for(ToDo loopPosition:this.toDoList) {
		
			if(loopPosition.isTaskStatusBool() == true) {
				
				this.completedList.add(loopPosition);
			}
		}
		logger.info("exit getCompletedList");
		return this.completedList;
	}
	
	//return objects from toDoList with Status set to false
	public ArrayList<ToDo> getIncompleteList(){
		logger.info("enter getCompletedList");
		getToDoList();
		this.incompleteList = new ArrayList<ToDo>();
		
		for(ToDo loopPosition:this.toDoList) {
			if(loopPosition.isTaskStatusBool() == false) {
				logger.info("inside if for task bool");
				this.incompleteList.add(loopPosition);
			}
		}
		logger.info("exit getCompletedList");
		return this.incompleteList;
	}
}
