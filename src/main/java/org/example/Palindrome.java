package org.example;

public class Palindrome {

    private Palindrome() {

    }

    public static boolean isPalindrome(String text){
        final var chars = text.toCharArray();
        final var reversedChars = new StringBuilder();
        for (int i = 0, j = text.length()-1;  i<text.length();  i++, j-- ){
            reversedChars.append(chars[j]);
        }
        return text.equals(reversedChars.toString());
    }
}
