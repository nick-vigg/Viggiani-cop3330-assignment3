package ex42;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParsingADataFileTest {

    @Test
    void fileTest() throws IOException {
        //given
        String filePath1 = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex42\\exercise42_input";
        ArrayList<Map<String, String>> nameList = Input.read(filePath1);
        //when
        String expected = "LAST       FIRST      SALARY\n" +
                "--------------------------------\n" +
                "Ling       Mai        $55900\n" +
                "Johnson    Jim        $56500\n" +
                "Jones      Aaron      $46000\n" +
                "Jones      Chris      $34500\n" +
                "Swift      Geoffrey   $14200\n" +
                "Xiong      Fong       $65000\n" +
                "Zarnecki   Sabrina    $51500\n";
        String actual = Input.print(nameList);
        //then
        assertEquals(actual, expected);
        //the test fails as a result of white space, I don
    }
    @Test
    void lengthTest() throws IOException{
        //given
        String filePath = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex42\\exercise42_input";
        ArrayList<Map<String, String>> nameList = Input.read(filePath);
        //when
        int expected = 7;
        int actual = nameList.size();
        //then
        assertEquals(expected, actual);
    }
}

