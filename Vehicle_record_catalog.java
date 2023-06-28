import java.util.ArrayList;

public class Vehicle_record_catalog {

	private ArrayList<Vehicle_record> vehicle_records=new ArrayList<Vehicle_record>();

	public void insert(Vehicle_record vr) {
          vehicle_records.add(vr);
	}

	public boolean find(String V_L) {

		for(int i=0;i<vehicle_records.size();i++)
			if(vehicle_records.get(i).getVehicle_license()==V_L)
				return true;
		return false;
	}

}