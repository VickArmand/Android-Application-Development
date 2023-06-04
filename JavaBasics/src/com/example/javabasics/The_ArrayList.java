package com.example.javabasics;

import java.util.ArrayList;

/**
 * Java arrays are of fixed size when initialized
 * hence they cannot grow or shrink
 * but arraylists are created with an initial size and
 * when the size is exceeded(adding values) it is automatically enlarged
 * and when objects are removed they shrink
 */
public class The_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();

        names.add("James");
        // another way of adding elements in an arraylist
        names.add(0,"Steve"); // adds an element to an arraylist at a specified index in this case it is index 1
        createListElement(names, "Kenneth");
        createListElement(names, "Gerald");
        createListElement(names, "Marcus");
        createListElement(names, "Boniface");
        System.out.println(names);
        editListElement(names, 2, "Martha");
        System.out.println(names);
        deleteListElement(names, 2);
        System.out.println(names);
        String nameToSearch = "Victor";
        System.out.println(isPresent(names, nameToSearch));
        nameToSearch = "Martha";
        System.out.println(isPresent(names, nameToSearch));
        nameToSearch = "steve";
        System.out.println(isPresent(names, nameToSearch));
        nameToSearch = "Steve";
        System.out.println(isPresent(names, nameToSearch));
        nameToSearch = "StEvE";
        System.out.println(isPresent(names, nameToSearch));
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    /**
     * this function searches whether an element is in the list
     * @param names - arraylist to be altered
     * @param nameToSearch - name to be searched in the list
     * @return - boolean value
     */
    public static boolean searchListElement(ArrayList<String> names, String nameToSearch) {
        boolean elementIsPresent = false;
        for (int i = 0; i < names.size(); i++)
            if(names.get(i).equalsIgnoreCase(nameToSearch)) //similar to if(names.get(i).toLowerCase().equals(nameToSearch.toLowerCase()))
            {
                elementIsPresent = true;
                break;
            }
        return elementIsPresent;
    }

    /**
     * this function presents output for searching if an element is present
     * @param names - arraylist to be altered
     * @param nameToSearch - name to be searched in the list
     * @return - string
     */
    public static String isPresent(ArrayList<String> names, String nameToSearch) {
        return searchListElement(names, nameToSearch) ? nameToSearch+" is present in list" : nameToSearch+" is not present in list";
    }
    /**
     * this method adds an element into the arraylist
     *
     * @param names - arraylist to be altered
     * @param name  - element to be added to the arraylist
     */
    public static void createListElement(ArrayList<String> names, String name) {
        names.add(name);
    }

    /**
     * this method updates an element in an arraylist
     *
     * @param names       - arraylist to be altered
     * @param index       - arraylist index of the element to be edited
     * @param updatedName - new value to be inserted to the list in place of the previous value
     */
    public static void editListElement(ArrayList<String> names, int index, String updatedName) {
        names.set(index,updatedName);
    }

    /**
     * this method deletes values in an arraylist provided the index
     *
     * @param names - arraylist to be altered
     * @param index - arraylist index of the element to be deleted
     */
    public static void deleteListElement(ArrayList<String> names, int index) {
        names.remove(index);
    }
}
