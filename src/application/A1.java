package application;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	
	public String[][] avengerRoster = { { "captainamerica", "rogers", "evans" }, { "ironman", "stark", "downey" },
			{ "blackwidow", "romanoff", "johansson" }, { "hulk", "banner", "ruffalo" },
			{ "blackpanther", "tchalla", "boseman" }, { "thor", "odinson", "hemsworth" },
			{ "hawkeye", "barton", "renner" }, { "warmachine", "rhodes", "cheadle" },
			{ "spiderman", "parker", "holland" }, { "wintersoldier", "barnes", "stan" } };
	
	private int topN = 4;
	private Scanner input = new Scanner(System.in);
	private int totalwordcount = 0;
	private ArrayList<Avenger> avengersArrayList = new ArrayList<>();
	
	//might not need this we'll see 
	ArrayList<Avenger> cleanAvengerList = new ArrayList<Avenger>();
	
	//main method 
	public static void main(String[] args) {
		
		A1 a1  = new A1();
		a1.run();
		
	}
	
	public void run() {
		readInput();
		printResults();
		System.out.println("A1.run() is running!");
		

	}
	
	public void readInput() {
		//Like in Lab Input is removing discrepencies
		//Side note, might not need cleanNames method or AvengerList??
		
		/*
		In a loop, while the scanner object has not reached end of stream,
		 	- read a word.
		 	- clean up the word
		    - if the word is not empty, add the word count. 
		    - Check if the word is either an avenger alias or last name, or performer last name then
				- Create a new avenger object with the corresponding alias and last name and performer last name.
				- if this avenger has already been mentioned, increase the corresponding frequency count for the object already in the list.
				- if this avenger has not been mentioned before, add the newly created avenger to the list, remember to update the corresponding frequency.
		*/ 
	}
	
	public void printResults() {
		/*
		 * Make sure your format matches the sample output exactly. 
		 * No extra empty lines, or text. Use the diff command to check if your output matches the sample outputs.
		 */
		System.out.println("Total number of words: " + totalwordcount);
		System.out.println("Number of Avengers Mentioned: " + avengersArrayList.size());
		System.out.println();

		// Print all ordered by appearance
		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input
		// Make sure you follow the formatting example in the sample output
		System.out.println();

		// Print all ordered by AvengerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the topN most popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		System.out.println();

		// Print top n ordered by AvengerPerformerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular performers:");
		// Todo: Print the topN most popular performers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output	
		System.out.println();

		// Print all ordered by alias alphabetically
		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		// Make sure you follow the formatting example in the sample output
		System.out.println();
	}
	
	
	//EVERYTHING BELOW HERE NEEDS TO BE RELOOKED AT
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
