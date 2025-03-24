package studentresultmvc;

public class StudentModel {
    private String rollNo;
    private String name;
    private double marks1;
    private double marks2;
    private double marks3;
    private double percentage;
    private char grade;

    // Getter and Setter for rollNo
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for marks1
    public double getMarks1() {
        return marks1;
    }

    public void setMarks1(double marks1) {
        this.marks1 = marks1;
    }

    // Getter and Setter for marks2
    public double getMarks2() {
        return marks2;
    }

    public void setMarks2(double marks2) {
        this.marks2 = marks2;
    }

    // Getter and Setter for marks3
    public double getMarks3() {
        return marks3;
    }

    public void setMarks3(double marks3) {
        this.marks3 = marks3;
    }

    // Getter for percentage
    public double getPercentage() {
        return percentage;
    }

    // Getter for grade
    public char getGrade() {
        return grade;
    }

    // Method to calculate grade and result
    public void calculateResultGrade() {
        double totalMarks = marks1 + marks2 + marks3;
        percentage = (totalMarks / 300) * 100;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'E';
    }
}
