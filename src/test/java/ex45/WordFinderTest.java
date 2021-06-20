package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void replaceTextFileTest() {
        //given
        WordFinder editor = new WordFinder();
        editor.fileName = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex45\\exercise45_input";
        editor.fileDestination = "C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex45\\exercise45_output";
        editor.target = "utilize";
        editor.replacement = "use";
        //when
        String actual = editor.replaceTextFile();
        String expected = "Success";
        //then
        assertEquals(expected, actual);
    }
}