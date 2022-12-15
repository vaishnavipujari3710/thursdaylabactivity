//Author-Vaishnavi Balaji Pujari
//code to display the longest word in a text file.

package com.question2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWords {

     public static void main(String [ ] args) throws FileNotFoundException {
              new LongestWords().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("C:\\Activity\\longword.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
         System.out.println("\n"+longest_word+"\n");
            return longest_word;
            }
}