import java.util.*;
public class Main {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the Team : ");
		String teamName = sc.next();
		int ch;
		Team t = new Team();
		do
		{
			System.out.println("1.Add Player");
			System.out.println("2.Delete Player");
			System.out.println("3.Display Player");
			System.out.println("4.Exit");
			System.out.println("Enter your choice :" );
			ch = sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the details of player in CSV format : ");
						
				String info = sc.next();
						Player p = Player.createPlayer(info);
						t.addPlayerToTeam(p);
						System.out.println("Player successfully added");
						break;
				case 2:	System.out.println("Enter the name of the player to the deleted : ");
						boolean playerName = t.removePlayerFromTeams(sc.next());
						if(playerName)
						{
							System.out.println("Player successfully deleted");
						}
						else
						{
							System.out.println("Player not found in the team");
						}
						break;
				case 3:	t.displayPlayers();
						break;
				case 4: System.exit(0);
						break;
			}
		}
		while(ch>=1 && ch<=4);
	}
}
