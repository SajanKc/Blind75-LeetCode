package com.iamsajan.sequences;

import java.util.HashMap;
import java.util.Map;

/*
DAY 6 : EASY
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String source = "bat";
        String target = "tak";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println("Is Anagram: " + validAnagram.isAnagram(source, target));
        System.out.println("Is Anagram Using Hash: " + validAnagram.isAnagramUsingHash(source, target));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int j : count) {
            if (j > 0)
                return false;
        }
        return true;
    }

    public boolean isAnagramUsingHash(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

}
