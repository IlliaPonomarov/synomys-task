package com.interview;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numberOfCases = 0;
        int numberOfQueries = 0;
        int currQueries = 0;
        Synonyms synonyms = null;
        String sentence = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of cases:");
        numberOfCases = scanner.nextInt();

        System.out.println("Enter number of queries:");
        numberOfQueries = scanner.nextInt();

        if( numberOfCases < 0 || numberOfCases > 100) {
            System.out.println("Number of cases must be between 0 and 100");
            return;
        }

        if( numberOfQueries < 0 || numberOfQueries > 100) {
            System.out.println("Number of queries must be between 0 and 100");
            return;
        }

        synonyms = new Synonyms(numberOfCases, numberOfQueries);
       // System.out.println(synonyms.isSynonyms("balance", "underground"));

        

        for (int i = 0; i < numberOfCases; i++) {

            
            if (numberOfQueries == currQueries){
                scanner = new Scanner(System.in);
                numberOfQueries = scanner.nextInt();
                currQueries = 0;
            }
            sentence = new Scanner(System.in).nextLine();
            try {
                String[] words = sentence.split(" ");
                System.out.println(synonyms.isSynonyms(words[0], words[1]));
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Correct format of sentence: word1 word2");
                exception.printStackTrace();
            }
            currQueries++;
        }

        


    }
}
