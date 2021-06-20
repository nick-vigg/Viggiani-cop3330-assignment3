package ex46;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {

    WordFrequencyFinder app = new WordFrequencyFinder();

    @Test
    void getHistogram_correctly_organizes_data() {
        ArrayList<WordFrequencyFinder.WordData> wordList = new ArrayList<>();
        WordFrequencyFinder.WordData newWord = new WordFrequencyFinder.WordData();
        newWord.word = "badger";
        newWord.wordCount = 7;
        wordList.add(newWord);
        String results = app.getHistogram(wordList);

        String expected = """
                badger:    *******
                """;
        assertEquals(expected, results);
    }

    @Test
    void countWords_organizes_input_as_list_of_wordData() {
        ArrayList<WordFrequencyFinder.WordData> expected = new ArrayList<>();
        WordFrequencyFinder.WordData newWord = new WordFrequencyFinder.WordData();
        newWord.word = "badger";
        newWord.wordCount = 5;
        expected.add(newWord);

        String input = "badger badger badger badger badger";
        ArrayList<WordFrequencyFinder.WordData> results = app.countWords(input);
        assertEquals(expected.get(0).wordCount, results.get(0).wordCount);
    }

}
