
public class myMicrowave {
	int time = 0;
	int level = 0;

	public myMicrowave() {
		level = 1;
		time = 0;
	}
	public void time() {
		this.time = this.time + 30;
		System.out.println("Time Button was pressed. Time is " + time + " seconds");
	}
	
	public void power() {
		if(level == 2) 
			level = 1;
		else 
			level = 2;
		System.out.println("Power Button was pressed. Power level is " + level);
	}
	public void reset() {
		level = 1;
		time = 0;
		System.out.println("Reset button was pressed. Power level is 1. Time is 0 seconds.");
	}
	
	public void start() {
		System.out.println("Cooking for " + time + " seconds at level " + level+ ".");
	}

}
