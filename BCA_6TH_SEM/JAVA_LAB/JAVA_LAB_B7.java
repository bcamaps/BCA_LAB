package JAVA_LAB_B7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class JAVA_LAB_B7 {
    public static void main(String[] args) {
        // LinkedList to store user elements
        LinkedList<Integer> firstList = new LinkedList<>();
        LinkedList<Integer> secondList; // Used for comparison
        Scanner in = new Scanner(System.in); // For user input
        char choice; // Menu choice
        int num, pos, fpos, spos; // Variables for positions and number input

        // Infinite loop until user exits
        do {
            // Display menu options
            System.out.println("********** MENU **********");
            System.out.println("a. Insert an Element");
            System.out.println("b. Swap Elements");
            System.out.println("c. Iterate in Reverse");
            System.out.println("d. Compare the two LinkedLists");
            System.out.println("e. Convert to ArrayList");
            System.out.println("x. Exit");
            System.out.print("Enter your Choice: ");
            choice = in.next().toLowerCase().charAt(0); // Get user's choice as lowercase char

            switch (choice) {
                case 'a':
                    // Insert element at specified position
                    if (firstList.size() > 0) {
                        System.out.println("Elements in the List: " + firstList);
                    } else {
                        System.out.println("List is Empty");
                    }

                    System.out.println("Enter the Position: ");
                    pos = in.nextInt();

                    // Check for valid position
                    if (pos <= 0) {
                        System.out.println("Enter a positive number!!");
                    } else if ((firstList.size() > 0 && pos <= firstList.size() + 1) || pos == 1) {
                        System.out.print("Enter a number: ");
                        num = in.nextInt();
                        firstList.add(pos - 1, num); // Insert at (pos - 1) because list is 0-indexed
                        System.out.println("Element " + num + " inserted at position " + pos);
                    } else {
                        System.out.println("Enter the proper Position!!!!");
                    }
                    break;

                case 'b':
                    // Swap two elements in the list
                    System.out.println("Original List: " + firstList);
                    System.out.println("Enter the positions of elements to be swapped");
                    System.out.print("Enter First Element position: ");
                    fpos = in.nextInt();
                    System.out.print("Enter Second Element position: ");
                    spos = in.nextInt();

                    // Validate positions
                    if (fpos <= 0 || spos <= 0) {
                        System.out.println("Error!! Enter Positive values!!");
                    } else if (fpos > firstList.size() || spos > firstList.size()) {
                        System.out.println("Error!! Enter Proper values!!");
                    } else {
                        // Perform swap
                        int f = firstList.get(fpos - 1);
                        int s = firstList.get(spos - 1);
                        firstList.set(fpos - 1, s);
                        firstList.set(spos - 1, f);
                        System.out.println("Elements Swapped Successfully!!");
                        System.out.println("The List after swapping: " + firstList);
                    }
                    break;

                case 'c':
                    // Display reversed list using descendingIterator and reverse the list
                    System.out.println("Given Original List: " + firstList);
                    System.out.print("Reversed List [ ");
                    for (Iterator<Integer> it = firstList.descendingIterator(); it.hasNext(); ) {
                        System.out.print(it.next() + " ");
                    }
                    System.out.println("]");
                    Collections.reverse(firstList); // Reverse the list in place
                    System.out.println("Reversed List: " + firstList);
                    break;

                case 'd':
                    // Compare list with its reversed version
                    secondList = new LinkedList<>(firstList); // Copy of first list
                    Collections.reverse(secondList); // Reverse the copy
                    if (firstList.equals(secondList)) {
                        System.out.println("Lists are equal!!!");
                    } else {
                        System.out.println("Lists are NOT equal!!!");
                    }
                    break;

                case 'e':
                    // Convert LinkedList to ArrayList
                    ArrayList<Integer> alist = new ArrayList<>(firstList);
                    System.out.println("Elements in the ArrayList: " + alist);
                    break;

                case 'x':
                    // Exit the program
                    System.out.println("Thank You!!! Quitting from Menu!!!!!");
                    in.close(); // Close scanner
                    System.exit(0); // Exit
                    break;

                default:
                    // Invalid option
                    System.out.println("Wrong choice!!! Try again!!");
            }
        } while (true); // Keep looping until user exits
    }
}
