import java.util.ArrayList;

public class Repair_file {

	private int rf_code;
	private int duration;
	private double total_cost;
	private ArrayList<Task> tasks;
	public Repair_file(int rf_code, int duration, double total_cost, ArrayList<Task> tasks) {
		this.rf_code = rf_code;
		this.duration = duration;
		this.total_cost = total_cost;
		this.tasks = tasks;
	}
	public int getRf_code() {
		return rf_code;
	}
	public void setRf_code(int rf_code) {
		this.rf_code = rf_code;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	public ArrayList<Task> getTasks() {
		return tasks;
	}
	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	
}