import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
		Map<String,Integer> count = Player.calculateNationalityCount(player);
		System.out.format("%-15s %s\n","Country","Count");
		count.forEach((key, value) ->System.out.format("%-15s %s\n",key,value));
			

	}

}
