package models;

public class Student {
    protected String name;
    protected double score;
    protected String evaluationType;

    public Student(String name, double score, String evaluationType) {
        this.name = name;
        this.score = score;
        this.evaluationType = evaluationType;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getEvaluationType() {
        return evaluationType;
    }

    public void evaluate() {
        if (evaluationType.equals("GRE")) {
            if (score >= 310) {
                System.out.println(name + " is eligible for the scholarship based on GRE score.");
            } else {
                System.out.println(name + " is not eligible for the scholarship based on GRE score.");
            }
        } else if (evaluationType.equals("GPA")) {
            if (score >= 3.5) {
                System.out.println(name + " is eligible for the scholarship based on GPA.");
            } else {
                System.out.println(name + " is not eligible for the scholarship based on GPA.");
            }
        }
    }
}
