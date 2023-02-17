
public class TwoWheeler extends Vehicle  
{
	
	private boolean kickStartAvailable;
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
		// TODO Auto-generated constructor stub
	}

	
	public void displayDetailInfo()
	{
		super.displayMake();
		super.displayBasicInfo();
		System.out.println("Kick Start Available : ");
		if(kickStartAvailable)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
