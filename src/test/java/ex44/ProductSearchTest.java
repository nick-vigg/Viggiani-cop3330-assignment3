package ex44;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {
    @Test
    void jsonTest() {
        //given
        String filePath = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex44\\exercise44_input.json";
        ArrayList<Map<String, Object>> list = ProductSearch.read(filePath);

        //when
        String expected1 = "Name: Doodad | Price: 5.00 | Quantity: 10\r\n";
        String expected2 = "Name: Widget | Price: 25.00 | Quantity: 5\r\n";
        String expected3 = "Name: Thing | Price: 15.00 | Quantity: 5\r\n";
        String actual1 = ProductSearch.search(list, "doodad");
        String actual2 = ProductSearch.search(list, "widget");
        String actual3 = ProductSearch.search(list, "tHiNG");

        //then
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);

    }
}