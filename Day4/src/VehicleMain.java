import java.util.*;
public class VehicleMain{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type : ");
		int vType = sc.nextInt();
		System.out.println("Vehicle make :");
		String make = sc.next();
		System.out.println("Vehicle Number :");
		String vno = sc.next();
		System.out.println("Fuel type :");
		String ftype = sc.next();
		switch(ftype)
		{
			case "1" : System.out.println("Petrol");
					   break;
			case "2" : System.out.println("Desial");
					   break;
		}
		System.out.println("Fuel Capacity : ");
		int fc = sc.nextInt();
		System.out.println("Engine CC :");
		int cc = sc.nextInt();
		switch(vType)
		{
			case 1 :
				System.out.println("Audio System :");
				String asys = sc.next();
				System.out.println("Number of Door : ");
				int door = sc.nextInt();
				FourWheeler f = new FourWheeler(make,vno,ftype,fc,cc,asys,door);
				f.displayDetailInfo();
				break;
			case 2 :
				 System.out.println("Is kick start available: Y/N");
	             String kickStartAvailable = sc.next();    
	             TwoWheeler t1;
	             if (kickStartAvailable.toLowerCase().equals("y"))
	             {
	            	 t1 = new TwoWheeler(make,vno,ftype,fc,cc, true);
	             }	             	
	             else
	             {
	            	 t1 = new TwoWheeler(make,vno,ftype,fc,cc,false);
	             }
	             t1.displayDetailInfo();
	             break;
		}
		sc.close();
	}

}
