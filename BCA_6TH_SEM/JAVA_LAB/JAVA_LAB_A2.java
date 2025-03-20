package JAVA_LAB_A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JAVA_LAB_A2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the list: ");
        ArrayList<Integer> allList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       
        System.out.println("Enter the elements in the list: ");
        for (int i = 0; i < size; i++) {
            allList.add(sc.nextInt());  // Auto boxing
        }
       
        System.out.println("The list is: " + allList);
       
        if (allList.size() < 2) {
            System.out.println("Insufficient elements to find second minimum and second maximum.");
            return;
        }
       
        Collections.sort(allList);
       
        int secMax = allList.get(size - 2);  // Auto unboxing
        int secMin = allList.get(1);  // Auto unboxing
       
        System.out.println("The second largest number is: " + secMax);
        System.out.println("The second minimum number is: " + secMin);
    }
}
