import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Used to test the BlankLinesRemover class.
 */
public class InputOutputFiles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        File inputFile = null;
        while (inputFile == null) {
            System.out.print("Please enter the path to open the input file for example C:\\Downloads\\lines.txt: ");
            String inputFilePath = console.nextLine();
            inputFile = new File(inputFilePath);
            try {
                Scanner in = new Scanner(inputFile);
                PrintWriter outputFile = new PrintWriter("C:\\Users\\geckert\\Downloads\\e02\\student\\outlines.txt");
                while (in.hasNext()) {
                    String what = in.next();
                    outputFile.println(what);
                }
                in.close();
                outputFile.close();
            } catch (FileNotFoundException e) {
                System.out.println("File is not found, please try again");
                inputFile = null;
            }
        }
        console.close();
    }
}

