
public class Donations {
	int numIndividual;
	double amtIndividual;
	int numBusiness;
	double amtBusiness;
	int numOther;
	double amtOther;
	
	public void processDonation(String c, double d) {
		
		if(c.equals("individual")) {
			if(d > 0) {
				numIndividual += 1;
				amtIndividual += d;
			}
			
			else {
				numIndividual -= 1;
				amtIndividual += d;
			}
		}
		else if(c.equals("business")) {
			if (d > 0) {
				numBusiness += 1;
				amtBusiness += d;
			}
			else {
				numBusiness -= 1;
				amtBusiness += d;
			}
			
		}
		else if(c.equals("other")) {
			if(d > 0) {
				numOther += 1;
				amtOther += d;
			}
			else {
				numOther -= 1;
				amtOther += d;
			}
		}
	}
	public void getStatistics() {         
		System.out.println("Individual: #:" + numIndividual + " $" + amtIndividual);
		System.out.println("Business: #:" + numBusiness + " $" + amtBusiness);
		System.out.println("Other: #:" + numOther + " $" + amtOther);                         
		
	}

}
