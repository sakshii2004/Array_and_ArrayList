package QuestionC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // creating object of class Input 
        Input input = new Input();

        // calling Inp function in input class
        int[] arr = input.Inp(size);

        // Converting array to arrayList
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i : arr) {
            arraylist.add(i);
        }

        System.out.println("Array converted to ArrayList: " + arraylist);

        // Converting arrayList to array 
        Integer[] array = new Integer[arraylist.size()];
        arraylist.toArray(array);

        System.out.println("ArrayList converted to Array: " + Arrays.toString(array));
    }
}
