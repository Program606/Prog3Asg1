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
	private int totalWordCount = 0;
	private Scanner input = new Scanner(System.in);
	private ArrayList<Avenger> avengersArrayList = new ArrayList<>();
	
	//main method 
	public static void main(String[] args) {
		
		A1 a1  = new A1();
		a1.run();
		
	}
	
	public void run() {
		loadData(avengerRoster, avengersArrayList);
		readInput(avengersArrayList);
		
		for(Avenger o: avengersArrayList) {
			System.out.println(o);
		}
		printResults();
		System.out.println("A1.run() is running!");
		

	}
	
	private void loadData(String[][] AvengerRoster, ArrayList<Avenger>avengersArrayList) {
		String heroAlias;
		String heroName;
		String performer;
		
		for(int i=0; i < AvengerRoster.length;i++) {
			for(int j=0; j < AvengerRoster[i].length;j+= 3) {
				
				heroAlias = AvengerRoster[i][0];
				heroName = AvengerRoster[i][1];
				performer = AvengerRoster[i][2];
				
				Avenger avenger = new Avenger(heroAlias,heroName,performer);
				avengersArrayList.add(avenger);
			}
		}
		
	}

	public void readInput(ArrayList<Avenger> avengersArrayList) {
		String line = null;
		ArrayList<String >allWordsInput = new ArrayList<String>();
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
		System.out.println("Please enter info");
		line = input.nextLine();
		
		while(line != null) {
			//can be a method called cleanNames
			line = line.trim().toLowerCase().replaceAll("'", "");
			
			//Can be a method called count();
			String tokens[] = line.split(" ");
			
			for(int i=0; i < tokens.length;i++) {
				//Create a method right here that checks if name is correctly spelled/ no errors
		
				allWordsInput.add(tokens[i]);
			}
//			System.out.println(allWordsInput);
			
			for(String e: allWordsInput) {
				for(Avenger o: avengersArrayList) {
					if(e.equals(o.getHeroAlias())) {
						o.setAliasFreq(o.getAliasFreq() + 1);
						
					}else if(e.equals(o.getHeroName())) {
						o.setNameFreq(o.getNameFreq() + 1);
						
					}else if(e.equals(o.getPerformer())) {
						o.setPerformerFreq(o.getPerformerFreq() + 1);
					}
				}
			}
			break;
//			line = input.nextLine();
		}
		input.close();
		System.out.println("Reached The bottom");
	}
	
	public void printResults() {
		/*
		 * Make sure your format matches the sample output exactly. 
		 * No extra empty lines, or text. Use the diff command to check if your output matches the sample outputs.
		 */
		System.out.println("Total number of words: " + totalWordCount);
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
	public void cleanNames(){
		
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
