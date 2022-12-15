package com.interview;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class SynonymTest {

    private static List<String> words1;
    private static List<String> words2 ;
    private static List<String> expected;
    private static  String pathToTestFileOfSynonyms = "src/test/java/com/interview/testFiles/example_big.in";
    private static  String pathToTestFileOfExceptedResults= "src/test/java/com/interview/testFiles/example_big.out";

    @BeforeClass
    public static void readOfTestFiles() {
        // read from file
        File fileOfSynonyms = new File(pathToTestFileOfSynonyms);
        BufferedReader bufferReaderForSynonymFile = null;

        File fileOfExpectedResults = new File(pathToTestFileOfExceptedResults);
        BufferedReader bufferReaderForExceptedResultsFile = null;


        words1 = new ArrayList<>();
        words2 = new ArrayList<>();
        expected = new ArrayList<>();

        try {
            bufferReaderForExceptedResultsFile = new BufferedReader(new FileReader(fileOfExpectedResults));
            String exceptedAnswer = "";

            while ((exceptedAnswer = bufferReaderForExceptedResultsFile.readLine()) != null)
                expected.add(exceptedAnswer);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            bufferReaderForSynonymFile = new BufferedReader(new FileReader(fileOfSynonyms));
            String sentence = "";

            while ((sentence = bufferReaderForSynonymFile.readLine()) != null) {
                if(!sentence.contains(" "))
                    continue;
                String[] words = sentence.split(" ");
                words1.add(words[0]);
                words2.add(words[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Test
    public void testSynonyms() {
        Synonyms synonyms = new Synonyms();

        for (int i = 0; i < words1.size(); i++) 
            assertEquals(expected.get(i), synonyms.isSynonyms(words1.get(i), words2.get(i)));
        
        
    }
    
}
