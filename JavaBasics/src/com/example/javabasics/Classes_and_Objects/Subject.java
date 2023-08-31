package com.example.javabasics.Classes_and_Objects;

public class Subject {
    private String subjectCode;

    public String getSubjectCode() {
        return this.subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    private String subjectName;
    public Subject(String subjectCode, String subjectName) // parametized constructor
    {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    /**
     * Copy constructors are constructors that creates a copy of existing objects of the same class
     * @param subject - object copy
     */
    public Subject(Subject subject) // copy constructor
    {
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;
    }

    /**
     * this method compares objects by comparing each property of each one object against the other
     * @param subjectObjectCopy - copy of the object of same class
     * @return - boolean value
     */
    public boolean isSimilarObject (Subject subjectObjectCopy)
    {
        return this.subjectCode.equals(subjectObjectCopy.subjectCode) && this.subjectName.equals(subjectObjectCopy.subjectName);
    }
    /**
     * this method is used to print object details in a more representable manner(describes the object)
     * as opposed to printing in the format
     * package class memory address
     * which is not easily understandable
     * @return - string
     */
    @Override
    public String toString() {
        return "\tSUBJECT DETAILS\n-----------------------\nSubject Code:  "+subjectCode+"\nSubject Name:  "+subjectName+"\n----------------------\n";
    }
}
