package models;

public abstract class StudentDecorator extends Student {
    protected Student decoratedStudent;

    public StudentDecorator(Student decoratedStudent) {
        super(decoratedStudent.getName(), decoratedStudent.getScore(), decoratedStudent.getEvaluationType());
        this.decoratedStudent = decoratedStudent;
    }

    @Override
    public void evaluate() {
        decoratedStudent.evaluate();
    }
}
