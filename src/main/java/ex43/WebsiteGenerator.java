/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Nicholas Viggiani
Exercise 43 - Website Generator
Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag
and the author in a <meta> tag.
Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.

Challenges
Implement this in a scripting language on Windows, OSX, and Linux.
Implement this as a web application that provides the specified site as a zip file.
 */
package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebsiteGenerator {
    //Create attributes of the website to be set by the user.
    String siteName;
    String author;
    String path;

    //Create function to create the website folder.
    public String createWebsite() {

        //Set our directory and create the file with that path
        String directory = path + siteName;
        File newFolder = new File(directory);

        //Create the folder and return the directory for testing purposes
        newFolder.mkdirs();
        return directory;


    }

    //Create function to create the JS folder
    public String createJSFolder() {

        //Set our directory and create the file with that path
        String directory = path + siteName + "/js";
        File newFolder = new File(directory);

        //Create the folder and return the directory for testing purposes
        newFolder.mkdirs();
        return directory;


    }

    //Create a function to create the CSS folder
    public String createCSSFolder() {

        //Set our directory and create the file with that path
        String directory = path + siteName + "/css";
        File newFolder = new File(directory);

        //Create the folder and return the directory for testing purposes
        newFolder.mkdirs();
        return directory;

    }

    //Create a function to create the HTML file
    public String createHTMl() {

        //Establish path
        String directory = path + siteName + "/index.html";

        //Create whatever is going to go inside the file
        String htmlContent = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";

        //Create the file
        File file = new File(directory);

        try {

            //Write on the file.
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;

            //Exit if any exceptions are found.
        } catch(Exception ex) {

            return "Failure";
        }

    }

}
