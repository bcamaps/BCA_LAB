package JAVA_LAB_A3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JAVA_LAB_A3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // List to store integers
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Add elements");
            System.out.println("2. Sort elements");
            System.out.println("3. Replace an element");
            System.out.println("4. Remove an element");
            System.out.println("5. Display all elements");
            System.out.println("6. Add an element between two elements");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            // Validate if user input is a number
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Discard invalid input
                continue; // Restart the loop
            }

            int choice = scanner.nextInt(); // Get user's menu choice

            switch (choice) {
                case 1:
                    // Add element to the list
                    System.out.print("Enter the element to add: ");
                    if (scanner.hasNextInt()) {
                        int elementToAdd = scanner.nextInt();
                        arrayList.add(elementToAdd);
                        System.out.println("Element added successfully.");
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next(); // Discard invalid input
                    }
                    break;

                case 2:
                    // Sort the list in ascending order
                    Collections.sort(arrayList);
                    System.out.println("Elements sorted successfully.");
                    break;

                case 3:
                    // Replace element at specific index
                    System.out.print("Enter the index of the element to replace: ");
                    if (scanner.hasNextInt()) {
                        int index = scanner.nextInt();
                        if (index >= 0 && index < arrayList.size()) {
                            System.out.print("Enter the new element: ");
                            if (scanner.hasNextInt()) {
                                int newElement = scanner.nextInt();
                                arrayList.set(index, newElement); // Replace element
                                System.out.println("Element replaced successfully.");
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                scanner.next(); // Discard invalid input
                            }
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next(); // Discard invalid input
                    }
                    break;

                case 4:
                    // Remove element at specific index
                    System.out.print("Enter the index of the element to remove: ");
                    if (scanner.hasNextInt()) {
                        int indexToRemove = scanner.nextInt();
                        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
                            arrayList.remove(indexToRemove); // Remove element
                            System.out.println("Element removed successfully.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next(); // Discard invalid input
                    }
                    break;

                case 5:
                    // Display all elements
                    System.out.println("All elements: " + arrayList);
                    break;

                case 6:
                    // Insert element at a specific index
                    System.out.print("Enter the index where you want to add the element: ");
                    if (scanner.hasNextInt()) {
                        int addIndex = scanner.nextInt();
                        if (addIndex >= 0 && addIndex <= arrayList.size()) {
                            System.out.print("Enter the element to add: ");
                            if (scanner.hasNextInt()) {
                                int element = scanner.nextInt();
                                arrayList.add(addIndex, element); // Insert element at index
                                System.out.println("Element added successfully.");
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                scanner.next(); // Discard invalid input
                            }
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next(); // Discard invalid input
                    }
                    break;

                case 7:
                    // Exit the program
                    System.out.println("Exiting program...");
                    scanner.close(); // Close the scanner
                    System.exit(0); // Terminate the program
                    break;

                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
