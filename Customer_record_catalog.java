import java.util.ArrayList;

public class Customer_record_catalog {

	private ArrayList<Customer_record> customer_records=new ArrayList<Customer_record>();

	public void insert(Customer_record cr) {
		 customer_records.add(cr);
	}

	public boolean find(int code) {
		
		for(int i=0;i<customer_records.size();i++)
			if(customer_records.get(i).getCode()==code)
				return true;
		return false;
	}

}