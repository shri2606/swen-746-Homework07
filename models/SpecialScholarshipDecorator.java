package models;

public class SpecialScholarshipDecorator extends StudentDecorator {

    public SpecialScholarshipDecorator(Student decoratedStudent) {
        super(decoratedStudent);
    }

    @Override
    public void evaluate() {
        super.evaluate();
        if (decoratedStudent.getScore() >= 320) {
            System.out.println(decoratedStudent.getName() + " is eligible for the special scholarship.");
        } else {
            System.out.println(decoratedStudent.getName() + " is not eligible for the special scholarship.");
        }
    }
}
