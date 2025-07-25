package Tasks;

import model.Student;
import service.StudentService;

public class MainApp {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Student student = new Student("Alice", 101);
        StudentService service = new StudentService();

        service.saveStudent(student);
        service.printStudent();
    }
}

