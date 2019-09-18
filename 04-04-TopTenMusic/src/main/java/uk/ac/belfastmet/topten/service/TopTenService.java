package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import uk.ac.belfastmet.topten.domain.TopTen;

public class TopTenService {

	private ArrayList<TopTen> topTenSingles;
	private ArrayList<TopTen> topTenAlbums;
	
	public ArrayList<TopTen> getTopTenSingles(){
		
		this.topTenSingles = new ArrayList<TopTen>();
		
		this.topTenSingles.add(new TopTen("1. TAKE ME BACK TO LONDON", "ED SHEERAN FT STORMZY", "takemebacktolondon.png"));
		this.topTenSingles.add(new TopTen("2. TASTE (MAKE IT SHAKE)", "AITCH", "tastemakeitshake.png"));
		this.topTenSingles.add(new TopTen("3. HIGHER LOVE", "Kygo & Whitney Houston", "higherlove.png"));
		this.topTenSingles.add(new TopTen("4. LADBROKE GROVE", "AJ Tracey", "ladbrokegrove.png"));
		this.topTenSingles.add(new TopTen("5. CIRCLES", "POST MALONE", "circles.png"));
		this.topTenSingles.add(new TopTen("6. SORRY", "JOEL CORRY", "sorry.png"));
		this.topTenSingles.add(new TopTen("7. 3 NIGHTS", "DOMINIC FIKE", "threenights.png"));
		this.topTenSingles.add(new TopTen("8. RANSOM", "LIL TECCA", "ransom.png"));
		this.topTenSingles.add(new TopTen("9. STRIKE A POSE", "YOUNG T & BUGSEY FT AITCH", "strikeapose.png"));
		this.topTenSingles.add(new TopTen("10. GOODBYES", "POST MALONE FT YOUNG THUG", "goodbyes.png"));
		
		return this.topTenSingles;
	}
	
	public ArrayList<TopTen> getTopTenAlbums(){
		
		this.topTenAlbums = new ArrayList<TopTen>();
		
		this.topTenAlbums.add(new TopTen("1. HOLLYWOOD'S BLEEDING", "POST MALONE", "hollywoodsbleeding.png"));
		this.topTenAlbums.add(new TopTen("2. NO 6 COLLABORATIONS PROJECT", "ED SHEERAN", "no6collab.png"));
		this.topTenAlbums.add(new TopTen("3. AITCH2O", "AITCH", "aitch2o.png"));
		this.topTenAlbums.add(new TopTen("4. LOVER", "TAYLOR SWIFT", "lover.png"));
		this.topTenAlbums.add(new TopTen("5. DIVINELY UNINSPIRED TO A HELLISH EXTENT", "LEWIS CAPALDI", "divinelyuninspired.png"));
		this.topTenAlbums.add(new TopTen("6. BACKBONE", "STATUS QUO", "backbone.png"));
		this.topTenAlbums.add(new TopTen("7. NORMAN F**KING ROCKWELL", "LANA DEL REY", "normanf.bmp"));
		this.topTenAlbums.add(new TopTen("8. K-12", "MELANIE MARTINEZ", "k12.png"));
		this.topTenAlbums.add(new TopTen("9. SNACKS", "JAX JONES", "snacks.png"));
		this.topTenAlbums.add(new TopTen("10. WHEN WE ALL FALL ASLEEP WHERE DO WE GO", "BILLIE EILISH", "whenweallfall.png"));
				
		return this.topTenAlbums;
	}
}
