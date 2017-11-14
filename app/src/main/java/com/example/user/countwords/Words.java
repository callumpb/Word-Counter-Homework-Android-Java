package com.example.user.countwords;

/**
 * Created by user on 14/11/2017.
 */

public class Words {


    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }


}
