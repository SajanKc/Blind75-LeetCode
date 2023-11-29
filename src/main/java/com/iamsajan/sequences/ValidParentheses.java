package com.iamsajan.sequences;

import java.util.HashMap;
import java.util.Stack;

/*
DAY 7 : EASY
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
 1. Open brackets must be closed by the same type of brackets.
 2. Open brackets must be closed in the correct order.
 3. Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */
public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s1 = "()[]{}";
        String s2 = "]";
        System.out.println("Is valid parentheses: " + validParentheses.isValid(s1));
        System.out.println("Is valid parentheses: " + validParentheses.isValid(s2));
    }

    public boolean isValid(String s) {
        HashMap<Character, Character> bracesHash = new HashMap<>();
        bracesHash.put(')', '(');
        bracesHash.put('}', '{');
        bracesHash.put(']', '[');

        Stack<Character> bracesStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!bracesHash.containsKey(c)) { // opening bracket
                bracesStack.push(c);
            } else {
                if (bracesStack.isEmpty())
                    return false;

                if (bracesHash.get(c) != bracesStack.pop())
                    return false;
            }
        }
        return bracesStack.isEmpty();
    }
}
