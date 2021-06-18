/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Nicholas Viggiani
Exercise 41 - Name Sorter
Alphabetizing the contents of a file, or sorting its contents, is a great way to get
comfortable manipulating a
file in your program.

Create a program that reads in the following list of names from a file called `
* exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt`
that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina
Constraint
Don't hard-code the number of names.
 */
package ex41;

import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

public class NameSorter {
    public static void main(String[] args) throws IOException {
        //sets the file path
        String filePath = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex41\\exercise41_input";
        //arrayList initialized with the names from the file
        ArrayList<String> nameList = Input.read(filePath);
        //sorts the list
        Collections.sort(nameList);
        //Prints output
        System.out.println(String.format("Total of %d names", nameList.size()));
        System.out.println("-----------------");
        for (int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
    }

}
