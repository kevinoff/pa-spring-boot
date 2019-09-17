package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		dwarfs.add(happy);
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		dwarfs.add(doc);
		//etc
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolkien");
		dwarfs.add(thorin);
		Dwarf balin = new Dwarf();
		balin.setName("Balin");
		balin.setAuthor("Tolkien");
		dwarfs.add(balin);
		Dwarf dwalin = new Dwarf();
		dwalin.setName("Dwalin");
		dwalin.setAuthor("Tolkien");
		dwarfs.add(dwalin);
		//etc
		
		System.out.println("The Disney dwarfs are: ");
		for(Dwarf dwarf: dwarfs) {
			if(dwarf.getAuthor() == "Disney") {
				System.out.println(dwarf.getName());
			}
		}		
		System.out.println("The Tolkien dwarves are: ");
		for(Dwarf dwarf: dwarfs) {
			if(dwarf.getAuthor() == "Tolkien") {
				System.out.println(dwarf.getName());
			}
		}
		
		
	}
}