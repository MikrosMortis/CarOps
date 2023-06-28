public class Vehicle_record extends Record {

	private String type;
	private String vehicle_license;
	private String brand;
	private int year;
	public Vehicle_record(String type, String vehicle_license, String brand, int year) {
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}