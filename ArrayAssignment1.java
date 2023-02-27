import java.util.Arrays;

public class ArrayAssignment1 {
	
	public static void main(String[] args) {
		
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double size = values.length;
		
		for(double d: values) {
			System.out.print(d);
			System.out.print(" ");
		}
		System.out.println();
		
		Arrays.sort(values);
		double num = values[(int) (size-1)];
		System.out.println("The largest element in the array is " + num);
		
		int negatives = 0;
		for(double d=0; d < values.length; d++) {
			if (values[(int) d] < 0) {
				negatives++;
			}
		}
		System.out.println("There are " + negatives + " negative numbers in the array");
		
		
		
	}

	
}
