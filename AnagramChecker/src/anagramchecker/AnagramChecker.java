package anagramchecker;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    //Program to find anagram
    //Two ways that can be followed tro find that two words are anagram or not
    //1.Sort those words
    //Compare those words or strings
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word_1 = scanner.nextLine();
        String word_2 = scanner.nextLine();
        
        if (anagramChecker(word_1, word_2)) {
            System.out.println("Word 1 : "+ word_1 +" and Word 2 : "+word_2+ " are anagram");
        }
        else{
            System.out.println("Word 1 : "+ word_1 +" and Word 2 : "+word_2+ " are not anagram");
        }
    }
    
    //Method will take thw two words that we scanned from the user
    //There are five seperate steps in the method
    //1.Make char array from those strings
    //2.Find the length of those two array
    //3.Check the two array length is same or not
    //4.Sort both the array
    //Finally loop through the array and check for match
    
    private static boolean anagramChecker(String word_1 , String word_2){
        char[] charArray_1 = word_1.toCharArray();
        char[] charArray_2 = word_2.toCharArray();
        int length_1= charArray_1.length;
        int length_2= charArray_2.length;
        
        if (length_1 != length_2) return false;
        
        //Now sorting the two array
        Arrays.sort(charArray_1);
        Arrays.sort(charArray_2);
        
        for (int start = 0; start < length_1; start++) {
            if (charArray_1[start] != charArray_2[start]) {
                return false;
            }
        }
        
        return true;
    }
}
