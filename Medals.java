import java.util.ArrayList;

public class Medals
{
   public static void main(String[] args) {
	   
	   ArrayList<ArrayList<String>> my_list = new ArrayList();
	   
	   ArrayList<String> country_list = new ArrayList();
	   country_list.add("      Country");
	   country_list.add("       Canada");
	   country_list.add("        Italy");
	   country_list.add("      Germany");
	   country_list.add("        Japan");
	   country_list.add("   Kazakhstan");
	   country_list.add("       Russia");
	   country_list.add("  South Korea");
	   country_list.add("United States");
	   country_list.add("       Totals");
	   
	   ArrayList<String> gold_list = new ArrayList();
	   gold_list.add("      Gold");
	   gold_list.add("         0");
	   gold_list.add("         0");
	   gold_list.add("         0");
	   gold_list.add("         1");
	   gold_list.add("         0");
	   gold_list.add("         3");
	   gold_list.add("         0");
	   gold_list.add("         1");
	   gold_list.add("         5");
	   
	   ArrayList<String> silver_list = new ArrayList();
	   silver_list.add("      Silver");
	   silver_list.add("           3");
	   silver_list.add("           0");
	   silver_list.add("           0");
	   silver_list.add("           0");
	   silver_list.add("           0");
	   silver_list.add("           1");
	   silver_list.add("           1");
	   silver_list.add("           0");
	   silver_list.add("           5");
	   
	   ArrayList<String> bronze_list = new ArrayList();
	   bronze_list.add("      Bronze");
	   bronze_list.add("           0");
	   bronze_list.add("           1");
	   bronze_list.add("           1");
	   bronze_list.add("           0");
	   bronze_list.add("           1");
	   bronze_list.add("           1");
	   bronze_list.add("           0");
	   bronze_list.add("           1");
	   bronze_list.add("           5");

			   
	   ArrayList<String> total_list = new ArrayList();
	   total_list.add("      Total");
	   total_list.add("          3");
	   total_list.add("          1");
	   total_list.add("          1");
	   total_list.add("          1");
	   total_list.add("          1");
	   total_list.add("          5");
	   total_list.add("          1");
	   total_list.add("          2");
	   total_list.add("         15");
	   

	   
	   my_list.add(country_list);
	   my_list.add(gold_list);
	   my_list.add(silver_list);
	   my_list.add(bronze_list);
	   my_list.add(total_list);
	   
	   
	   System.out.println(my_list.get(0).get(0) + my_list.get(1).get(0) + my_list.get(2).get(0) + my_list.get(3).get(0) + my_list.get(4).get(0));
	   System.out.println(my_list.get(0).get(1) + my_list.get(1).get(1) + my_list.get(2).get(1) + my_list.get(3).get(1) + my_list.get(4).get(1));
	   System.out.println(my_list.get(0).get(2) + my_list.get(1).get(2) + my_list.get(2).get(2) + my_list.get(3).get(2) + my_list.get(4).get(2));
	   System.out.println(my_list.get(0).get(3) + my_list.get(1).get(3) + my_list.get(2).get(3) + my_list.get(3).get(3) + my_list.get(4).get(3));
	   System.out.println(my_list.get(0).get(4) + my_list.get(1).get(4) + my_list.get(2).get(4) + my_list.get(3).get(4) + my_list.get(4).get(4));
	   System.out.println(my_list.get(0).get(5) + my_list.get(1).get(5) + my_list.get(2).get(5) + my_list.get(3).get(5) + my_list.get(4).get(5));
	   System.out.println(my_list.get(0).get(6) + my_list.get(1).get(6) + my_list.get(2).get(6) + my_list.get(3).get(6) + my_list.get(4).get(6));
	   System.out.println(my_list.get(0).get(7) + my_list.get(1).get(7) + my_list.get(2).get(7) + my_list.get(3).get(7) + my_list.get(4).get(7));
	   System.out.println(my_list.get(0).get(8) + my_list.get(1).get(8) + my_list.get(2).get(8) + my_list.get(3).get(8) + my_list.get(4).get(8));
	   System.out.println(my_list.get(0).get(9) + my_list.get(1).get(9) + my_list.get(2).get(9) + my_list.get(3).get(9) + my_list.get(4).get(9)); 
       
    }
}