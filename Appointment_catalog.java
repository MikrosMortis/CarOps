import java.util.ArrayList;

public class Appointment_catalog {

	private ArrayList<Appointment> appointments=new ArrayList<Appointment>();

	public void insert(Appointment ap) {
		appointments.add(ap);
	}

	public boolean find(int ap_code) {
	
		for(int i=0;i<appointments.size();i++)
			if(appointments.get(i).getAp_code()==ap_code)
				return true;
		return false;
	}

}