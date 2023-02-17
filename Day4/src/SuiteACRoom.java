
public class SuiteACRoom extends HotelRoom{

	private int ratePerSqFeet;
	SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet()
	{
		if(this.hasWifi)
		{
			this.ratePerSqFeet = this.ratePerSqFeet + 2;
		}
		return this.ratePerSqFeet;
	}

}
