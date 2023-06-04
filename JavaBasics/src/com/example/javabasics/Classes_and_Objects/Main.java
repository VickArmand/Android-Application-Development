package com.example.javabasics.Classes_and_Objects;

/**
 * a class is a blueprint of an object or a way of describing
 * properties and functionalities or behaviors of a group of objects
 * for instance houses can have many common properties such as
 * roof type, number of windows, number of doors, walls type hence house will be the class
 *
 * Copy constructors are constructors that creates a copy of existing objects of the same class.
 * The original object and the copy are in different memory locations hence == is not good for testing equality of the objects
 * equals() method is used to test if an object is similar to another object
 * == is used to test if the objects share the same memory location
 */
public class Main {
    public static void main(String[] args) {
        House house = new House(6,6,"Tiles","Brick");
        House copyOfHouse = new House(house); // creating a copy of an object
        System.out.println(house.isSimilarObject(copyOfHouse)+'\n');// comparing equality of the objects
        System.out.println(house);

        Subject programming1 = new Subject("CS3201", "Object Oriented Programming");
        Subject programming2 = new Subject("CS3201", "Object Oriented Programming");
        String result = programming1.isSimilarObject(programming2) ? "Same objects" : "Different objects";
        System.out.println('\n'+result+'\n');
        System.out.println(programming1);

        Student student1 = new Student( "Jason Merkle", 1023456789);
        System.out.println(student1);
        System.out.println(student1.getStudentName());
        Student student2 = new Student( "James Merry", 102347760);
        Student student3 = new Student( "Jason Merkle", 1023456789);
        result = student1.isObjectEqual(student2) ? "Objects are equal" : "Objects are not equal";
        System.out.println(result);
        result = student1.isObjectEqual(student3) ? "Objects are equal" : "Objects are not equal";
        System.out.println(result);

        ExamPaper paper = new ExamPaper(programming1,student1,88);
        System.out.println(paper);
        System.out.println(paper.getSubject());
        System.out.println(paper.getSubject().getSubjectCode());
        System.out.println(paper.getSubject().getSubjectName());

    }
}
