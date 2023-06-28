public class Track extends Vehicle {

	private double payload;

	public Track(String type, String vehicle_license, int brand, int year, double payload) {
		super(type, vehicle_license, brand, year);
		this.payload = payload;
	}
}