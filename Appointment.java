public class Appointment {

	private int ap_code;
	private int customer_code;
	private int vehicle_code;
	private String hour;
	private String date;
	
	public Appointment(int ap_code, int customer_code, int vehicle_code, String hour, String date) {
		this.ap_code = ap_code;
		this.customer_code = customer_code;
		this.vehicle_code = vehicle_code;
		this.hour = hour;
		this.date = date;
	}

	public int getAp_code() {
		return ap_code;
	}

	public void setAp_code(int ap_code) {
		this.ap_code = ap_code;
	}

	public int getCustomer_code() {
		return customer_code;
	}

	public void setCustomer_code(int customer_code) {
		this.customer_code = customer_code;
	}

	public int getVehicle_code() {
		return vehicle_code;
	}

	public void setVehicle_code(int vehicle_code) {
		this.vehicle_code = vehicle_code;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}