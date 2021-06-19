package ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {
    String siteName = "Test";
    String path = "src/main/java/ex43/";

    @Test
    void createWebsiteTest() {
        //given
        String directory = path + siteName;
        //when
        String actual = directory;
        String expected = "src/main/java/ex43/Test";
        //then
        assertEquals(expected, actual);
    }

    @Test
    void createJSFolderTest() {
        //given
        String directory = path + siteName + "/js";
        //when
        String actual = directory;
        String expected = "src/main/java/ex43/Test/js";
        //then
        assertEquals(expected, actual);

    }

    @Test
    void createCSSFolderTest() {
        //given
        String directory = path + siteName + "/css";
        //then
        String actual = directory;
        String expected = "src/main/java/ex43/Test/css";
        //then
        assertEquals(expected, actual);
    }

    @Test
    void createHTMlTest() {
        //given
        String directory = path + siteName + "/index.html";
        //when
        String actual = directory;
        String expected = "src/main/java/ex43/Test/index.html";
        //then
        assertEquals(expected, actual);
    }
}