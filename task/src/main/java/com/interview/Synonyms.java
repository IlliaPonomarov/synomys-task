package com.interview;


public class Synonyms {

    private PageParser pageParser;

    public Synonyms() {
        this.pageParser = new PageParser();
    }

    // is two words synonyms
    public String isSynonyms(String word1, String word2) {

        int numberOfRepeat = pageParser.repeatingOfWordInText(word1.toLowerCase(), word2.toLowerCase());

        if (numberOfRepeat > 1 || word1.equals(word2))
            return "synonyms";

        return "different";
    }
    
}
