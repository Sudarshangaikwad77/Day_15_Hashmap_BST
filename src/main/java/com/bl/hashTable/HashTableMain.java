package com.bl.hashTable;

import java.util.LinkedList;

public class HashTableMain
 {
    public static void main(String[] args) {
        System.out.println("Welcome to Hash table problem solution.");
        String totalWords = "To be or not to be";
        String[] words = totalWords.split(" ");

        MyHashTable hashTable = new MyHashTable();

        for (String word : words) {
            hashTable.add(word);
        }

        for (String word : words) {
            int frequency = hashTable.get(word);
            System.out.println(word + ": " + frequency);
        }
    }
}
