import java.time.LocalDate;
import java.util.Arrays;

public class Player {
	
	private String name,skill,nationality;
	private LocalDate dateOfBirth;
	private int numberOfMatches,runs,wickets;
	private double powerRating;
	public Player()
	{
		
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


	public String getName() {
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	@Override
	public String toString() {
		return "Player [name=" + name + ", skill=" + skill + ", nationality=" + nationality + ", dateOfBirth="
				+ dateOfBirth + ", numberOfMatches=" + numberOfMatches + ", runs=" + runs + ", wickets=" + wickets
				+ "]";
	}
	
	
}
