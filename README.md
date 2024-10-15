# swen-746-Homework07
# RIT Scholarship System

### Overview
This mini-project demonstrates the use of both **Factory Method** and **Decorator** design patterns. The RIT Scholarship System is based on Java and evaluates scholarships for incoming students based on their GRE scores or GPAs. Additionally, it dynamically adds extra evaluations such as eligibility for sports quotas and special scholarships using the **Decorator** pattern.

### Features
- **Factory Method**: Handles the creation of different types of students (GRE-based or GPA-based) using dedicated factories.
- **SportsQuotaDecorator**: Dynamically evaluates whether a student is eligible for a sports quota, based on their score.
- **SpecialScholarshipDecorator**: Adds an additional special scholarship evaluation for students who meet specific score criteria.

### Classes

1. **Student**:
   - Represents the details of a student, including their name, score (GRE or GPA), and the type of evaluation (GRE/GPA).
   - Contains the core evaluation logic for determining scholarship eligibility based on GRE scores or GPA.
   
2. **StudentFactory**:
   - Defines the interface for creating `Student` objects. The factory method `createStudent()` takes the student's name and score and returns a `Student` object.

3. **GreStudentFactory**:
   - Implements `StudentFactory` to create `Student` objects evaluated based on GRE scores.
   
4. **GpaStudentFactory**:
   - Implements `StudentFactory` to create `Student` objects evaluated based on GPA.

5. **StudentDecorator**:
   - An abstract class that extends `Student` to allow additional responsibilities (like sports quota or special scholarship evaluation) to be dynamically added to the student.
   
6. **SportsQuotaDecorator**:
   - Extends `StudentDecorator` to check if the student is eligible for a sports quota. If the student has a score above 300, they are eligible for the quota.
   
7. **SpecialScholarshipDecorator**:
   - Extends `StudentDecorator` to check if the student is eligible for a special scholarship. If the student has a score above 320, they are eligible for the special scholarship.

### Usage
1. **Instantiate Student Objects**:
   - Use `GreStudentFactory` to create students based on GRE scores.
   - Use `GpaStudentFactory` to create students based on GPA.

2. **Apply Decorators**:
   - Wrap the `Student` objects with the `SportsQuotaDecorator` to evaluate if they qualify for the sports quota.
   - Further wrap the student with `SpecialScholarshipDecorator` to check for special scholarship eligibility.

3. **Evaluation**:
   - Call the `evaluate()` method on the student to calculate their eligibility for scholarships and bonuses.
   
### Example

```java
// Create a GRE-based student
StudentFactory greFactory = new GreStudentFactory();
Student student1 = greFactory.createStudent("Jake Miller", 312);

// Decorate with additional evaluations
Student sportsStudent1 = new SportsQuotaDecorator(student1);
Student specialScholarshipStudent1 = new SpecialScholarshipDecorator(sportsStudent1);

// Evaluate the student
specialScholarshipStudent1.evaluate();
```
### How it Works
   - The **Factory Method** ensures that the system can easily create different types of students without modifying the core logic.
   - The **Decorator Pattern** allows you to add multiple layers of evaluation (e.g., sports quota and special scholarship) dynamically, enhancing the flexibility and scalability of the system.
