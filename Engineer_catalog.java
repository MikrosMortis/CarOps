import java.util.ArrayList;

public class Engineer_catalog {

	private ArrayList<Engineer> engineers;

	public ArrayList<String> getNames() {
        ArrayList<String> names=new ArrayList<String>();
		
		for(int i=0;i<engineers.size();i++)
		    names.add(engineers.get(i).getName());
		
		return names;
	}

}