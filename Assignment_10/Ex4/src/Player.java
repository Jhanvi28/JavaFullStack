import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import java.util.*;

public class Player{
	
	String name,skill,nationality;
	int numberOfMatches,runs,wickets;
	double powerRating;
	LocalDate dateOfBirth;
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Player(String name,LocalDate dateOfBirth,String skill,int numberOfMatches,int runs,int wickets,String nationality,double powerRating) {
		super();
		this.name = name;
		this.skill = skill;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.powerRating = powerRating;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", skill=" + skill + ", nationality=" + nationality + ", numberOfMatches="
				+ numberOfMatches + ", runs=" + runs + ", wickets=" + wickets + ", powerRating=" + powerRating + "]";
	}
	public static Player createPlayer(String details)
	{
		String[] as = details.split(",");
		String name = as[0];
		LocalDate dateOfBirth = LocalDate.parse(as[1]);
		String skill = as[2];
		int numberOfMatches = Integer.parseInt(as[3]);
		int runs = Integer.parseInt(as[4]);
		int wickets = Integer.parseInt(as[5]);
		String nationality = as[6];
		double powerRating = Double.parseDouble(as[7]);
		return new Player(name,dateOfBirth,skill,numberOfMatches,runs,wickets,nationality,powerRating);
	}
	static Map<String, Integer> calculateNationalityCount(List<Player> list) 
	{
	    TreeMap<String, Integer> counts = new TreeMap<>();
	    //Create a TreeMap that contains nationality and count
	    for (Player player : list) 
	    {
	        String nationality = player.getNationality();
	        if (counts.containsKey(nationality)) 
	        {
	        	//Increment count by one for existing nationality
	            counts.put(nationality, counts.get(nationality) + 1);
	        } 
	        else 
	        {
	        	//Create a new nationality if not exist
	            counts.put(nationality, 1);
	        }
	    }
	    return counts;
	}
}
