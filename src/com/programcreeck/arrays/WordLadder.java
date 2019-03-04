package com.programcreeck.arrays;

import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
/**
 * Created by gabriele on 20/10/17.
 *
 * Given two words (start and end), and a dictionary, find the length of shortest transformation sequence
 * from start to end, such that only one letter can be changed at a time and each intermediate word must exist
 * in the dictionary. For example, given:
 * start = "hit"
    end = "cog"
    dict = ["hot","dot","dog","lot","log", "cog"]
 One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", the program should return its length 5

 This is an exmple of breadth first search (BFS)
 *
 *
 */
public class WordLadder {
    String word;
    int numOfSteps;

    public WordLadder(String word, int numSteps){
        this.word = word;
        this.numOfSteps = numSteps;
    }

    public static final void main(String... args) {

        String beginWord = "hit";
        String endWord = "cog";
        Set<String> dictionary = new HashSet(Arrays.asList("hot","dot","dog","lot","log", "cog"));

        LinkedList<WordLadder> queue = new LinkedList<>();
        queue.add(new WordLadder(beginWord, 1));

    }
}
