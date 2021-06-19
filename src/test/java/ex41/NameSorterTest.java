package ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {
    @Test
    void inputTest() throws IOException{
        //given
        String filePath = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex41\\exercise41_input";
        ArrayList<String> nameList = Input.read(filePath);
        Collections.sort(nameList);
        //when
        String expected = ("Johnson, Jim\n" +
                "Jones, Aaron\n" +
                "Jones, Chris\n" +
                "Ling, Mai\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong\n" +
                "Zarnecki, Sabrina\n");
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i < nameList.size(); i++){
            actual.append(nameList.get(i)).append("\n");
        }
        //when
        assertEquals(expected, actual.toString());
    }

}