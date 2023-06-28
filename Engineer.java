import java.util.ArrayList;

public class Engineer extends Employees {

	ArrayList<Task> tasks=new ArrayList<Task>();
	
	public Engineer(String name) {
		super(name);
	}

	public void addTask(Task t) {
		tasks.add(t);
	}

}