public class Vehicle {

	private String type;
	private String vehicle_license;
	private int brand;
	private int year;

	public Vehicle(String type, String vehicle_license, int brand, int year) {
		this.type = type;
		this.vehicle_license = vehicle_license;
		this.brand = brand;
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVehicle_license() {
		return vehicle_license;
	}

	public void setVehicle_license(String vehicle_license) {
		this.vehicle_license = vehicle_license;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
}