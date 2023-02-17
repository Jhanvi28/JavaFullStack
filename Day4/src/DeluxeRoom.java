
public class DeluxeRoom extends HotelRoom {

	protected int ratePerSqFeet;
	DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet = 10;
	}
	public int getRatePerSqFeet()
	{
		if(this.hasWifi)
		{
			return (this.ratePerSqFeet = this.ratePerSqFeet+ 2);
		}
		return this.ratePerSqFeet;
	}

}
