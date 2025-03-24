package studentresultmvc;

public class StudentView {
    public void displayStudentDetails(StudentModel st) {        
        System.out.println("Student Details:");
        System.out.println("Student Name: " + st.getName());
        System.out.println("Student Roll No: " + st.getRollNo());
        System.out.println("Mark in Subject 1: " + st.getMarks1());
        System.out.println("Mark in Subject 2: " + st.getMarks2());
        System.out.println("Mark in Subject 3: " + st.getMarks3());
        System.out.println("Percentage: " + st.getPercentage()); // Fixed missing parentheses
        System.out.println("Grade: " + st.getGrade());
    }
}
