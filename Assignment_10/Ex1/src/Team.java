import java.util.*;

public class Team  

{
	private String name;
	private List<Player> playerList = new ArrayList<Player>();
	public Team()
	{
		
	}
	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}	
	public void addPlayerToTeam(Player player)
	{
		this.playerList.add(player);
	}
	public Boolean removePlayerFromTeams(String name)
	{
		for(int i=0;i<this.playerList.size();i++)
		{
			if(this.playerList.get(i).getName().equals(name))
			{
				this.playerList.remove(i);
				return true;
			}
		}
		return false;
	}
	public void displayPlayers()
	{	
		System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
		for(Player player : this.playerList)
		{
			System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n",player.getName().toString(),player.getDateOfBirth().toString(),player.getSkill().toString(),player.getNumberOfMatches(),player.getRuns(),player.getWickets(),player.getNationality().toString(),player.getPowerRating());
		}
	}
}
