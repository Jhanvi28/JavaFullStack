import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
		String maxKey = null;
        for (String key : count.keySet()) 
        {
        	//Find key that have maximum value
            if (maxKey == null || count.get(key) > count.get(maxKey)) 
            {
                maxKey = key;
            }
        }
        System.out.println("The nationality with maximum players : " + maxKey);
	}
}