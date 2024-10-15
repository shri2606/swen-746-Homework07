import factories.GpaStudentFactory;
import factories.GreStudentFactory;
import factories.StudentFactory;
import models.SportsQuotaDecorator;
import models.SpecialScholarshipDecorator;
import models.Student;

public class RITScholarshipSystem {
    public static void main(String[] args) {
        // Factories for creating students
        StudentFactory greFactory = new GreStudentFactory();
        StudentFactory gpaFactory = new GpaStudentFactory();

        // Create GRE-based students
        Student student1 = greFactory.createStudent("Jake Miller", 312);
        Student student2 = greFactory.createStudent("Lindsay Smith", 308);

        // Create GPA-based students
        Student student3 = gpaFactory.createStudent("Mike Taylor", 3.75);
        Student student4 = gpaFactory.createStudent("Lance Myers", 3.2);

        // Decorate students with additional evaluations
        Student sportsStudent1 = new SportsQuotaDecorator(student1);
        Student specialScholarshipStudent1 = new SpecialScholarshipDecorator(sportsStudent1);

        Student sportsStudent3 = new SportsQuotaDecorator(student3);
        Student specialScholarshipStudent3 = new SpecialScholarshipDecorator(sportsStudent3);

        // Evaluate students
        specialScholarshipStudent1.evaluate();  // Jake with GRE + Sports Quota + Special Scholarship
        specialScholarshipStudent3.evaluate();  // Mike with GPA + Sports Quota + Special Scholarship

        student2.evaluate();  // Lindsay with GRE only
        student4.evaluate();  // Lance with GPA only
    }
}
