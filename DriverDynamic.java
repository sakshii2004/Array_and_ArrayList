package QuestionA;

import java.io.*;
import java.util.*;

public class DriverDynamic {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of input elements: ");
		int size = scanner.nextInt();
		
		double[] inputArray = UserInput.takeInputArray(size);
		
		ArrayList<Double> odd = new ArrayList<Double>();
		ArrayList<Double> even = new ArrayList<Double>();

		
		for (int j = 0; j < size; j++) {
			if (inputArray[j] % 2 == 0) {
				even.add(inputArray[j]);
			}
			
			else {
				odd.add(inputArray[j]);
			}
		}
		
		System.out.println("Even numbers are: ");
		for (int e = 0; e < even.size(); e++) {
			System.out.println(" "+ even.get(e));
		}
		
		System.out.println("Odd numbers are: ");
		for (int o = 0; o < odd.size(); o++) {
			System.out.println(" "+ odd.get(o));
		}
	}
}
