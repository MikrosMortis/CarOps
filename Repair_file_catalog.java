import java.util.ArrayList;

public class Repair_file_catalog {

	private ArrayList<Repair_file> repair_files;

	public void insert(Repair_file rf) {
		repair_files.add(rf);
	}

	public boolean find(int rfc) {
		
		for(int i=0;i<repair_files.size();i++)
			if(repair_files.get(i).getRf_code()==rfc)
				return true;
		return false;
	}

}