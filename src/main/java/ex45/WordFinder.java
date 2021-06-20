/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Nicholas Viggiani
Exercise 45 - Word Finder
There will be times when you'll need to read in one file, modify it, and
then write a modified version of that file to a new file.

Given an input file named `exercise45_input.txt`, read the file and look for all
occurrences of the word utilize. Replace each occurrence with use. Write the modified file to a new file.

Example Output
Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".
The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".
Constraints
Prompt for the name of the output file.
Write the output to a new file.
 */
package ex45;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordFinder {

    //Create attributes to be set by a user
    String fileName;
    String fileDestination;
    String target;
    String replacement;

    //Create function that does the text editing.
    public String replaceTextFile() {

        //Save the path of the original and destination file and our Charset
        Path path = Paths.get(fileName);
        Path destinationPath = Paths.get(fileDestination);
        Charset charset = Charset.forName("UTF-8");

        //Use a scanner to read to origin file and a writer to write the new modified file.
        try {

            //Create a new writer and scanner with the correct paths to read a write into.
            BufferedWriter writer = Files.newBufferedWriter(destinationPath, charset);
            Scanner newScan = new Scanner(path, charset.name());

            //Create variable for the line we are reading.
            String currLine;

            //Keep scanning every line...
            while (newScan.hasNextLine()) {

                currLine = newScan.nextLine();

                //Replace the target word for the replacement.
                currLine = currLine.replaceAll(target, replacement);

                //Write to our new file.
                writer.write(currLine);
                writer.newLine();

            }

            //Close the scanner ans writer and return the success message.
            newScan.close();
            writer.close();
            return "Success";

        } catch (Exception ex) {

            //If there was an exception, then return failure.
            return "Failure";

        }
    }

}
