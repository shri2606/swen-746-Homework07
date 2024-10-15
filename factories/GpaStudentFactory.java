package factories;

import models.Student;

public class GpaStudentFactory implements StudentFactory {
    @Override
    public Student createStudent(String name, double score) {
        return new Student(name, score, "GPA");  // GPA as double
    }
}
