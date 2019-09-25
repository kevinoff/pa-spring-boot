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

/**
 * class to populate data that the controller asks for
 * @author off12066827
 */
@Service
public class ToDoService {
	
	//giving ToDoService.java access to data from TaskRepository.java
	@Autowired
	private TaskRepository taskRepository;
	
	Logger logger = LoggerFactory.getLogger(ToDoService.class);
	
	Task task = new Task();
	private ArrayList<Task> toDoList;
	private ArrayList<Task> completedList;
	private ArrayList<Task> incompleteList;
	
	/**
	 * log no. of tasks from taskRepository
	 */
	public void getNumberOfTasks() {
		
		logger.info("no. of tasks: {}", taskRepository.count());
	}
	
	/**
	 * populate to do list
	 * @return array list of tasks
	 */
	public ArrayList<Task> getToDoList(){

		this.toDoList = new ArrayList<Task>();

		Iterable <Task> tasks = taskRepository.findAll();
		Iterator <Task> iterator = tasks.iterator();
		/**
		 * iterate through iteratable and log data as a string
		 */
		logger.info("before while");
		while(iterator.hasNext()) {

			this.toDoList.add(iterator.next());		
			logger.info("end of while");
		}
		
		//sort ascending before return
		//Collections.sort(this.toDoList, Task.sortByPriority);
		
		logger.debug("toDoList: " + this.toDoList);
		logger.info("exit getToDoList");
		logger.info("{}" + this.toDoList);
		return this.toDoList;		
	}
	
	/**
	 * loop until true and add the current object to new array list.
	 * @return array list of completed tasks
	 */
	public ArrayList<Task> getCompletedList(){
		
		getToDoList();
		this.completedList = new ArrayList<Task>();
		
//	broken by sql boolean type
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
		
//	broken by sql boolean type
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