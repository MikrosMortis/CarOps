import java.util.ArrayList;

public class Spare_part_catalog {

	private ArrayList<Spare_part> spare_parts=new ArrayList<Spare_part>();

	public Spare_part getSpare_part(int x) {
		return spare_parts.get(x);
	}

	public void setSpare_parts(Spare_part s_p) {
		spare_parts.add(s_p);
	}

	public ArrayList<Spare_part> getSpare_parts() {
		return spare_parts;
	}
}