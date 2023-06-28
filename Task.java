public class Task {

	private String name;
	private int cost;
	private double hours=0;

	public Task(String name,int cost) {
		this.name = name;
		this.cost=cost;
		System.out.println("Task created succesfully");
	}

	public int getCost() {
		return this.cost;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHours(double h) {
		this.hours=h;
	}

}