package studentresultmvc;

public class StudentController {
    private final StudentModel model;
    private final StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentDetails(String rollNo, String name, double m1, double m2, double m3) {
        model.setRollNo(rollNo);  // Fixed incorrect variable name (rollno → rollNo)
        model.setName(name);
        model.setMarks1(m1);
        model.setMarks2(m2);
        model.setMarks3(m3);
    }

    public void calculateResultGrade() {
        model.calculateResultGrade();
    }

    public void displayStudentDetails() {
        view.displayStudentDetails(model);
    }
}
