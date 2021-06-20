/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Nicholas Viggiani
Exercise 46 - Word Frequency Finder
Knowing how often a word appears in a sentence or block of text is helpful
for creating word clouds and other types of word analysis. And it’s more useful when
running it against lots of text.

Create a program that reads in a file named `exercise46_input.txt` and counts the
frequency of words in the file. Then construct a histogram displaying the words and the frequency,
and display the histogram to the screen.

Example Output
Given the text file `exercise46_input.txt` with this content

badger badger badger
badger mushroom
mushroom snake badger badger
badger
the program would produce the following output:

badger:   *******
mushroom: **
snake:    *
Constraint
Ensure that the most used word is at the top of the report and the least used words are at the bottom.

 */
package ex46;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class WordFrequencyFinder {
    static WordFrequencyFinder app = new WordFrequencyFinder();
    static class WordData {
        String word;
        int wordCount;
    }
    public static void main(String[] args) {
        //get input as string
        String input = app.getInput();
        //count words in string
        ArrayList<WordData> wordList = app.countWords(input);
        //organize as histogram
        String output = app.getHistogram(wordList);
        //output histogram
        app.output(output);
    }
    //ensure input file works
    String getInput() {
        String input = null;
        File inputFile = new File("C:\\Users\\19172\\IdeaProjects\\BookExample1\\cop3330-as3\\src\\main\\java\\ex46\\exercise46_input");
        try {
            input = Files.readString(inputFile.toPath());
        }
        catch (Exception e)
        {
            System.out.print("File error.");
            System.exit(-1);
        }
        return input;
    }
    ArrayList<WordData> countWords(String input) {
        ArrayList<WordData> wordList = new ArrayList<>();
        Scanner in = new Scanner(input);
        WordData newWord;
        while(in.hasNext()) {
            newWord = new WordData();
            newWord.word = in.next();
            newWord.wordCount = 0;
            while (input.contains(newWord.word)) {
                input = input.replaceFirst(newWord.word, "");
                newWord.wordCount++;
            }
            wordList.add(newWord);
            in = new Scanner(input);
        }
        in.close();
        return wordList;
    }
    String getHistogram(ArrayList<WordData> wordList) {
        //sort array first
        Comparator<WordData> comparator = (o1, o2) -> o2.wordCount -  o1.wordCount;
        wordList.sort(comparator);
        String histogram = "";
        for(WordData wordElement : wordList) {
            String message = String.format("%-10s ", wordElement.word + ":");
            while (wordElement.wordCount > 0) {
                message = message.concat("*");
                wordElement.wordCount--;
            }
            histogram = histogram.concat(message + "\n");
        }
        return histogram;
    }
    void output(String message)
    {
        System.out.print(message);
    }
}

