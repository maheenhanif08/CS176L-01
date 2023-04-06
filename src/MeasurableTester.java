import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeasurableTester {
	
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 150;
	
	public static void main(String[] args) {
     
	  //Countries
	  //System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      double avg = Data.average(countries);
      double maxData = Data.max(countries);
      double minData = Data.min(countries);
      /*
      System.out.println("Average area: " + Math.round(avg));
      System.out.println("Expected: 239950");
      System.out.println("");
      
      System.out.println("Maximum area: " + Math.round(maxData));
      System.out.println("Expected: 513120");
      System.out.println("");
      
      System.out.println("Minimum Score: " + Math.round(minData));
      System.out.println("Expected: 30510");
      System.out.println("");
      */
     
      //Bank Accounts
      //System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = new BankAccount(176220);
      bank[1] = new BankAccount(513120);
      bank[2] = new BankAccount(30510);
      
      avg=Data.average(bank);
      maxData = Data.max(bank);
      minData = Data.min(bank);
      
      /*
      System.out.println("Average balance: " + Math.round(avg));
      System.out.println("Expected: 239950");
      System.out.println("");
      
      System.out.println("Maximum balance: " + Math.round(maxData));
      System.out.println("Expected: 513120");
      System.out.println("");
      
      System.out.println("Minimum Score: " + Math.round(minData));
      System.out.println("Expected: 30510");
      System.out.println("");
      */
      
      //Scores
      //System.out.println("Score Data");
      Measurable[] scores = new Measurable[5];
      scores[0] = new Quiz(95);
      scores[1] = new Quiz(80);
      scores[2] = new Quiz(90);
      scores[3] = new Quiz(50);
      scores[4] = new Quiz(75);
      
      double avgScore = Data.average(scores);
      double maxScore = Data.max(scores);
      double minScore = Data.min(scores);
     /*
      System.out.println("Average Score: " + Math.round(avgScore));
      System.out.println("Expected: 78");
      System.out.println("");      
      
      System.out.println("Maximum Score: " + Math.round(maxScore));
      System.out.println("Expected: 95");
      System.out.println("");      
      
      System.out.println("Minimum Score: " + Math.round(minScore));
      System.out.println("Expected: 50");
      System.out.println("");
      */
      
      //--------------------------------------------------------------------------------------------------
      
      //get user input
      Scanner s = new Scanner(System.in);
      System.out.print("Enter mertric to use, 1 for maximum, 2 for minimum, 3 for average: ");
      int userInput = s.nextInt();
      
      String metricToUse="average";
      if (userInput == 1) {metricToUse = "Maximum";}
      if (userInput == 2) {metricToUse = "Minimum";}
      if (userInput == 3) {metricToUse = "Average";}
      
      //create frame and panel objs
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      frame.add(panel);
      
      //get the 3 buttons
      JButton button1 = new JButton("Get " + metricToUse + " Balance");
      JButton button2 = new JButton("Get " + metricToUse + " Area");
      JButton button3 = new JButton("Get " + metricToUse + " Score");
      
      ActionListener listener1 = new Listener(bank, metricToUse);
      ActionListener listener2 = new Listener(countries, metricToUse);
      ActionListener listener3 = new Listener(scores, metricToUse);

      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      
      button1.addActionListener(listener1);
      button2.addActionListener(listener2);
      button3.addActionListener(listener3);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

   }
}
