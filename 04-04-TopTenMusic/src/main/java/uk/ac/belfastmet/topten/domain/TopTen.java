package uk.ac.belfastmet.topten.domain;

public class TopTen {

	private String position;
	private String title;
	private String artist;
	private String image;
	
	//constructor
	public TopTen() {
		super();
	}
	
	//instance variables
	/**
	 * 
	 * @param position The chart position
	 * @param title Song or Album title
	 * @param artist Song or Album title
	 * @param image artwork belonging to song or album
	 */
	
	public TopTen(String position, String title, String artist, String image) {
		super();
		this.position = position;
		this.title = title;
		this.artist = artist;
		this.image = image;
	}

	public String toString() {
		return position + " " + title + " " + artist;
	}
	
	//getters and setters
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
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