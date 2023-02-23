import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		System.out.println("Would you like to process donations now? (enter ‘Yes’ to continue): ");
		Scanner sc = new Scanner(System.in);
		
		if(!sc.nextLine().equalsIgnoreCase("Yes")){
			System.out.println("Ending now without processing donations");
			while(!sc.nextLine().equals ("Yes")){
				break;
			}
		}
		
		else {
			Donations d = new Donations();
		}
		File inputFile = new File("Donations.txt");
		Scanner sc2 = new Scanner(inputFile);
		Donations d = new Donations();
		while(sc2.hasNextLine())
		{
			String what = sc2.nextLine();
			
			if (what.contains("EOF")) {
				break;
			}
			else {
				String[] line = what.split(">");
				
				if(line[0].contains("individual")) {
					d.processDonation("individual", Integer.parseInt(line[1]));
				}
				
				else if(line[0].contains("business")) {
					d.processDonation("business", Integer.parseInt(line[1]));
				}
				
				else if (line[0].contains("other")) {
					d.processDonation("other", Integer.parseInt(line[1]));
			
				}

			}
		}
		d.getStatistics();	
	}

}
