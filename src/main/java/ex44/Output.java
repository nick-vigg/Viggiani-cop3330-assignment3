/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Nicholas Viggiani
 */
package ex44;

import java.util.Scanner;
import java.util.*;

public class Output {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex44\\exercise44_input.json";
        Scanner in = new Scanner(System.in);
        String user;

        //list of maps of items read of JSON file will be created first.
        ArrayList<Map<String, Object>> list =ProductSearch.read(filePath);

        //program will loop to ask user for product name until a product is found
        do {
            System.out.print("Enter a product name: ");
            String name = in.nextLine().trim(); //takes in and trims any excess whitespace for user input.
            user = ProductSearch.search(list, name); //passes user input and JSON list to search
            System.out.println(user); //prints results
        } while (user.equals("Product does not exist."));
    }
}
