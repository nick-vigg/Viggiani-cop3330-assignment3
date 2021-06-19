package ex42;

import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.io.File;

public class Input {

    public static ArrayList<Map<String, String>> read(String filePath) throws IOException {
        ArrayList<Map<String, String>> nameList = new ArrayList<>();
        File file = new File(filePath);
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {
            Scanner lineIn = new Scanner(in.nextLine());
            lineIn.useDelimiter(",");
            Map<String, String> name = new HashMap<>();
            while (lineIn.hasNext()) {
                name.put("last", lineIn.next());
                name.put("first", lineIn.next());
                name.put("salary", lineIn.next());
            }
            nameList.add(name);
        }

        return nameList;
    }

    public static String print(ArrayList<Map<String, String>> nameList) {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%-10s %-10s %-10s\n", "LAST", "FIRST", "SALARY"));
        output.append(String.format("--------------------------------\n"));
        for (int i = 0; i < nameList.size(); i++) {
            Map<String, String> temp = nameList.get(i);
            output.append(String.format("%-10s %-10s $%-10s\n", temp.get("last"), temp.get("first"), temp.get("salary")));
        }
        return output.toString();
    }
}

