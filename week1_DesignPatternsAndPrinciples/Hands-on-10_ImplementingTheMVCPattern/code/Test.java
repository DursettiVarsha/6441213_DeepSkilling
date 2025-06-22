public class Test {
    public static void main(String[] args) {
        Student student = new Student("Ajay", "S12345", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Vijay");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
