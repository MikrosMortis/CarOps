public class Spare_part {

	private double cost;
	private String name;
	private int code;
	
	public Spare_part(double cost, String name, int code) {
		this.cost = cost;
		this.name = name;
		this.code = code;
		System.out.println("Spare part created succesfully");
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}