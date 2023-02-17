
public class Vehicle {
	
	protected String make,vehicleNumber,fuelType;
	protected int fuelCapacity,cc;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc)
	{
		this.make = make; 
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public void displayMake()
	{
		System.out.println("***"+make+"***");
	}
	public void displayBasicInfo()
	{
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number : "+vehicleNumber);
		System.out.println("Fuel Type : ");
		System.out.println("1.Petrol");
		System.out.println("2.Desial");
		System.out.println("fuelCapacity : "+fuelCapacity);
		System.out.println("Engine CC : "+cc);
	}
	public void displayDetailInfo()
	{
		
	}
	
	
}
