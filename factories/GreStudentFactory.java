package factories;

import models.Student;

public class GreStudentFactory implements StudentFactory {
    @Override
    public Student createStudent(String name, double score) {
        return new Student(name, (int) score, "GRE");  // GRE score as integer
    }
}
