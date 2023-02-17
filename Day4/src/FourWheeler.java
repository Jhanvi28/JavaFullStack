
public class FourWheeler extends Vehicle {

	private String audioSystem;
	private int numberOfDoor;
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,String audioSystem,int numberOfDoor) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
		this.audioSystem = audioSystem;
		this.numberOfDoor = numberOfDoor;
		
	}
	
	public void displayDetailInfo()
	{	
		super.displayMake();
		super.displayBasicInfo();
		System.out.println("---Detail Information---");
		System.out.println("Audio System : "+audioSystem);
		System.out.println("Number of Doors : "+numberOfDoor);
	}
}
