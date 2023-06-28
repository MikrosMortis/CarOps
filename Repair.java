import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repair {

	private Task_catalog tc;
	private Spare_part_catalog spc;
	private int duration;
	public Repair(Task_catalog tc, Spare_part_catalog spc, int duration) {
		this.tc = tc;
		this.spc = spc;
		this.duration = duration;
		System.out.println("Repair created succesfully");
	}
	
	public double getTotal_Cost() {
		
		ArrayList<Spare_part> spc_final=new ArrayList<Spare_part>();
		int i,k=0,sum_task=0;
		int n[] = {1,1,1,1,1,1,1,1,1,1};
		double sum_parts=0;
		spc.setSpare_parts(null);
		
		for(i=0;i<tc.getTasks().size();i++)
       	    sum_task=sum_task+tc.getTask(i).getCost();
		for(i=0;i<spc.getSpare_parts().size()-1;i++)
       	    if(spc.getSpare_part(i)==spc.getSpare_part(i+1))
       	    	n[k]=n[k]+1;
       	    else {
       	    	k++;
       	    	spc_final.add(spc.getSpare_part(i));
       	    }
		for(i=0;i<spc_final.size();i++)
			sum_parts=sum_parts+spc_final.get(i).getCost()*n[i];
		return sum_task+sum_parts;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
