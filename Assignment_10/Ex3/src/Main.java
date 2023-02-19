import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the players : ");
		int n = sc.nextInt();
		List<Player> player = new ArrayList<Player>();
		for(int i=1;i<=n;i++)
		{
			String details = sc.next();
			Player p = Player.createPlayer(details); 
			player.add(p);
			
		}
		int ch;
		do
		{
			System.out.println("Enter the type of sort : ");
			System.out.println("Sort by number of matches played");
			System.out.println("Sort by runs score");
			System.out.println("Sort by power rating");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1 : Collections.sort(player);
						 break;
				case 2 : RunComparator r = new RunComparator();
						 Collections.sort(player,r);	
						 break;
				case 3 : PowerRatingComaparator pr = new PowerRatingComaparator();
						 Collections.sort(player,pr);
						 break;
				default :break;
					
			}
			System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
			for(Player p : player)
			{
				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n",p.getName().toString(),p.getDateOfBirth().toString(),p.getSkill().toString(),p.getNumberOfMatches(),p.getRuns(),p.getWickets(),p.getNationality().toString(),p.getPowerRating());
			}
		
		}
		while(ch>=1 && ch<=3);
	}

	
}
