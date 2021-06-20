/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Nicholas Viggiani
 */
package ex45;

import java.util.Scanner;

public class Output {
    public static void main(String[] args)  {

        Scanner newScan = new Scanner(System.in);

        //Prompt and save the output file name.
        System.out.print("What is the name of your output file? ");
        String outputFileName = newScan.nextLine();

        //Create a text editor and set its attributes.
        WordFinder editor = new WordFinder();
        editor.fileName = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex45\\exercise45_input";
        editor.fileDestination = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex45\\" + outputFileName;
        editor.target = "utilize";
        editor.replacement = "use";

        //Run the function in the editor that writes and creates the new file.
        editor.replaceTextFile();


    }

}
