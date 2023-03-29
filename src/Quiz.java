
public class Quiz implements Measurable {

	private int score;
	
	public Quiz(int score){
		this.score = score;
	}
	
	
	
	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		return score;
	}

}
