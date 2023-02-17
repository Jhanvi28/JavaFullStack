
public class HotelRoom {
	
	private String hotelName;
	private int numberOfSqFeet;
	boolean hasTV,hasWifi;
	
	HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
	{
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	public int calculateTariff(int costPerSqFeets)
	{
		return this.numberOfSqFeet*costPerSqFeets;
	}
	public int getRatePerSqFeet()
	{
		return 0;
	}
}
