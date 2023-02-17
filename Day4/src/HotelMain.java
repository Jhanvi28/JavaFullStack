import java.util.*;
public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1.Deluxe Room");
		System.out.println("2.Deluxe AC Room");
		System.out.println("3.Suite AC Room");
		System.out.println("Select Room Type :");
		int ch = sc.nextInt();
		System.out.println("Hotel Name : ");
		String name = sc.next();
		System.out.println("Room Square Feet Area : ");
		int rateSqFeet = sc.nextInt();
		System.out.println("Room has TV(yes/no) : ");
		boolean hasTv = sc.next().equals("yes")? true : false;
		System.out.println("Room hase WiFi (yes/no) : ");
		boolean hasWifi = sc.next().equals("yes")? true : false;
		int t = 0;
		
		switch(ch)
		{
			case 1:	DeluxeRoom d = new DeluxeRoom(name,rateSqFeet,hasTv,hasWifi);
					t = d.calculateTariff(d.getRatePerSqFeet());
					break;
			case 2: DeluxeACRoom da = new DeluxeACRoom(name,rateSqFeet,hasTv,hasWifi);
					t = da.calculateTariff(da.getRatePerSqFeet());
					break;
			case 3: SuiteACRoom s = new SuiteACRoom(name,rateSqFeet,hasTv,hasWifi);
                	t = s.calculateTariff(s.getRatePerSqFeet());
                	break;
		}
		System.out.println("Room Tariff  per day is:"+t);
	}

}
