package src;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Avenger> avengerList = new ArrayList<Avenger>();
	ArrayList<Avenger> cleanAvengerList = new ArrayList<Avenger>();
	public void run() {
		
	}
	
	public void read() {
		//Like in Lab Input is removing discrepencies
		//Side note, might not need cleanNames method or AvengerList??
	}
	
	public void cleanNames(ArrayList<Avenger> avengerList){
		for(Avenger person: avengerList) {
			person.getHeroName().toLowerCase().trim().replaceAll("'", "");
			
			for(int i=0;i<person.getHeroName().length();i++) {
				if(Character.isDigit(person.getHeroName().charAt(i))) {
					//REMOVING DIGITS OR PUNCTUATION
				}
			}
			cleanAvengerList.add(person);
		}
		
	}
	public void nameCheck() {
		boolean nameExists = false;
		
		//MAKE ENHANCED FOR LOOP
		if(nameExists) {
			//update counters
		}else {
			//create Avenger object, add to List
			//create Counters/update
		}
		
	}
}
