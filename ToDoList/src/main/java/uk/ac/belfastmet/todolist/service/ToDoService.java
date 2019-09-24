package uk.ac.belfastmet.todolist.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todolist.domain.Task;
import uk.ac.belfastmet.todolist.repository.TaskRepository;

@Service
public class ToDoService {
	
	//giving ToDoService.java access to data from TaskRepository.java
	@Autowired
	private TaskRepository taskRepository;
	
	Logger logger = LoggerFactory.getLogger(ToDoService.class);
	
	Task todo = new Task();
	private ArrayList<Task> toDoList;
	private ArrayList<Task> completedList;
	private ArrayList<Task> incompleteList;
	
	//test method
	public void getNumberOfTasks() {
		
		logger.info("no. of tasks: {}", taskRepository.count());
	}
	
	public ArrayList<Task> getToDoList(){
		
		this.toDoList = new ArrayList<Task>();
		
		 //templates of new objects by type and name
		 //this.toDoList = (new ToDo(priority, "nameOfTask", "descOfTask", "taskEndDate", taskStatusBool, "ownership"));
		 //this.toDoList = (new ToDo(int, String, String String, Boolean, String));
		 
//		this.toDoList.add(new Task(2, "Design", "design doc for client", "2019-09-25", false, "Kevin"));
//		this.toDoList.add(new Task(1, "Requirements", "gather requirements from client", "2019-09-24", true, "Kevin"));
//		this.toDoList.add(new Task(3, "Develop", "development process", "2019-09-30", false, "Kevin"));
//		this.toDoList.add(new Task(4, "Testing", "testing prototype", "2019-10-02", false, "Kevin"));
//		this.toDoList.add(new Task(5, "Release", "first release", "2019-10-05", false, "Kevin"));
		
		Iterable <Task> tasks = taskRepository.findAll();
		Iterator <Task> iterator = tasks.iterator();
		while(iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
		}
		
		//sort ascending before return
		//Collections.sort(this.toDoList, Task.sortByPriority);
		
		logger.debug("toDoList: " + this.toDoList);
		logger.info("exit getToDoList");
		return this.toDoList;		
	}
	
	/**
	 * loop until true and add the current object to new array list.
	 * @return array list of completed tasks
	 */
	public ArrayList<Task> getCompletedList(){
		
		getToDoList();
		this.completedList = new ArrayList<Task>();
		
//		broken by sql boolean
//		for(Task loopPosition:this.toDoList) {
//			if(loopPosition.isTaskStatusBool() == true) {
//				
//				this.completedList.add(loopPosition);
//			}
//		}
		logger.debug("getCompletedList: " + this.completedList);
		logger.info("exit getCompletedList");
		return this.completedList;
	}
	
	/**
	 * loop until false and add the current object to new array list.
	 * @return array list of incomplete tasks
	 */
	public ArrayList<Task> getIncompleteList(){

		getToDoList();
		this.incompleteList = new ArrayList<Task>();
		
//		BROKEN BY SQL BOOLEAN
//		for(Task loopPosition:this.toDoList) {
//			if(loopPosition.isTaskStatusBool() == false) {
//				logger.info("inside if for task bool");
//				this.incompleteList.add(loopPosition);
//			}
//		}
		logger.debug("getIncompleteList: " + this.incompleteList);
		logger.info("exit getCompletedList");
		return this.incompleteList;
	}
}
