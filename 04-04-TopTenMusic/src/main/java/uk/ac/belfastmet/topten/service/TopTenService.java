package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import uk.ac.belfastmet.topten.domain.TopTen;

public class TopTenService {

	private ArrayList<TopTen> topTenSingles;
	private ArrayList<TopTen> topTenAlbums;
	private ArrayList<TopTen> topTenGenre;
	
	//method to populate an array list with title, artist and image for singles
	public ArrayList<TopTen> getTopTenSingles(){
		
		//take this scope of topTenSingles and create a new array list of type TopTen
		this.topTenSingles = new ArrayList<TopTen>();
		
		//take this scope and add new object of TopTen with 3 variables
		this.topTenSingles.add(new TopTen("1", "TAKE ME BACK TO LONDON", "ED SHEERAN FT STORMZY", "takemebacktolondon.png"));
		this.topTenSingles.add(new TopTen("2", "TASTE (MAKE IT SHAKE)", "AITCH", "tastemakeitshake.png"));
		this.topTenSingles.add(new TopTen("3", "HIGHER LOVE", "Kygo & Whitney Houston", "higherlove.png"));
		this.topTenSingles.add(new TopTen("4", "LADBROKE GROVE", "AJ Tracey", "ladbrokegrove.png"));
		this.topTenSingles.add(new TopTen("5", "CIRCLES", "POST MALONE", "circles.png"));
		this.topTenSingles.add(new TopTen("6", "SORRY", "JOEL CORRY", "sorry.png"));
		this.topTenSingles.add(new TopTen("7", "3 NIGHTS", "DOMINIC FIKE", "threenights.png"));
		this.topTenSingles.add(new TopTen("8", "RANSOM", "LIL TECCA", "ransom.png"));
		this.topTenSingles.add(new TopTen("9", "STRIKE A POSE", "YOUNG T & BUGSEY FT AITCH", "strikeapose.png"));
		this.topTenSingles.add(new TopTen("10", "GOODBYES", "POST MALONE FT YOUNG THUG", "goodbyes.png"));
		
		return this.topTenSingles;
	}
	
	//same as above but for albums
	public ArrayList<TopTen> getTopTenAlbums(){
		
		this.topTenAlbums = new ArrayList<TopTen>();
		this.topTenAlbums.add(new TopTen("1","HOLLYWOOD'S BLEEDING", "POST MALONE", "hollywoodsbleeding.png"));
		this.topTenAlbums.add(new TopTen("2", "NO 6 COLLABORATIONS PROJECT", "ED SHEERAN", "no6collab.png"));
		this.topTenAlbums.add(new TopTen("3", "AITCH2O", "AITCH", "aitch2o.png"));
		this.topTenAlbums.add(new TopTen("4", "LOVER", "TAYLOR SWIFT", "lover.png"));
		this.topTenAlbums.add(new TopTen("5", "DIVINELY UNINSPIRED TO A HELLISH EXTENT", "LEWIS CAPALDI", "divinelyuninspired.png"));
		this.topTenAlbums.add(new TopTen("6", "BACKBONE", "STATUS QUO", "backbone.png"));
		this.topTenAlbums.add(new TopTen("7", "NORMAN F**KING ROCKWELL", "LANA DEL REY", "normanf.bmp"));
		this.topTenAlbums.add(new TopTen("8", "K-12", "MELANIE MARTINEZ", "k12.png"));
		this.topTenAlbums.add(new TopTen("9", "SNACKS", "JAX JONES", "snacks.png"));
		this.topTenAlbums.add(new TopTen("10", "WHEN WE ALL FALL ASLEEP WHERE DO WE GO", "BILLIE EILISH", "whenweallfall.png"));
		
		return this.topTenAlbums;
	}
	
	//same as above but for albums
	public ArrayList<TopTen> getTopTenGenre(){
		
		this.topTenGenre = new ArrayList<TopTen>();
		this.topTenGenre.add(new TopTen("1","HEAVY METAL", "", "hmetal.jpg"));
		this.topTenGenre.add(new TopTen("2", "ROCK N' ROLL", "", "rocknroll.jpg"));
		this.topTenGenre.add(new TopTen("3", "ALTERNATIVE", "", "alternative.jpg"));
		this.topTenGenre.add(new TopTen("4", "HARD ROCK", "", "hardrock.jpg"));
		this.topTenGenre.add(new TopTen("5", "CLASSICAL", "", "classical.jpg"));
		this.topTenGenre.add(new TopTen("6", "THRASH METAL", "", "tmetal.jpg"));
		this.topTenGenre.add(new TopTen("7", "POP", "", "pop.jpg"));
		this.topTenGenre.add(new TopTen("8", "PROGRESSIVE ROCK", "", "prock.jpg"));
		this.topTenGenre.add(new TopTen("9", "RAP", "", "rap.jpg"));
		this.topTenGenre.add(new TopTen("10", "PUNK ROCK", "", "punrock.jpg"));
		
		return this.topTenGenre;
	}
}
