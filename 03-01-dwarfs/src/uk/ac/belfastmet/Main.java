package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Grumpy");
		dwarfs.add("Dopey");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Bashful");
		
		System.out.println("The seven dwarfs are: ");
		for(String dwarf: dwarfs) {
			System.out.println(dwarf);
		}
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Oin");
		dwarves.add("Ori");
		dwarves.add("Gloin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		
		System.out.println("The dwarves in the company of Torin are: ");
		for(String dwarve: dwarves) {
			System.out.println(dwarve);
		}
	}
}