package org.example.streamapi;

import java.util.*;

public class MVP {
    private int[] numbers;

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)
        names.forEach(name -> System.out.println(name));
    }

    /*
        Given a List<Integers>, return a List<Integer> with even numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)
        return numbers.stream().filter(i -> i % 2 == 0).toList();
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */

    public int[] doubleInts(int[] numbers) {
        // Implement me :)
        return Arrays.stream(numbers).toArray();
    }

    /*
        Given a String, return a List<String>, all caps.
     */

    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        return input;
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        return null;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        return null;
    }
}