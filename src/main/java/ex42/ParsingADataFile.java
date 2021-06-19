package ex42;

import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ParsingADataFile {

        public static void main(String[] args) throws IOException {
            String filePath = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex42\\exercise42_input";
            ArrayList<Map<String, String>> nameList = Input.read(filePath); //takes in list of maps containing first, last and salary of employees.
            //String output = file.print(nameList);

            System.out.println();
            //Collections.sort(nameList, new SortSalary()); //sorts based on salary

            String output = Input.print(nameList);
            System.out.println(output);
        }
    }

