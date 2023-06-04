package com.example.javabasics.Classes_and_Objects;

import java.util.Objects;

public class Student {
    private String studentName;
    private long studentNumber;
    public Student(String studentName, long studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
    public Student(Student student) //copy constructor
    {
        this.studentName = student.studentName;
        this.studentNumber = student.studentNumber;
    }

    @Override
    public String toString() {
        return "\tSTUDENT DETAILS\n---------------------\nStudent Number: "+studentNumber+"\nStudent Name: "+studentName+'\n';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public boolean isObjectEqual(Student objectCopy)
    {
        return Objects.equals(this.studentNumber, objectCopy.studentNumber)//or this.studentNumber == objectCopy.studentNumber
        && this.studentName.equals(objectCopy.studentName);
    }
}
