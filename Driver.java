package QuestionA;

import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of input elements: ");
		int size = scanner.nextInt();
		
		double[] inputArray = UserInput.takeInputArray(size);
		
		int index_even = 0;
		int index_odd = 0;
		
		double[] even = new double[size];
		double[] odd = new double[size];
		
		for (int j = 0; j < size; j++) {
			if (inputArray[j] % 2 == 0) {
				even[index_even] = inputArray[j];
				index_even++;
			}
			
			else {
				odd[index_odd] = inputArray[j];
				index_odd++;
			}
		}
		
		System.out.println("Even numbers are: ");
		for (int e = 0; e < even.length; e++) {
			System.out.println(" "+ even[e]);
		}
		
		System.out.println("Odd numbers are: ");
		for (int o = 0; o < odd.length; o++) {
			System.out.println(" "+ odd[o]);
		}
	}
}
