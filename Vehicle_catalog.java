import java.util.ArrayList;

public class Vehicle_catalog {

	private ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();

	public void insert(Vehicle v) {
		vehicles.add(v);
	}

	public boolean find(String V_L) {
		
		for(int i=0;i<vehicles.size();i++)
			if(vehicles.get(i).getVehicle_license()==V_L)
				return true;
		return false;
	}

}