/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
     
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avg=Data.average(countries);
      System.out.println("Average area: " + Math.round(avg));
      System.out.println("Expected: 239950");
      System.out.println("");
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + Math.round(maxData));
      System.out.println("Expected: 513120");
      System.out.println("");
     
      //Bank Accounts
      System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = new BankAccount(176220);
      bank[1] = new BankAccount(513120);
      bank[2] = new BankAccount(30510);
      avg=Data.average(bank);
      System.out.println("Average balance: " + Math.round(avg));
      System.out.println("Expected: 239950");
      System.out.println("");
      maxData = Data.max(bank);
      System.out.println("Maximum balance: " + Math.round(maxData));
      System.out.println("Expected: 513120");
      System.out.println("");
      
      //Scores
      System.out.println("Score Data");
      Measurable[] scores = new Measurable[5];
      scores[0] = new Quiz(95);
      scores[1] = new Quiz(80);
      scores[2] = new Quiz(90);
      scores[3] = new Quiz(50);
      scores[4] = new Quiz(75);
      
      double avgScore = Data.average(scores);
      System.out.println("Average Score: " + Math.round(avgScore));
      System.out.println("Expected: 78");
      System.out.println("");
      
      double maxScore = Data.max(scores);
      System.out.println("Maximum Score: " + Math.round(maxScore));
      System.out.println("Expected: 95");
      System.out.println("");
   }
}
