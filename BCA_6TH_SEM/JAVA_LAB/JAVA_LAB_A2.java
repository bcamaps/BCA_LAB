package JAVA_LAB_A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JAVA_LAB_A2 {
    public static void main(String[] args) {
        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements in the list: ");
        
        // Create an ArrayList to hold integer values
        ArrayList<Integer> allList = new ArrayList<>();
        
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // Read the size of the list

        // Prompt user to input the elements
        System.out.println("Enter the elements in the list: ");
        for (int i = 0; i < size; i++) {
            allList.add(sc.nextInt());  // Add input values to list (Auto-boxing)
        }

        // Display the original list
        System.out.println("The list is: " + allList);

        // Check if there are enough elements to find second min and max
        if (allList.size() < 2) {
            System.out.println("Insufficient elements to find second minimum and second maximum.");
            return; // Exit the program
        }

        // Sort the list in ascending order
        Collections.sort(allList);

        // Get the second largest (second last element in sorted list)
        int secMax = allList.get(size - 2);  // Auto-unboxing

        // Get the second smallest (second element in sorted list)
        int secMin = allList.get(1);  // Auto-unboxing

        // Output results
        System.out.println("The second largest number is: " + secMax);
        System.out.println("The second minimum number is: " + secMin);
    }
}
