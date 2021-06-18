/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ex41;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static ArrayList<String> read(String filePath) throws IOException{
        // create a list to store names form file
        ArrayList<String> nameList = new ArrayList<>();
        // takes the file path to read
        File file = new File(filePath);
        // reads the file
        Scanner input = new Scanner(file);
        // if there is more text in input, add it to the nameList
        while (input.hasNext()){
            nameList.add(input.nextLine().trim());
        }
        return nameList;
    }
}
