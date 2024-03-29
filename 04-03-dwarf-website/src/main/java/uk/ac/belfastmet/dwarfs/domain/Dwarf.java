package uk.ac.belfastmet.dwarfs.domain;

public class Dwarf {

	private String name;
	private String author;
	private String image;
	
	//constructors
	public Dwarf() {
		super();
	}
	
	//instance variables
	public Dwarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}