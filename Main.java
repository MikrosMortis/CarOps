import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int i=0;
		
		Task  r1= new Task("Oil Change",20);
		Task  r2= new Task("Cab Filter Change",5);
		Task  r3= new Task("Maintance of Brakes",30);
		
		Task_catalog t_c=new Task_catalog();
		 t_c.setTasks(r1);
		 t_c.setTasks(r2);
		 t_c.setTasks(r3);
	 
	     
         Spare_part p1=new Spare_part(30,"Backage of Oils 4lt",1);
         Spare_part p2=new Spare_part(20,"Oil filter",2);
         Spare_part p3=new Spare_part(30,"Camping Filter",3);
         Spare_part p4=new Spare_part(5,"Front Wheel Brake Pad",4);
         Spare_part p5=new Spare_part(5,"Rear Wheel Brake Pad",5);
         Spare_part p6=new Spare_part(10,"Brake Fluid",6);  
         
         Spare_part_catalog s_p_t=new Spare_part_catalog();

         s_p_t.setSpare_parts(p1);
         s_p_t.setSpare_parts(p2);
         s_p_t.setSpare_parts(p3);
         s_p_t.setSpare_parts(p4);
         s_p_t.setSpare_parts(p5);
         s_p_t.setSpare_parts(p6);
         
         //Gia prwth episkeui
         Task_catalog t_cfor1=new Task_catalog();
         
         t_cfor1.setTasks(t_c.getTask(0));
         t_cfor1.setTasks(t_c.getTask(1));
         
         Spare_part_catalog s_p_tfor1=new Spare_part_catalog();
         
         s_p_tfor1.setSpare_parts(s_p_t.getSpare_part(0));
         s_p_tfor1.setSpare_parts(s_p_t.getSpare_part(1));
         s_p_tfor1.setSpare_parts(s_p_t.getSpare_part(2));
         
         Repair r_r1=new Repair(t_cfor1,s_p_tfor1,1);
         
         //Gia deuteri episkeui
         Task_catalog t_cfor2=new Task_catalog();
         
         t_cfor2.setTasks(t_c.getTask(2));
         
         Spare_part_catalog s_p_tfor2=new Spare_part_catalog();
     
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(3));
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(3));
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(3));
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(3));
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(4));
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(4));
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(4));
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(4));
         s_p_tfor2.setSpare_parts(s_p_t.getSpare_part(5));
         
         Repair r_r2=new Repair(t_cfor2,s_p_tfor2,2);
         
         Repair_catalog r_r=new Repair_catalog();
         
         r_r.setRepairs(r_r1);
         r_r.setRepairs(r_r2);
         
         for(i=0;i<t_c.getTasks().size();i++)
        	 System.out.println("For task "+(i+1)+": Name- "+t_c.getTask(i).getName()+" Cost- "+t_c.getTask(i).getCost());
         System.out.println("------------------");
         for(i=0;i<s_p_t.getSpare_parts().size();i++)
        	 System.out.println("For spare_part "+(i+1)+": Name- "+s_p_t.getSpare_part(i).getName()+" Cost- "+s_p_t.getSpare_part(i).getCost());
         System.out.println("------------------");
         for(i=0;i<r_r.getRepairs().size();i++)
        	 System.out.println("For repair "+(i+1)+": Duration- "+r_r.getRepair(i).getDuration()+" Cost- "+r_r.getRepair(i).getTotal_Cost());
}}
