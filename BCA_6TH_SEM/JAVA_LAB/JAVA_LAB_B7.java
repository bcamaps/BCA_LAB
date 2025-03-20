package JAVA_LAB_B7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class JAVA_LAB_B7 {
    public static void main(String[] args) {
        LinkedList<Integer> firstList = new LinkedList<>();
        LinkedList<Integer> secondList;
        Scanner in = new Scanner(System.in);
        char choice;
        int num, pos, fpos, spos;

        do {
            System.out.println("********** MENU **********");
            System.out.println("a. Insert an Element");
            System.out.println("b. Swap Elements");
            System.out.println("c. Iterate in Reverse");
            System.out.println("d. Compare the two LinkedLists");
            System.out.println("e. Convert to ArrayList");
            System.out.println("x. Exit");
            System.out.print("Enter your Choice: ");
            choice = in.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'a':
                    if (firstList.size() > 0) {
                        System.out.println("Elements in the List: " + firstList);
                    } else {
                        System.out.println("List is Empty");
                    }
                    System.out.println("Enter the Position: ");
                    pos = in.nextInt();
                    if (pos <= 0) {
                        System.out.println("Enter a positive number!!");
                    } else if ((firstList.size() > 0 && pos <= firstList.size() + 1) || pos == 1) {
                        System.out.print("Enter a number: ");
                        num = in.nextInt();
                        firstList.add(pos - 1, num);
                        System.out.println("Element " + num + " inserted at position " + pos);
                    } else {
                        System.out.println("Enter the proper Position!!!!");
                    }
                    break;
                case 'b':
                    System.out.println("Original List: " + firstList);
                    System.out.println("Enter the positions of elements to be swapped");
                    System.out.print("Enter First Element position: ");
                    fpos = in.nextInt();
                    System.out.print("Enter Second Element position: ");
                    spos = in.nextInt();
                    if (fpos <= 0 || spos <= 0) {
                        System.out.println("Error!! Enter Positive values!!");
                    } else if (fpos > firstList.size() || spos > firstList.size()) {
                        System.out.println("Error!! Enter Proper values!!");
                    } else {
                        int f = firstList.get(fpos - 1);
                        int s = firstList.get(spos - 1);
                        firstList.set(fpos - 1, s);
                        firstList.set(spos - 1, f);
                        System.out.println("Elements Swapped Successfully!!");
                        System.out.println("The List after swapping: " + firstList);
                    }
                    break;
                case 'c':
                    System.out.println("Given Original List: " + firstList);
                    System.out.print("Reversed List [ ");
                    for (Iterator<Integer> it = firstList.descendingIterator(); it.hasNext(); ) {
                        System.out.print(it.next() + " ");
                    }
                    System.out.println("]");
                    Collections.reverse(firstList);
                    System.out.println("Reversed List: " + firstList);
                    break;
                case 'd':
                    secondList = new LinkedList<>(firstList);
                    Collections.reverse(secondList);
                    if (firstList.equals(secondList)) {
                        System.out.println("Lists are equal!!!");
                    } else {
                        System.out.println("Lists are NOT equal!!!");
                    }
                    break;
                case 'e':
                    ArrayList<Integer> alist = new ArrayList<>(firstList);
                    System.out.println("Elements in the ArrayList: " + alist);
                    break;
                case 'x':
                    System.out.println("Thank You!!! Quitting from Menu!!!!!");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!!! Try again!!");
            }
        } while (true);
    }
}