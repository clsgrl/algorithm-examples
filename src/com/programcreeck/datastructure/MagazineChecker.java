package com.programcreeck.datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gabriele on 08/10/18.
 */
public class MagazineChecker {

    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> noteMap = new HashMap<>();

        for(String word : note) {
            if (noteMap.containsKey(word)) {
                int occurrence = noteMap.get(word);
                occurrence++;
                noteMap.put(word, occurrence);
            }
            else
                noteMap.put(word, 1);
        }

        for (String word : magazine) {
            if (noteMap.containsKey(word)) {
                int occurrence = noteMap.get(word);
                if (occurrence > 1) {
                    occurrence--;
                    noteMap.put(word, occurrence);
                } else {
                    noteMap.remove(word);
                }
            }
        }

        if (noteMap.size()==0) {
            System.out.println("Yes");
        } else System.out.println("No");

    }


    /**
     * 6 4
     *   give me one grand today night
     *   give one grand today
     * print yes
     *
     * @param args
     */
    public static void main(String... args) {

        String[] magazine = new String[]{"give", "me", "one", "grand", "today", "night"};
        String[] note = new String[]{"give", "me", "one", "grand", "today"};

        checkMagazine(magazine, note);

        magazine = new String[]{"two", "times", "three", "is", "not", "four"};
        note =  new String[]{"two", "times", "two", "is", "four"};

        checkMagazine(magazine, note);


    }
}
