package com.example.javabasics.Classes_and_Objects;

/**
 * this class is meant to demonstrate the concept of aggregation
 * Aggregation is whereby an object of another class can access or
 * own another independent object of another class
 * It depicts a HAS-A relationship
 *
 */
public class ExamPaper {
    private Subject subject;
    private Student student;
    private int marks;

    public ExamPaper(Subject subject, Student student, int marks) {
        //in such instances we need to use copy constructors to prevent data leakage
        // rather than passing the memory reference of the object directly
        // because 3 variables will contain reference to the same object which will be very risky
        // hence the need to save another copy the object.
        this.subject = new Subject(subject);
        this.student = new Student(student);
        this.marks = marks;
    }

    public Subject getSubject() {
        return new Subject(subject);
    }

    public void setSubject(Subject subject) {
        this.subject = new Subject(subject);
    }

    public Student getStudent() {
        return new Student(student);
    }

    public void setStudent(Student student) {
        this.student = new Student(student);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\tSTUDENT RESULTS\n" +
                "-------------------------------------------\n"+
student+subject+"\tEXAM DETAILS\n-----------------------------------------\n"+
                "\nMarks=" + marks +
                "\n-----------------------------------------\n";
    }
}
