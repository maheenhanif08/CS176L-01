import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the cost per square foot: ");
		double cost_per_sq_foot =  sc.nextDouble();
			
		System.out.print("Please enter the length of the house: ");
		double length_of_house = sc.nextDouble();
			
		System.out.print("Please enter the width of the house: ");
		double width_of_house = sc.nextDouble();
			
		System.out.print("Please enter the height of the house: ");
		double height_of_house = sc.nextDouble();

		System.out.print("Please enter the number of windows: ");
		int number_of_windows = sc.nextInt();
			
		System.out.print("Please enter the length of a window: ");
		double length_of_window = sc.nextDouble();

		System.out.print("Please enter the width of a window: ");
		double width_of_window = sc.nextDouble();
			
		System.out.print("Please enter the number of doors: ");
		int number_of_doors = sc.nextInt();
			
		System.out.print("Please enter the length of a door: ");
		double length_of_door = sc.nextDouble();
			
		System.out.print("Please enter the width of a door: ");
		double width_of_door = sc.nextDouble();

			
		double area_of_walls = (2 * length_of_house * width_of_house) + ((2 * length_of_house * width_of_house) + (length_of_house *(height_of_house - width_of_house)));
		double area_of_windows = number_of_windows * length_of_window * width_of_window;
		double area_of_doors = number_of_doors * length_of_door * width_of_door;
		double total_feet = area_of_walls - (area_of_windows + area_of_doors);
		double total_cost = total_feet * cost_per_sq_foot;
			
			
		System.out.println("Your total paintable surface area is " + total_feet + " square feet.");
		System.out.println("Your estimate is " + total_cost + " dollars.");
		
		
		

	}
	
}
