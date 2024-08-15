
import Student.Student;


public class TestMVC {
     public static void main(String[] args) {
   
        Student model = new Student();
        model.setName("Abcd");
        model.setId("12345");
        model.setGrade("A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to manage the model and view
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Efgh");
        controller.setStudentGrade("A+");

        // Display updated student details
        controller.updateView();
    }
}
