package ex43;

import java.util.Scanner;

public class Ouput {
    public static void main(String[] args) {

        //Input
        Scanner newScan = new Scanner(System.in);

        String siteName;
        String author;
        String wantCSS;
        String wantJS;

        System.out.print("Site name: ");
        siteName = newScan.nextLine();
        System.out.print("Author: ");
        author = newScan.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        wantJS = newScan.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        wantCSS = newScan.nextLine();


        //Create a website generator
        WebsiteGenerator newWebsite = new WebsiteGenerator();

        //Set the attributes for the website
        newWebsite.siteName = siteName;
        newWebsite.author = author;
        newWebsite.path = "src/main/java/ex43/";

        //Create the website and the HTML file
        System.out.println("Created " + newWebsite.createWebsite());
        System.out.println("Created " + newWebsite.createHTMl());

        //Output

        //If user wants to create a JS and CSS folder
        if(wantJS.equals("y"))
            System.out.println("Created " + newWebsite.createJSFolder());

        if(wantCSS.equals("y"))
            System.out.println("Created " + newWebsite.createCSSFolder());

    }
}
