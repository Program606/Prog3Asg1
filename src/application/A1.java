package application;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	
	// idk if this stuff goes into the main method but we'll find out -kaydence
	
//	Scanner sc = new Scanner(System.in);
	ArrayList<Avenger> avengerList = new ArrayList<Avenger>();
	ArrayList<Avenger> cleanAvengerList = new ArrayList<Avenger>();
	
	//main method 
	public static void main(String[] args) {
		
		A1 a1  = new A1();
		a1.run();
		
	}
	
	public void run() {
		//creates a scanner object per request
		Scanner sc = new Scanner(System.in);
		System.out.println("A1.run() is running!");
		System.out.println(avengerList + "Avenger list!");

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