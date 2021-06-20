/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Nicholas Viggiani
Exercise 44 - Product Search
Pulling data from a file into a complex data structure makes parsing much simpler.
Many programming languages support the JSON format, a popular way of representing data.

Create a program that takes a product name as input and retrieves the current price
and quantity for that product. The product data is in a data file in the JSON format
and looks like this (you will create this file as `exercise44_input.json`):

{
    "products" : [
        {"name": "Widget", "price": 25.00, "quantity": 5 },
        {"name": "Thing", "price": 15.00, "quantity": 5 },
        {"name": "Doodad", "price": 5.00, "quantity": 10 }
    ]
}
Print out the product name, price, and quantity if the product is found.
If no product matches the search, state that no product was found and start over.

Example Output
What is the product name? iPad
Sorry, that product was not found in our inventory.
What is the product name? Galaxy
Sorry, that product was not found in our inventory.
What is the product name? Thing
Name: Thing
Price: 15.00
Quantity: 5
Constraints
The file is in the JSON format. Use a JSON parser to pull the values out of the file
(e.g. https://github.com/google/gson (Links to an external site.)).
If no record is found, prompt again.
 */
package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ProductSearch {
    public static ArrayList<Map<String, Object>> read(String filePath) {
        ArrayList<Map<String, Object>> returnList = new ArrayList<>();
        File file = new File(filePath); //reads file location into a file first.

        try {
            JsonElement element = JsonParser.parseReader(new FileReader(file)); //parses JSON file into a JSON element
            JsonObject object = element.getAsJsonObject(); //turns element into object to extract data

            //since products is an array in JSON file, it'll need to be a JsonArray
            JsonArray array = object.get("products").getAsJsonArray();

            for (JsonElement productElement : array) { //loop through all items in JsonArray
                JsonObject product = productElement.getAsJsonObject(); //turns parsed element into an object to extract data

                //extracts data into different variables
                String name = product.get("name").getAsString();
                Double price = product.get("price").getAsDouble();
                int quantity = product.get("quantity").getAsInt();

                //due to there being different variable types, Maps will have to be <String, Object>
                Map<String, Object> temp = new HashMap<>();
                //adds extracted values into Map
                temp.put("name", name);
                temp.put("price", price);
                temp.put("quantity", quantity);

                //adds Map into list to return
                returnList.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read JSON file. Try again.");
        }

        return returnList;
    }

    public static String search(ArrayList<Map<String, Object>> list, String name) {
        for (Map<String, Object> temp : list) {
            String tempName = (String) temp.get("name"); //needs to cast object to string before comparison
            if (tempName.equalsIgnoreCase(name)) {
                //returns product details if name matches.
                return String.format("Name: %s | Price: %.2f | Quantity: %d%n",
                        temp.get("name"), temp.get("price"), temp.get("quantity"));
            }
        }
        //returns error if product cannot be found.
        return "Product does not exist.";
    }
}
