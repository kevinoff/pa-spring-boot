package uk.ac.belfastmet.todolist.domain;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.todolist.service.ToDoService;

/**
 * class holding all properties, make objects of this
 * @author off12066827
 */

@Entity
@Table(name = "task")

public class Task {
	
	Logger logger = LoggerFactory.getLogger(ToDoService.class);
	
	private long id;

	private String nameOfTask;
	private String descOfTask;
	private String taskEndDate;
	private String ownership;
	private String taskStatus;
	private String priority;
	
//type conflict with mysql
//	public static Comparator<Task> sortByPriority = new Comparator<Task>() {
//	@Override
//	public int compare(Task obj1, Task obj2) {
//		// sort
//		return obj1.priority-obj2.priority;
//	}};
	
	/**
	 * constructor no parameters
	 * @param string 
	 */
	public Task() {
		super();
	}
	
	/**]
	 * constructor
	 * @param priority
	 * @param nameOfTask
	 * @param descOfTask
	 * @param taskEndDate
	 * @param taskStatus
	 * @param ownership
	 */
	public Task(String priority, String nameOfTask, String descOfTask, String taskEndDate, String taskStatus, String ownership) {
		super();
		this.priority = priority;
		this.nameOfTask = nameOfTask;
		this.descOfTask = descOfTask;
		this.taskEndDate = taskEndDate;
		this.taskStatus = taskStatus;
		this.ownership = ownership;
	}
	
	public String toString() {
		logger.info("inside toString");
		return priority + nameOfTask + descOfTask + taskEndDate + taskStatus + ownership;
	}
	
	/**
	 * get ID
	 * @return id int
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	/**
	 * set ID
	 * @param id int
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * get task name
	 * @return nameOfTask String
	 */
	@Column(name = "name")
	public String getNameOfTask() {
		return nameOfTask;
	}
	/**
	 * set task name
	 * @param nameOfTask String
	 */
	public void setNameOfTask(String nameOfTask) {
		this.nameOfTask = nameOfTask;
	}
	
	/**
	 * get description
	 * @return descOfTask String
	 */
	@Column(name = "description")
	public String getDescOfTask() {
		return descOfTask;
	}
	/**
	 * set description
	 * @param descOfTask String
	 */
	public void setDescOfTask(String descOfTask) {
		this.descOfTask = descOfTask;
	}
	
	/**
	 * get ownership
	 * @return ownership String
	 */
	@Column(name = "user")
	public String getOwnership() {
		return ownership;
	}
	/**
	 * set ownership
	 * @param ownership String
	 */
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	/**
	 * get priority as String
	 * @return priority String
	 */
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}
	/**
	 * set priority
	 * @param priority String
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	@Column(name = "task_end_date")
	public String getTaskEndDate() {
		return taskEndDate;
	}
	public void setTaskEndDate(String taskEndDate) {
		this.taskEndDate = taskEndDate;
	}
	
	@Column(name = "task_status")
	public String isTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
}