package QuestionC;

import java.util.*;

public class Input {
    public static int[] Inp(int size) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }
}
