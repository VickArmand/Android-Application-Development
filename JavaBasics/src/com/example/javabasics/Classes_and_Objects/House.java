package com.example.javabasics.Classes_and_Objects;

import java.util.Objects;

/**
 * a class is a blueprint of an object or a way of describing
 * properties and functionalities or behaviors of a group of objects
 * for instance houses can have many common properties such as
 * roof type, number of windows, number of doors, walls type hence house can be the class
 *
 * Copy constructors are constructors that creates a copy of existing objects of the same class
 */
public class House {
    private int noOfWindows;
    private int noOfDoors;
    private String roofType;
    private String wallType;
    /**
     * default constructors are those not created by the programmer but are provided by Java
     * they set the string class variables to null,boolean class variables to false,
     * numerical class variables to 0
     * they have no arguments/parameters
     * while a parametized constructor will look like the one below
     */
    public House(int noOfWindows, int noOfDoors, String roofType, String wallType) // constructor
    {
        this.noOfDoors = noOfDoors;
        this.noOfWindows = noOfWindows;
        this.roofType = roofType;
        this.wallType = wallType;
    }
    public House(House house) //copy constructor
    {
        this.noOfDoors = house.noOfDoors;
        this.noOfWindows = house.noOfWindows;
        this.roofType = house.roofType;
        this.wallType = house.wallType;
    }

    /**
     * this method compares objects by comparing each property of each one object against the other
     * @param copyOfObject - duplicate object
     * @return - string
     */
    public String isSimilarObject (House copyOfObject)
    {
        return Objects.equals(this.noOfWindows, copyOfObject.noOfWindows) && Objects.equals(this.noOfDoors, copyOfObject.noOfDoors) && this.roofType.equals(copyOfObject.roofType) && this.wallType.equals(copyOfObject.wallType) ? "Same objects" : "Different objects";

    }
    // getter method
    public int getNoOfDoors() {
        return noOfDoors;
    }
    // setter method or mutator method
    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
    // setter method or mutator method
    public void setNoOfWindows(int noOfWindows) {
        this.noOfWindows = noOfWindows;
    }
    // getter method
    public String getRoofType() {
        return roofType;
    }
    // setter method or mutator method
    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }
    // getter method
    public String getWallType() {
        return wallType;
    }
    // setter method or mutator method
    public void setWallType(String wallType) {
        this.wallType = wallType;
    }
    // getter method
    public int getNoOfWindows()
    {
        return noOfWindows;
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
        return "\tHOUSE DETAILS\n-----------------------\nNumber of Doors:  "+getNoOfDoors()+"\nNumber of Windows:  "+getNoOfWindows()+"\nType of Roof:  "+getRoofType()+"\nType of Wall:  "+getWallType()+"\n----------------------\n";
    }
}
