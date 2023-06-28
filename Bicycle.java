public class Bicycle extends Vehicle {

	private double displacement;

	public Bicycle(String type, String vehicle_license, int brand, int year, double displacement) {
		super(type, vehicle_license, brand, year);
		this.displacement = displacement;
	}
}