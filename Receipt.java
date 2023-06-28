import java.util.ArrayList;

public class Receipt {

	private int duration;
	private double total_cost;
	private ArrayList<Task> tasks;
	public Receipt(int duration, double total_cost, ArrayList<Task> tasks) {
		this.duration = duration;
		this.total_cost = total_cost;
		this.tasks = tasks;
	}
}