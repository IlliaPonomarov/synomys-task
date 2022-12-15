package com.interview;

import java.io.IOException;
import java.util.Arrays;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class PageParser {
    
    private String definitionOfWordParse(String word) {

        Document html = null;
        String wordDefinition = "";


        try {
            html = Jsoup.connect("https://www.thesaurus.com/browse/" + word).get();
            Element section =  html.getElementsByClass("css-1fzg0m e1v16r9g0").first();
            wordDefinition = section.text();

        }  catch (HttpStatusException e1) {
            System.out.println("Word not found in dictionary" + e1);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        

        return wordDefinition;
    }

    public int repeatingOfWordInText(String word1, String word2) {
        int count = 0;
        String definition = definitionOfWordParse(word1);
        String[] words = definition.split(" ");
        System.out.println(Arrays.toString(words));

        for (String w : words) 
            if (w.toLowerCase().equals(word2) || w.toLowerCase().contains(word2))
                count++;
            
        return count;
    }
}
