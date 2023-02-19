import java.time.LocalDate;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Player : ");
		int n = sc.nextInt();
		List<Player> player = new ArrayList<Player>();
		List<Player> resultPlayer = new ArrayList<Player>();
		for(int i=1;i<=n;i++)
		{
			String details = sc.next();
			Player p = Player.createPlayer(details);
			player.add(p);
		}
		int ch;
		PlayerBO pb = new PlayerBO();
		do
		{
			System.out.println("Enter search type");
			System.out.println("1.By Nationality");
			System.out.println("2.By Date of Birth");
			System.out.println("3.By Power Rating");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1 : System.out.println("Enter the nationality : ");
						 String nationality = sc.next();
						 resultPlayer = pb.findPlayer(player, nationality);
						 break;
				case 2 : System.out.println("Enter the date of birth : ");
				 		 LocalDate dob = LocalDate.parse(sc.next());
						 resultPlayer = pb.findPlayer(player, dob);
				 		 break;
				case 3 : System.out.println("Enter the power rating : ");
						 double pr = sc.nextDouble();
						 resultPlayer = pb.findPlayer(player, pr);
						 break;
				default :System.out.println("Invalid Choice");
				 		 System.exit(0);			 		
			}			
				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
				for(Player p : resultPlayer)
				{
					System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n",p.getName().toString(),p.getDateOfBirth().toString(),p.getSkill().toString(),p.getNumberOfMatches(),p.getRuns(),p.getWickets(),p.getNationality().toString(),p.getPowerRating());
				}
			
			
		}
		while(ch>=1 && ch<=3);
		
	}
}
