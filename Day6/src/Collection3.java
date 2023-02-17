import java.util.ArrayList;
import java.util.Scanner;

public class Collection3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> playersIPL14=new ArrayList<>();
		ArrayList<String> playersIPL15=new ArrayList<>();
		
		
		System.out.println("Enter the top 5 scorers of IPL Season 14");
		for(int i=1;i<=5;i++)
			playersIPL14.add(sc.nextLine().toLowerCase().trim());
		
		System.out.println("Enter the top 5 scorers of IPL Season 15");
		for(int i=1;i<=5;i++)
			playersIPL15.add(sc.nextLine().toLowerCase().trim());
		System.out.println("Consistent Scorer/es");		
		playersIPL15.retainAll(playersIPL14);
		
		for(String playerIPL15:playersIPL15)
		{
			System.out.println(playerIPL15);
		}
		
		
	}
}
