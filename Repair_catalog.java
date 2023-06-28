import java.util.ArrayList;

public class Repair_catalog {

	private ArrayList<Repair> repairs=new ArrayList<Repair>();

	public Repair getRepair(int x) {
		return repairs.get(x);
	}
	
	public ArrayList<Repair> getRepairs() {
		return this.repairs;
	}

	public void setRepairs(Repair r) {
		repairs.add(r);
	}	
}
