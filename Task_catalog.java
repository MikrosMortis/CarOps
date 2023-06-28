import java.util.ArrayList;

public class Task_catalog {

	private ArrayList<Task> tasks=new ArrayList<Task>();

	public Task getTask(int x) {
		return tasks.get(x);
	}
  
	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Task r) {
		tasks.add(r);
	}

	public ArrayList<String> getNames() {
		ArrayList<String> names=new ArrayList<String>();
		
		for(int i=0;i<tasks.size();i++)
		    names.add(tasks.get(i).getName());
		
		return names;	
	}

}