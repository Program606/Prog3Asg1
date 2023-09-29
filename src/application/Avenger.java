package application;

public class Avenger implements Comparable<Avenger>{
	private String heroAlias;
	private String heroName;
	private String performer;
	private int nameFreq;
	private int aliasFreq;
	private int performerFreq;
	
	public int getAliasFreq() {
		return aliasFreq;
	}
	public void setAliasFreq(int aliasFreq) {
		this.aliasFreq = aliasFreq;
	}
	public String getHeroAlias() {
		return heroAlias;
	}
	public void setHeroAlias(String heroAlias) {
		this.heroAlias = heroAlias;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getPerformer() {
		return performer;
	}
	public void setPerformer(String performer) {
		this.performer = performer;
	}
	public int getNameFreq() {
		return nameFreq;
	}
	public void setNameFreq(int nameFreq) {
		this.nameFreq = nameFreq;
	}
	public int getPerformerFreq() {
		return performerFreq;
	}
	public void setPerformerFreq(int performerFreq) {
		this.performerFreq = performerFreq;
	}
	
	//STILL TESTING
	@Override
	public int compareTo(Avenger o) {
		// TODO Auto-generated method stub
		//This where we break ties
		return 0;
	}
	
	//STILL TESTING
	public boolean equals(Avenger o) {
		return false;
		
	}
	
	//STILL TESTING
	public String toString() {
		return getHeroAlias() + " aka " + getHeroName() + 
				" performed by " + getPerformer() + "mentioned "
				+ "(n: " + getNameFreq() + " a: " + getAliasFreq()
				+ "p: " + getPerformerFreq()+" )" + "time(s)";
		
	}
	
}
