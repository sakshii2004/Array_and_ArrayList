package QuestionA;

import java.util.Scanner;

public class UserInput {
	
	static double[] takeInputArray(int len) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter all the elements of the array: ");
		double[] array = new double[len];
		for (int i = 0; i<len; i++) {
			array[i] = scanner.nextInt();
		}		
		return array;
	}
	

}
