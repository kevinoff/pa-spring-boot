package uk.ac.belfastmet.todolist.domain;

import java.util.Comparator;

public class ToDo {

	private String nameOfTask;
	private String descOfTask;
	private String taskEndDate;
	private String ownership;
	private Boolean taskStatusBool;
	private int priority;
	
	public static Comparator<ToDo> sortByPriority = new Comparator<ToDo>() {

		@Override
		public int compare(ToDo obj1, ToDo obj2) {
			// sort by ascending
			return obj1.priority-obj2.priority;
	}};
	
	//constructor
	public ToDo() {
		super();
	}
	
	//instance variables
	public ToDo(int priority, String nameOfTask, String descOfTask, String taskEndDate, boolean taskStatusBool, String ownership) {
		super();
		this.priority = priority;
		this.nameOfTask = nameOfTask;
		this.descOfTask = descOfTask;
		this.taskEndDate = taskEndDate;
		this.taskStatusBool = taskStatusBool;
		this.ownership = ownership;
	}
	
	
	//getters and setters
	public String getNameOfTask() {
		return nameOfTask;
	}
	public void setNameOfTask(String nameOfTask) {
		this.nameOfTask = nameOfTask;
	}
	public String getDescOfTask() {
		return descOfTask;
	}
	public void setDescOfTask(String descOfTask) {
		this.descOfTask = descOfTask;
	}
	public String getTaskEndDate() {
		return taskEndDate;
	}
	public void setTaskEndDate(String taskEndDate) {
		this.taskEndDate = taskEndDate;
	}
	public boolean isTaskStatusBool() {
		return taskStatusBool;
	}
	public void setTaskStatusBool(boolean taskStatusBool) {
		this.taskStatusBool = taskStatusBool;
	}
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
	
}
