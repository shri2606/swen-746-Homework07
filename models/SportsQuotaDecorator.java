package models;

public class SportsQuotaDecorator extends StudentDecorator {

    public SportsQuotaDecorator(Student decoratedStudent) {
        super(decoratedStudent);
    }

    @Override
    public void evaluate() {
        super.evaluate();
        if (decoratedStudent.getScore() >= 300) {
            System.out.println(decoratedStudent.getName() + " is eligible for the sports quota.");
        } else {
            System.out.println(decoratedStudent.getName() + " is not eligible for the sports quota.");
        }
    }
}
