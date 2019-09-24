package uk.ac.belfastmet.todolist.domain;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * class holding all properties, make objects of this
 * @author off12066827
 */

@Entity
@Table(name = "task")

public class Task {
	
	private long id;

	private String nameOfTask;
	private String descOfTask;
	private String taskEndDate;
	private String ownership;
	//private Boolean taskStatusBool;
	private String priority;
	
	//getters and setters for Id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
//	public static Comparator<Task> sortByPriority = new Comparator<Task>() {
//	@Override
//	public int compare(Task obj1, Task obj2) {
//		// sort
//		return obj1.priority-obj2.priority;
//	}};
	
	//constructor
	public Task() {
		super();
	}
	
	//instance variables
	public Task(String priority, String nameOfTask, String descOfTask, String taskEndDate, boolean taskStatusBool, String ownership) {
		super();
		this.priority = priority;
		this.nameOfTask = nameOfTask;
		this.descOfTask = descOfTask;
		this.taskEndDate = taskEndDate;
		//this.taskStatusBool = taskStatusBool;
		this.ownership = ownership;
	}
	
	/**getters and setters mapped to mysql
	 */
	@Column(name = "name")
	public String getNameOfTask() {
		return nameOfTask;
	}
	public void setNameOfTask(String nameOfTask) {
		this.nameOfTask = nameOfTask;
	}
	
	@Column(name = "description")
	public String getDescOfTask() {
		return descOfTask;
	}
	public void setDescOfTask(String descOfTask) {
		this.descOfTask = descOfTask;
	}
	
//	@Column(name = "task_end_date")
//	public String getTaskEndDate() {
//		return taskEndDate;
//	}
//	public void setTaskEndDate(String taskEndDate) {
//		this.taskEndDate = taskEndDate;
//	}
	
//	@Column(name = "task_status_bool")
//	public boolean isTaskStatusBool() {
//		return taskStatusBool;
//	}
//	public void setTaskStatusBool(boolean taskStatusBool) {
//		this.taskStatusBool = taskStatusBool;
//	}
	
	@Column(name = "user")
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
}