package factories;

import models.Student;

public interface StudentFactory {
    Student createStudent(String name, double score);
}
