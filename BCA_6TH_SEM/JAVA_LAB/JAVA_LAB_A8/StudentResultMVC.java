package studentresultmvc;

import java.util.Scanner;

public class StudentResultMVC {
    public static void main(String[] args) {
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Student Roll No: ");
        String rollNo = in.next();

        System.out.println("Enter the Student Name: ");
        String name = in.next();  // Fixed typo (Steing → String)

        System.out.println("Enter the mark1:");
        double m1 = in.nextDouble();

        System.out.println("Enter the mark2:");
        double m2 = in.nextDouble();

        System.out.println("Enter the mark3:");
        double m3 = in.nextDouble();

        controller.setStudentDetails(rollNo, name, m1, m2, m3);
        controller.calculateResultGrade();
        controller.displayStudentDetails();  // Fixed incorrect syntax

        in.close(); // Close scanner to prevent resource leak
    }
}
