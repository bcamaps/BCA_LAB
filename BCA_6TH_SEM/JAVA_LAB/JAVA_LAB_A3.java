package JAVA_LAB_A3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JAVA_LAB_A3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add elements");
            System.out.println("2. Sort elements");
            System.out.println("3. Replace an element");
            System.out.println("4. Remove an element");
            System.out.println("5. Display all elements");
            System.out.println("6. Add an element between two elements");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    if (scanner.hasNextInt()) {
                        int elementToAdd = scanner.nextInt();
                        arrayList.add(elementToAdd);
                        System.out.println("Element added successfully.");
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next();
                    }
                    break;
                case 2:
                    Collections.sort(arrayList);
                    System.out.println("Elements sorted successfully.");
                    break;
                case 3:
                    System.out.print("Enter the index of the element to replace: ");
                    if (scanner.hasNextInt()) {
                        int index = scanner.nextInt();
                        if (index >= 0 && index < arrayList.size()) {
                            System.out.print("Enter the new element: ");
                            if (scanner.hasNextInt()) {
                                int newElement = scanner.nextInt();
                                arrayList.set(index, newElement);
                                System.out.println("Element replaced successfully.");
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                scanner.next();
                            }
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next();
                    }
                    break;
                case 4:
                    System.out.print("Enter the index of the element to remove: ");
                    if (scanner.hasNextInt()) {
                        int indexToRemove = scanner.nextInt();
                        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
                            arrayList.remove(indexToRemove);
                            System.out.println("Element removed successfully.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next();
                    }
                    break;
                case 5:
                    System.out.println("All elements: " + arrayList);
                    break;
                case 6:
                    System.out.print("Enter the index where you want to add the element: ");
                    if (scanner.hasNextInt()) {
                        int addIndex = scanner.nextInt();
                        if (addIndex >= 0 && addIndex <= arrayList.size()) {
                            System.out.print("Enter the element to add: ");
                            if (scanner.hasNextInt()) {
                                int element = scanner.nextInt();
                                arrayList.add(addIndex, element);
                                System.out.println("Element added successfully.");
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                scanner.next();
                            }
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next();
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}