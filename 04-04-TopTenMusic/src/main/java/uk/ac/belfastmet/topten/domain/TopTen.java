package uk.ac.belfastmet.topten.domain;

public class TopTen {

	private String title;
	private String artist;
	private String image;
	
	//constructor
	public TopTen() {
		super();
	}
	
	//instance variables
	public TopTen(String title, String artist, String image) {
		super();
		this.title = title;
		this.artist = artist;
		this.image = image;
	}
	
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}